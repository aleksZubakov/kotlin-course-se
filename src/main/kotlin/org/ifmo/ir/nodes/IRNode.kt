package org.ifmo.ir.nodes

import org.ifmo.ir.visitor.IRVisitor

interface IRNode {
    fun <T, D> accept(visitor: IRVisitor<T, D>, context: T): D
}

