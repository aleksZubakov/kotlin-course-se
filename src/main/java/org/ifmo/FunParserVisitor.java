// Generated from /Users/alekseyzubakov/Documents/edu/kotlin-course-se/src/main/antlr/FunParser.g4 by ANTLR 4.7
package org.ifmo;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FunParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FunParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FunParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(FunParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(FunParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalCompareExpr}
	 * labeled alternative in {@link FunParser#logical_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalCompareExpr(FunParser.LogicalCompareExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalBinaryExpr}
	 * labeled alternative in {@link FunParser#logical_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalBinaryExpr(FunParser.LogicalBinaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalParensExpr}
	 * labeled alternative in {@link FunParser#logical_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalParensExpr(FunParser.LogicalParensExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalAtomExpr}
	 * labeled alternative in {@link FunParser#logical_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAtomExpr(FunParser.LogicalAtomExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(FunParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunParser#logical_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_op(FunParser.Logical_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunParser#compare_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare_op(FunParser.Compare_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunParser#plumin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlumin(FunParser.PluminContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunParser#divast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivast(FunParser.DivastContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArithmeticParensExpr}
	 * labeled alternative in {@link FunParser#arithm_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticParensExpr(FunParser.ArithmeticParensExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArithmeticDABinaryExpr}
	 * labeled alternative in {@link FunParser#arithm_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticDABinaryExpr(FunParser.ArithmeticDABinaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArithmeticPMBinaryExpr}
	 * labeled alternative in {@link FunParser#arithm_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticPMBinaryExpr(FunParser.ArithmeticPMBinaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArithmeticAtomExpr}
	 * labeled alternative in {@link FunParser#arithm_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticAtomExpr(FunParser.ArithmeticAtomExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunParser#binary_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_expr(FunParser.Binary_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(FunParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunParser#var_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_def(FunParser.Var_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunParser#var_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_assign(FunParser.Var_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(FunParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(FunParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunParser#func_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_def(FunParser.Func_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunParser#func_def_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_def_args(FunParser.Func_def_argsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(FunParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(FunParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunParser#func_invoke}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_invoke(FunParser.Func_invokeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunParser#func_arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_arguments(FunParser.Func_argumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunParser#block_with_braces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_with_braces(FunParser.Block_with_bracesContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(FunParser.BlockContext ctx);
}