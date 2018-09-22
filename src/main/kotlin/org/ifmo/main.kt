package org.ifmo

import org.antlr.v4.runtime.BufferedTokenStream
import org.antlr.v4.runtime.CharStreams
import org.ifmo.antlr.visitors.AntlrToAstVisitor
import org.ifmo.ir.visitor.ErrorChecker
import org.ifmo.ir.visitor.EvalContext

fun <T>FunParser.eval(visitor: FunParserBaseVisitor<T>) =
        this.file().accept(visitor)

fun main(args: Array<String>) {

    val funLexer = FunLexer(CharStreams.fromString("""
        var x = (1 + 3) + 10
        fun test    (y) {
            var a = y + 10
            var b = a + y + test(90)
        }

        var c = x + test(10)
        """.trimIndent()))
    val funParser = FunParser(BufferedTokenStream(funLexer))

    val eval = funParser.eval(AntlrToAstVisitor())

    eval.accept(ErrorChecker(), EvalContext())

    println("something")
}