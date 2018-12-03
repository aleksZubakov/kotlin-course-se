package org.ifmo.ir.visitor

import org.ifmo.ir.nodes.*
import org.ifmo.ir.nodes.Function

interface IRVisitor<T, D> {
    fun visitBlock(block: Block, context: T): D
    fun visitFunction(function: Function, context: T): D

    fun visitWhile(`while`: While, context: T): D
    fun visitIf(`if`: If, context: T): D
    fun visitAssignment(assignment: Assignment, context: T): D
    fun visitVarDefinition(varDefinition: VarDefinition, context: T): D

    fun visitReturn(`return`: Return, context: T): D
    fun visitOperator(operator: Operator, context: T): D

    fun visitPrintln(println: Println, context: T): D

    /* expressions */
    fun visitFunctionCall(functionCall: FunctionCall, context: T): D
    fun visitIdentifier(identifier: Identifier, context: T): D
    fun visitLiteral(literal: Literal, context: T): D
    fun visitBinaryExpression(binaryExpression: BinaryExpression, context: T): D
}