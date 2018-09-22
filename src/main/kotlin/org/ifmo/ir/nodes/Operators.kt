package org.ifmo.ir.nodes

import org.ifmo.ir.visitor.IRVisitor

enum class OperatorType(val symbol: String) {
    /* ARITHMETIC */
    PLUS("+"),
    MINUS("-"),
    ASTERISK("*"), DIVISION("/"),
    MOD("%"),

    /* COMPARE */
    EQUAL("=="),
    NOTEQUAL("!="),
    GREATER(">"), GREQUAL(">="),
    LESS("<"), LEQUAL("<="),

    /* LOGICAL */
    AND("&&"),
    OR("||");
}

class Operator(val operator: OperatorType) : IRNode {
    override fun <T, D> accept(visitor: IRVisitor<T, D>, context: T): D {
        return visitor.visitOperator(this, context)
    }
}