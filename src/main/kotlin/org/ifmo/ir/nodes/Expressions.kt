package org.ifmo.ir.nodes

import org.ifmo.ir.visitor.IRVisitor

// EXPRESSION = FUNCTION_CALL | BINARY_EXPRESSION | IDENTIFIER | LITERAL | "(" EXPRESSION ")"
sealed class Expression : IRNode

class BinaryExpression(val leftOperand: Expression,
                       val rightOpeand: Expression,
                       val operator: Operator) : Expression() {
    override fun <T, D> accept(visitor: IRVisitor<T, D>, context: T): D =
            visitor.visitBinaryExpression(this, context)
}

class FunctionCall(val name: Identifier, val parameters: List<Expression>) : Expression() {
    override fun <T, D> accept(visitor: IRVisitor<T, D>, context: T): D =
            visitor.visitFunctionCall(this, context)
}

class Identifier(val id: String) : Expression() {
    override fun <T, D> accept(visitor: IRVisitor<T, D>, context: T): D =
            visitor.visitIdentifier(this, context)
}

class Literal(val value: Int) : Expression() {
    override fun <T, D> accept(visitor: IRVisitor<T, D>, context: T): D =
            visitor.visitLiteral(this, context)
}