package org.ifmo.antlr.visitors

import org.antlr.v4.runtime.tree.TerminalNode
import org.ifmo.FunParser
import org.ifmo.FunParserBaseVisitor
import org.ifmo.ir.nodes.*
import org.ifmo.ir.nodes.Function

class InterpretationException(message: String?) : Exception(message)

class AntlrToAstVisitor : FunParserBaseVisitor<IRNode>() {
    /**
     * Tries to parse int literal from node
     * @exception  NumberFormatException  if terminal node is not int literal.
     */
    private fun TerminalNode.toLiteral() =
            Literal(this.text.toInt())

    private fun TerminalNode.toIdentifier() =
            Identifier(this.text)

    override fun visitFile(ctx: FunParser.FileContext): IRNode =
            Block(ctx.block().stmt().map {
                it.accept(this)
            })

    override fun visitLiteral(ctx: FunParser.LiteralContext): Expression =
            ctx.INT_NUM().toLiteral()


    override fun visitAtom(ctx: FunParser.AtomContext): Expression = when {
        ctx.ID() != null -> ctx.ID().toIdentifier()
        ctx.func_invoke() != null -> visitFunc_invoke(ctx.func_invoke())
        ctx.literal() != null -> visitLiteral(ctx.literal())
        else -> throw InterpretationException("cannot interpret atom $ctx")
    }


    override fun visitLogical_op(ctx: FunParser.Logical_opContext): Operator =
            when {
                ctx.AND() != null -> Operator(OperatorType.AND)
                ctx.OR() != null -> Operator(OperatorType.OR)
                else -> TODO("operator exception")
            }

    override fun visitCompare_op(ctx: FunParser.Compare_opContext): Operator =
            when {
                ctx.EQUAL() != null -> Operator(OperatorType.EQUAL)
                ctx.GREATER() != null -> Operator(OperatorType.GREATER)
                ctx.GREQUAL() != null -> Operator(OperatorType.GREQUAL)
                ctx.LESS() != null -> Operator(OperatorType.LESS)
                ctx.LEQUAL() != null -> Operator(OperatorType.LEQUAL)
                ctx.NOTEQUAL() != null -> Operator(OperatorType.NOTEQUAL)
                else -> TODO("operator exception")
            }

    override fun visitPlumin(ctx: FunParser.PluminContext): Operator = when {
        ctx.MINUS() != null -> Operator(OperatorType.MINUS)
        ctx.PLUS() != null -> Operator(OperatorType.PLUS)
        else -> TODO("operator exception")
    }

    override fun visitDivast(ctx: FunParser.DivastContext): Operator = when {
        ctx.DIVISION() != null -> Operator(OperatorType.DIVISION)
        ctx.ASTERISK() != null -> Operator(OperatorType.ASTERISK)
        else -> TODO("operator exception")
    }

    override fun visitArithmeticParensExpr(ctx: FunParser.ArithmeticParensExprContext): Expression =
            visitArithmeticExpr(ctx.arithm_expr())

    override fun visitArithmeticDABinaryExpr(ctx: FunParser.ArithmeticDABinaryExprContext): Expression {
        val leftOperand = visitArithmeticExpr(ctx.left)
        val rightOperand = visitArithmeticExpr(ctx.right)
        val operator = visitDivast(ctx.op)

        return BinaryExpression(leftOperand, rightOperand, operator)
    }

    override fun visitArithmeticPMBinaryExpr(ctx: FunParser.ArithmeticPMBinaryExprContext): Expression {
        val leftOperand = visitArithmeticExpr(ctx.left)
        val rightOperand = visitArithmeticExpr(ctx.right)
        val operator = visitPlumin(ctx.op)

        return BinaryExpression(leftOperand, rightOperand, operator)
    }

    override fun visitArithmeticAtomExpr(ctx: FunParser.ArithmeticAtomExprContext): Expression =
        visitAtom(ctx.atom())

    override fun visitBinary_expr(ctx: FunParser.Binary_exprContext): Expression =
            when {
                ctx.arithm_expr() != null -> visitArithmeticExpr(ctx.arithm_expr())
                ctx.logical_expr() != null -> visitLogicalExpr(ctx.logical_expr())
                else -> TODO("visit binary expression exception")
            }

    override fun visitExpr(ctx: FunParser.ExprContext): Expression = when {
        ctx.ID() != null -> ctx.ID().toIdentifier()
        ctx.binary_expr() != null -> visitBinary_expr(ctx.binary_expr())
        ctx.expr() != null -> visitExpr(ctx.expr()) // TODO mb add brackets node
        ctx.func_invoke() != null -> visitFunc_invoke(ctx.func_invoke())
        ctx.literal() != null -> visitLiteral(ctx.literal())
        else -> TODO("visit expression exception")
    }


    override fun visitVar_def(ctx: FunParser.Var_defContext): IRNode {
        val id = ctx.ID().toIdentifier()
        val expression = visitExpr(ctx.expr())

        return VarDefinition(id, expression)
    }

    override fun visitVar_assign(ctx: FunParser.Var_assignContext): IRNode {
        val id = ctx.ID().toIdentifier()
        val expression = visitExpr(ctx.expr())

        return Assignment(id, expression)
    }

    override fun visitStmt(ctx: FunParser.StmtContext): IRNode = when {
        ctx.func_invoke() != null -> ctx.func_invoke().accept(this)
        ctx.func_def() != null -> ctx.func_def().accept(this)
        ctx.expr() != null -> ctx.expr().accept(this)
        ctx.if_stmt() != null -> ctx.if_stmt().accept(this)
        ctx.return_stmt() != null -> ctx.return_stmt().accept(this)
        ctx.var_assign() != null -> ctx.var_assign().accept(this)
        ctx.var_def() != null -> ctx.var_def().accept(this)
        ctx.while_stmt() != null -> ctx.while_stmt().accept(this)
        else -> TODO("stmt excception")
    }

    override fun visitReturn_stmt(ctx: FunParser.Return_stmtContext): IRNode =
            Return(visitExpr(ctx.expr()))

    override fun visitFunc_def(ctx: FunParser.Func_defContext): IRNode {
        val id = ctx.ID().toIdentifier()
        val parameters = ctx.func_def_args().ID().map {
            it.toIdentifier()
        }
        val body = visitBlock_with_braces(ctx.func_body)

        return Function(id, parameters, body)
    }

    override fun visitIf_stmt(ctx: FunParser.If_stmtContext): IRNode {
        val expr = visitExpr(ctx.expr())
        val body = visitBlock_with_braces(ctx.if_body)
        val elseBody = ctx.else_body?.let { visitBlock_with_braces(it) }
        return If(expr, body, elseBody)
    }

    override fun visitWhile_stmt(ctx: FunParser.While_stmtContext): IRNode {
        val expr = visitExpr(ctx.expr())
        val body = visitBlock_with_braces(ctx.while_body)

        return While(expr, body)
    }

    override fun visitFunc_invoke(ctx: FunParser.Func_invokeContext): Expression {
        val id = ctx.ID().toIdentifier()
        val parameters = ctx.func_arguments().expr().map {
            visitExpr(it)
        }

        return FunctionCall(id, parameters)
    }

    override fun visitBlock_with_braces(ctx: FunParser.Block_with_bracesContext): Block =
            visitBlock(ctx.block())

    override fun visitBlock(ctx: FunParser.BlockContext): Block =
            Block(ctx.stmt().map {
                it.accept(this)
            })


    private fun visitArithmeticExpr(ctx: FunParser.Arithm_exprContext): Expression =
            when (ctx) {
                is FunParser.ArithmeticAtomExprContext -> visitArithmeticAtomExpr(ctx)
                is FunParser.ArithmeticParensExprContext -> visitArithmeticParensExpr(ctx)
                is FunParser.ArithmeticDABinaryExprContext -> visitArithmeticDABinaryExpr(ctx)
                is FunParser.ArithmeticPMBinaryExprContext -> visitArithmeticPMBinaryExpr(ctx)
                else -> TODO("todo arithmetic expression exception")
            }

    private fun visitLogicalExpr(ctx: FunParser.Logical_exprContext): Expression =
            when (ctx) {
                is FunParser.LogicalAtomExprContext -> visitLogicalAtomExpr(ctx)
                is FunParser.LogicalCompareExprContext -> visitLogicalCompareExpr(ctx)
                is FunParser.LogicalBinaryExprContext -> visitLogicalBinaryExpr(ctx)
                is FunParser.LogicalParensExprContext -> visitLogicalParensExpr(ctx)
                else -> TODO("todo arithmetic expression exception")
            }

    /* Binary expressions */
    override fun visitLogicalCompareExpr(ctx: FunParser.LogicalCompareExprContext): Expression {
        val leftOperand = visitArithmeticExpr(ctx.left)
        val rightOperand = visitArithmeticExpr(ctx.right)

        val operator = visitCompare_op(ctx.op)

        return BinaryExpression(leftOperand, rightOperand, operator)
    }

    override fun visitLogicalBinaryExpr(ctx: FunParser.LogicalBinaryExprContext): Expression {
        val leftOperand = visitLogicalExpr(ctx.left)
        val rightOperand = visitLogicalExpr(ctx.right)

        val operator = visitLogical_op(ctx.op)

        return BinaryExpression(leftOperand, rightOperand, operator)
    }

    override fun visitLogicalParensExpr(ctx: FunParser.LogicalParensExprContext): Expression =
            visitLogicalExpr(ctx.logical_expr())

    override fun visitLogicalAtomExpr(ctx: FunParser.LogicalAtomExprContext): Expression =
            visitAtom(ctx.atom())

}