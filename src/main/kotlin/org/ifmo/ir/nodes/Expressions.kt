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

data class Identifier(val id: String) : Expression() {
    override fun <T, D> accept(visitor: IRVisitor<T, D>, context: T): D =
            visitor.visitIdentifier(this, context)

    override fun toString(): String = id

    override fun hashCode(): Int = id.hashCode()

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Identifier

        if (id != other.id) return false

        return true
    }
}

class Literal(val value: Int) : Expression() {
    override fun <T, D> accept(visitor: IRVisitor<T, D>, context: T): D =
            visitor.visitLiteral(this, context)
}