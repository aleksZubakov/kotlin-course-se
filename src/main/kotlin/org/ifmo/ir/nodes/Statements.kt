package org.ifmo.ir.nodes

import org.ifmo.ir.visitor.IRVisitor

class Block(val nodes: List<IRNode>) : IRNode {
    override fun <T, D> accept(visitor: IRVisitor<T, D>, context: T): D =
            visitor.visitBlock(this, context)
}

class Function(val id: Identifier, val parameterNames: List<Identifier>, val block: Block) : IRNode {
    override fun <T, D> accept(visitor: IRVisitor<T, D>, context: T): D =
            visitor.visitFunction(this, context)
}


class While(val condition: Expression, val block: Block) : IRNode {
    override fun <T, D> accept(visitor: IRVisitor<T, D>, context: T): D {
        return visitor.visitWhile(this, context)
    }
}

class If(val condition: Expression, val block: Block) : IRNode {
    override fun <T, D> accept(visitor: IRVisitor<T, D>, context: T): D {
        return visitor.visitIf(this, context)
    }
}


class Assignment(val id: Identifier, val expression: Expression) : IRNode {
    override fun <T, D> accept(visitor: IRVisitor<T, D>, context: T): D {
        return visitor.visitAssignment(this, context)
    }
}

class Return(val expression: Expression) : IRNode {
    override fun <T, D> accept(visitor: IRVisitor<T, D>, context: T): D =
            visitor.visitReturn(this, context)

}


class VarDefinition(val id: Identifier, val expression: Expression) : IRNode {
    override fun <T, D> accept(visitor: IRVisitor<T, D>, context: T): D =
            visitor.visitVarDefinition(this, context)
}

