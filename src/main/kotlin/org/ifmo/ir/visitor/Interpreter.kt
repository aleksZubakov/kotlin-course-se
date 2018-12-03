package org.ifmo.ir.visitor

import org.ifmo.ir.nodes.*
import org.ifmo.ir.nodes.Function
import java.io.OutputStream

data class InterpreterContext(
        val functionMap: Map<Identifier, MutableSet<Function>> = mapOf(),
        val variableMap: Map<Identifier, Int> = mapOf(),

        /**
         * List of variables which already was at @variableMap and
         * changed in current scope
         */
        val newVariables: Set<Identifier> = emptySet(),

        /**
         * @evaluationResult represents register which stores result
         * of evaluation, in our case result can be only of Int type.
         * @evaluationResult equals null if there is nothing to return
         */
        val evaluationResult: Int? = null,

        /**
         * @returned equals true if in nested block was evaluated return expression
         */
        val returned: Boolean = false
)

class Interpreter(val outputStream: OutputStream) : IRVisitor<InterpreterContext, InterpreterContext> {
    private fun InterpreterContext.unpackScopeTableToMutable() =
            Pair(functionMap.toMutableMap(), variableMap.toMutableMap())

    private fun InterpreterContext.mergeChanges(newContext: InterpreterContext): InterpreterContext {
        val changedVariables = newContext.variableMap.filter { (id, _) ->
            !newContext.newVariables.contains(id)
        }

        val finalVariableMap = this.variableMap.toMutableMap()
        finalVariableMap.putAll(changedVariables)
        return InterpreterContext(this.functionMap, finalVariableMap, evaluationResult = newContext.evaluationResult,
                returned = newContext.returned)
    }


    override fun visitBlock(block: Block, context: InterpreterContext): InterpreterContext {
        var newContext = context
        for (node in block.nodes) {
            newContext = node.accept(this, newContext)

            if (node is Return || newContext.returned) {
                break
            }
        }

        return newContext
    }

    override fun visitFunction(function: Function, context: InterpreterContext): InterpreterContext {
        val newFunctionMap = context.functionMap.toMutableMap()
        if (function.id !in newFunctionMap) {
            newFunctionMap[function.id] = mutableSetOf()
        }

        newFunctionMap[function.id]!!.add(function)

        return with(context) {
            InterpreterContext(
                    newFunctionMap,
                    variableMap,
                    newVariables,
                    evaluationResult,
                    returned
            )

        }

    }

    override fun visitWhile(`while`: While, context: InterpreterContext): InterpreterContext {
        var newContext = context
        while (true) {
            newContext = `while`.condition.accept(this, newContext)
            if (newContext.evaluationResult == null) {
                throw TODO("interpreter exception")
            }

            if (newContext.evaluationResult == 0) {
                break
            }

            `while`.block.accept(this, newContext)
        }

        val changedVariables = newContext.variableMap.filter { (id, _) ->
            !newContext.newVariables.contains(id)
        }

        val finalVariableMap = context.variableMap.toMutableMap()
        finalVariableMap.putAll(changedVariables)

        return InterpreterContext(newContext.functionMap, finalVariableMap, returned = newContext.returned)

    }

    override fun visitIf(`if`: If, context: InterpreterContext): InterpreterContext {
        var newContext = `if`.condition.accept(this, context)

        if (newContext.evaluationResult == null) {
            throw TODO("interpreter exception")
        }

        if (newContext.evaluationResult == 0) {
            `if`.elseBlock?.let {
                newContext = it.accept(this, newContext)
            }
        } else {
            newContext = `if`.block.accept(this, newContext)
        }

        return context.mergeChanges(newContext)
    }

    override fun visitAssignment(assignment: Assignment, context: InterpreterContext): InterpreterContext {
        val newContext = assignment.expression.accept(this, context)

        if (newContext.evaluationResult == null) {
            throw TODO("interpreter exception")
        }

        val newVariableMap = context.variableMap.toMutableMap()
        newVariableMap[assignment.id] = newContext.evaluationResult!!

        return InterpreterContext(context.functionMap, newVariableMap)
    }

    override fun visitVarDefinition(varDefinition: VarDefinition, context: InterpreterContext): InterpreterContext {
        val newContext = varDefinition.expression.accept(this, context)
        if (newContext.evaluationResult == null) {
            throw TODO("interpreter exception")
        }

        val (functions, variables) = context.unpackScopeTableToMutable()
        variables[varDefinition.id] = newContext.evaluationResult

        val newVariables = context.newVariables + varDefinition.id

        return InterpreterContext(functions, variables, newVariables)
    }

    override fun visitReturn(`return`: Return, context: InterpreterContext): InterpreterContext {

        val newContext = `return`.expression.accept(this, context)

        return with(newContext) {
            InterpreterContext(
                    functionMap,
                    variableMap,
                    newVariables,
                    evaluationResult,
                    returned = true
            )
        }
    }

    override fun visitOperator(operator: Operator, context: InterpreterContext): InterpreterContext =
            context

    override fun visitFunctionCall(functionCall: FunctionCall, context: InterpreterContext): InterpreterContext {
        val overloads = context.functionMap[functionCall.name]!!
        val functionToCall = overloads.find { it.parameterNames.size == functionCall.parameters.size }!!

        val values = functionCall.parameters.map {
            it.accept(this, context)
                    .evaluationResult ?: throw TODO("interpreter exception")
        }

        val variableMapForCall = context.variableMap + (functionToCall.parameterNames zip values)

        val newContext = functionToCall.block.accept(
                this, InterpreterContext(context.functionMap, variableMapForCall)
        )

        return context.mergeChanges(
                InterpreterContext(newContext.functionMap,
                        newContext.variableMap,
                        functionToCall.parameterNames.toSet(),
                        newContext.evaluationResult)
        )

    }

    override fun visitIdentifier(identifier: Identifier, context: InterpreterContext): InterpreterContext = with(context) {
        InterpreterContext(
                functionMap,
                variableMap,
                newVariables,
                variableMap[identifier]!!
        )
    }


    override fun visitLiteral(literal: Literal, context: InterpreterContext): InterpreterContext = with(context) {
        InterpreterContext(
                functionMap,
                variableMap,
                newVariables,
                literal.value
        )
    }


    override fun visitBinaryExpression(binaryExpression: BinaryExpression, context: InterpreterContext): InterpreterContext {
        fun Boolean.toInt() = if (this) 1 else 0
        fun Int.toBool() = this != 0

        val leftContext = binaryExpression.leftOperand.accept(this, context)
        val rightContext = binaryExpression.rightOpeand.accept(this, context)

        if (leftContext.evaluationResult == null || rightContext.evaluationResult == null) {
            throw TODO("interpreter exception")
        }

        val l = leftContext.evaluationResult!!
        val r = rightContext.evaluationResult!!

        val evalResult = when (binaryExpression.operator.operator) {
            OperatorType.AND -> (l.toBool() && r.toBool()).toInt()
            OperatorType.OR -> (l.toBool() || r.toBool()).toInt()
            OperatorType.GREATER -> (l > r).toInt()
            OperatorType.GREQUAL -> (l >= r).toInt()
            OperatorType.LESS -> (l < r).toInt()
            OperatorType.LEQUAL -> (l <= r).toInt()
            OperatorType.EQUAL -> (l == r).toInt()
            OperatorType.NOTEQUAL -> (l == r).toInt()
            OperatorType.ASTERISK -> l * r
            OperatorType.DIVISION -> l / r
            OperatorType.MINUS -> l - r
            OperatorType.PLUS -> l + r
            OperatorType.MOD -> l % r
        }


        return with(context) {
            InterpreterContext(
                    functionMap,
                    variableMap,
                    newVariables,
                    evalResult
            )
        }
    }

    override fun visitPrintln(println: Println, context: InterpreterContext): InterpreterContext {
        for (v in println.params) {
            val accept = v.accept(this, context)
            outputStream.write(accept.evaluationResult.toString().toByteArray())
        }
        outputStream.write("\n".toByteArray())
        return context
    }
}