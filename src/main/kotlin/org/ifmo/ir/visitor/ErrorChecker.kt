package org.ifmo.ir.visitor

import org.ifmo.ir.nodes.*
import org.ifmo.ir.nodes.Function

data class EvalContext(
        val functions: Map<Identifier, MutableSet<Function>> = mapOf(),
        val variables: Set<Identifier> = setOf()
)

class ErrorChecker : IRVisitor<EvalContext, Unit> {
    private fun EvalContext.copyToMutable() =
            Pair(functions.toMutableMap(), variables.toMutableSet())

    override fun visitBlock(block: Block, context: EvalContext) {
        val (functions, variables) = context.copyToMutable()

        for (node in block.nodes) {
            if (node is Function) {
                if (node.id !in functions) {
                    functions[node.id] = mutableSetOf()
                }

                val overloads = functions[node.id]!!
                val overloadWithSameParams = overloads.find {
                    it.parameterNames.size == node.parameterNames.size
                }

                if (overloadWithSameParams != null) {
                    throw TODO("function already exists")
                }

                overloads.add(node)
            }

            node.accept(this, EvalContext(functions, variables))

            if (node is VarDefinition) {
                variables.add(node.id)
            }
        }
    }

    override fun visitFunction(function: Function, context: EvalContext) {
        val (functions, variables) = context.copyToMutable()

        for (variable in function.parameterNames) {
            variables.add(variable)
        }

        function.block.accept(this, EvalContext(functions, variables))
    }

    override fun visitWhile(`while`: While, context: EvalContext) {
        `while`.condition.accept(this, context)
        `while`.block.accept(this, context)
    }

    override fun visitIf(`if`: If, context: EvalContext) {
        `if`.condition.accept(this, context)
        `if`.block.accept(this, context)
    }

    override fun visitAssignment(assignment: Assignment, context: EvalContext) {
        assignment.id.accept(this, context)

        if (assignment.id !in context.variables) {
            throw TODO("cannot find variable")
        }

        assignment.expression.accept(this, context)
    }

    override fun visitVarDefinition(varDefinition: VarDefinition, context: EvalContext) {
        varDefinition.expression.accept(this, context)
    }

    override fun visitReturn(`return`: Return, context: EvalContext) {
        `return`.expression.accept(this, context)
    }


    override fun visitFunctionCall(functionCall: FunctionCall, context: EvalContext) {
        if (functionCall.name !in context.functions) {
            throw TODO("cannot find function ${functionCall.name}")
        }

        val overloads = context.functions[functionCall.name]!!
        val callCandidate = overloads.find {
            it.parameterNames.size == functionCall.parameters.size
        }

        if (callCandidate == null) {
            throw TODO("cannot find function ${functionCall.name}")
        }

        for (node in functionCall.parameters) {
            node.accept(this, context)
        }
    }

    override fun visitIdentifier(identifier: Identifier, context: EvalContext) {
        if (identifier !in context.variables && identifier !in context.functions) {
            throw TODO("cannot find variable $identifier")
        }
    }

    override fun visitBinaryExpression(binaryExpression: BinaryExpression, context: EvalContext) {
        binaryExpression.leftOperand.accept(this, context)
        binaryExpression.rightOpeand.accept(this, context)
    }


    override fun visitOperator(operator: Operator, context: EvalContext) {}
    override fun visitLiteral(literal: Literal, context: EvalContext) {}
    override fun visitPrintln(println: Println, context: EvalContext) {}
}
