package org.ifmo

import org.antlr.v4.runtime.BufferedTokenStream
import org.antlr.v4.runtime.CharStreams
import org.ifmo.antlr.visitors.AntlrToAstVisitor
import org.ifmo.ir.nodes.IRNode
import org.ifmo.ir.visitor.ErrorChecker
import org.ifmo.ir.visitor.EvalContext
import org.ifmo.ir.visitor.Interpreter
import org.ifmo.ir.visitor.InterpreterContext
import java.io.OutputStream
import java.lang.IllegalArgumentException

fun IRNode.run(out: OutputStream = System.out) {
    accept(ErrorChecker(), EvalContext())
    accept(Interpreter(out), InterpreterContext())
}

fun main(args: Array<String>) {
    if (args.isEmpty() || args.size > 1) {
        throw IllegalArgumentException()
    }
    val funLexer = FunLexer(CharStreams.fromFileName(args.first()))
    val funParser = FunParser(BufferedTokenStream(funLexer))
    val tree = funParser.file()
    tree.accept(AntlrToAstVisitor()).run()
}