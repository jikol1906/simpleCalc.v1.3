// Generated from simpleCalc.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link simpleCalcParser}.
 */
public interface simpleCalcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link simpleCalcParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(simpleCalcParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleCalcParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(simpleCalcParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleCalcParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(simpleCalcParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleCalcParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(simpleCalcParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleCalcParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(simpleCalcParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleCalcParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(simpleCalcParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleCalcParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(simpleCalcParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleCalcParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(simpleCalcParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleCalcParser#stmts}.
	 * @param ctx the parse tree
	 */
	void enterStmts(simpleCalcParser.StmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleCalcParser#stmts}.
	 * @param ctx the parse tree
	 */
	void exitStmts(simpleCalcParser.StmtsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Comparison}
	 * labeled alternative in {@link simpleCalcParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterComparison(simpleCalcParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Comparison}
	 * labeled alternative in {@link simpleCalcParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitComparison(simpleCalcParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogOp}
	 * labeled alternative in {@link simpleCalcParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterLogOp(simpleCalcParser.LogOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogOp}
	 * labeled alternative in {@link simpleCalcParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitLogOp(simpleCalcParser.LogOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenthesis(simpleCalcParser.ParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenthesis(simpleCalcParser.ParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVariable(simpleCalcParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVariable(simpleCalcParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConstant(simpleCalcParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConstant(simpleCalcParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Var}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVar(simpleCalcParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVar(simpleCalcParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Statement}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStatement(simpleCalcParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Statement}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStatement(simpleCalcParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Calculate}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCalculate(simpleCalcParser.CalculateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Calculate}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCalculate(simpleCalcParser.CalculateContext ctx);
}