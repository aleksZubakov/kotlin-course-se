// Generated from /Users/alekseyzubakov/Documents/edu/kotlin-course-se/src/main/antlr/FunParser.g4 by ANTLR 4.7
package org.ifmo;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FunParser}.
 */
public interface FunParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FunParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(FunParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(FunParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(FunParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(FunParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalCompareExpr}
	 * labeled alternative in {@link FunParser#logical_expr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalCompareExpr(FunParser.LogicalCompareExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalCompareExpr}
	 * labeled alternative in {@link FunParser#logical_expr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalCompareExpr(FunParser.LogicalCompareExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalBinaryExpr}
	 * labeled alternative in {@link FunParser#logical_expr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalBinaryExpr(FunParser.LogicalBinaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalBinaryExpr}
	 * labeled alternative in {@link FunParser#logical_expr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalBinaryExpr(FunParser.LogicalBinaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalParensExpr}
	 * labeled alternative in {@link FunParser#logical_expr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalParensExpr(FunParser.LogicalParensExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalParensExpr}
	 * labeled alternative in {@link FunParser#logical_expr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalParensExpr(FunParser.LogicalParensExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalAtomExpr}
	 * labeled alternative in {@link FunParser#logical_expr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAtomExpr(FunParser.LogicalAtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalAtomExpr}
	 * labeled alternative in {@link FunParser#logical_expr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAtomExpr(FunParser.LogicalAtomExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(FunParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(FunParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunParser#logical_op}.
	 * @param ctx the parse tree
	 */
	void enterLogical_op(FunParser.Logical_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunParser#logical_op}.
	 * @param ctx the parse tree
	 */
	void exitLogical_op(FunParser.Logical_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunParser#compare_op}.
	 * @param ctx the parse tree
	 */
	void enterCompare_op(FunParser.Compare_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunParser#compare_op}.
	 * @param ctx the parse tree
	 */
	void exitCompare_op(FunParser.Compare_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunParser#plumin}.
	 * @param ctx the parse tree
	 */
	void enterPlumin(FunParser.PluminContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunParser#plumin}.
	 * @param ctx the parse tree
	 */
	void exitPlumin(FunParser.PluminContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunParser#divast}.
	 * @param ctx the parse tree
	 */
	void enterDivast(FunParser.DivastContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunParser#divast}.
	 * @param ctx the parse tree
	 */
	void exitDivast(FunParser.DivastContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithmeticParensExpr}
	 * labeled alternative in {@link FunParser#arithm_expr}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticParensExpr(FunParser.ArithmeticParensExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithmeticParensExpr}
	 * labeled alternative in {@link FunParser#arithm_expr}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticParensExpr(FunParser.ArithmeticParensExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithmeticDABinaryExpr}
	 * labeled alternative in {@link FunParser#arithm_expr}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticDABinaryExpr(FunParser.ArithmeticDABinaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithmeticDABinaryExpr}
	 * labeled alternative in {@link FunParser#arithm_expr}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticDABinaryExpr(FunParser.ArithmeticDABinaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithmeticPMBinaryExpr}
	 * labeled alternative in {@link FunParser#arithm_expr}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticPMBinaryExpr(FunParser.ArithmeticPMBinaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithmeticPMBinaryExpr}
	 * labeled alternative in {@link FunParser#arithm_expr}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticPMBinaryExpr(FunParser.ArithmeticPMBinaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithmeticAtomExpr}
	 * labeled alternative in {@link FunParser#arithm_expr}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticAtomExpr(FunParser.ArithmeticAtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithmeticAtomExpr}
	 * labeled alternative in {@link FunParser#arithm_expr}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticAtomExpr(FunParser.ArithmeticAtomExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunParser#binary_expr}.
	 * @param ctx the parse tree
	 */
	void enterBinary_expr(FunParser.Binary_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunParser#binary_expr}.
	 * @param ctx the parse tree
	 */
	void exitBinary_expr(FunParser.Binary_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(FunParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(FunParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunParser#var_def}.
	 * @param ctx the parse tree
	 */
	void enterVar_def(FunParser.Var_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunParser#var_def}.
	 * @param ctx the parse tree
	 */
	void exitVar_def(FunParser.Var_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunParser#var_assign}.
	 * @param ctx the parse tree
	 */
	void enterVar_assign(FunParser.Var_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunParser#var_assign}.
	 * @param ctx the parse tree
	 */
	void exitVar_assign(FunParser.Var_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(FunParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(FunParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(FunParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(FunParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunParser#func_def}.
	 * @param ctx the parse tree
	 */
	void enterFunc_def(FunParser.Func_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunParser#func_def}.
	 * @param ctx the parse tree
	 */
	void exitFunc_def(FunParser.Func_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunParser#func_def_args}.
	 * @param ctx the parse tree
	 */
	void enterFunc_def_args(FunParser.Func_def_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunParser#func_def_args}.
	 * @param ctx the parse tree
	 */
	void exitFunc_def_args(FunParser.Func_def_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(FunParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(FunParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(FunParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(FunParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunParser#func_invoke}.
	 * @param ctx the parse tree
	 */
	void enterFunc_invoke(FunParser.Func_invokeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunParser#func_invoke}.
	 * @param ctx the parse tree
	 */
	void exitFunc_invoke(FunParser.Func_invokeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunParser#func_arguments}.
	 * @param ctx the parse tree
	 */
	void enterFunc_arguments(FunParser.Func_argumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunParser#func_arguments}.
	 * @param ctx the parse tree
	 */
	void exitFunc_arguments(FunParser.Func_argumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunParser#block_with_braces}.
	 * @param ctx the parse tree
	 */
	void enterBlock_with_braces(FunParser.Block_with_bracesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunParser#block_with_braces}.
	 * @param ctx the parse tree
	 */
	void exitBlock_with_braces(FunParser.Block_with_bracesContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(FunParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(FunParser.BlockContext ctx);
}