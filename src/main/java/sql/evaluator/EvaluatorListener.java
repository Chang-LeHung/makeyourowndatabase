// Generated from /Users/huchang/IdeaProjects/makeyourdatabase/src/main/java/sql/evaluator/Evaluator.g4 by ANTLR 4.10.1
package sql.evaluator;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EvaluatorParser}.
 */
public interface EvaluatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Not}
	 * labeled alternative in {@link EvaluatorParser#conditions}.
	 * @param ctx the parse tree
	 */
	void enterNot(EvaluatorParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link EvaluatorParser#conditions}.
	 * @param ctx the parse tree
	 */
	void exitNot(EvaluatorParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Or}
	 * labeled alternative in {@link EvaluatorParser#conditions}.
	 * @param ctx the parse tree
	 */
	void enterOr(EvaluatorParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link EvaluatorParser#conditions}.
	 * @param ctx the parse tree
	 */
	void exitOr(EvaluatorParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Single}
	 * labeled alternative in {@link EvaluatorParser#conditions}.
	 * @param ctx the parse tree
	 */
	void enterSingle(EvaluatorParser.SingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Single}
	 * labeled alternative in {@link EvaluatorParser#conditions}.
	 * @param ctx the parse tree
	 */
	void exitSingle(EvaluatorParser.SingleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParensCondition}
	 * labeled alternative in {@link EvaluatorParser#conditions}.
	 * @param ctx the parse tree
	 */
	void enterParensCondition(EvaluatorParser.ParensConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParensCondition}
	 * labeled alternative in {@link EvaluatorParser#conditions}.
	 * @param ctx the parse tree
	 */
	void exitParensCondition(EvaluatorParser.ParensConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code And}
	 * labeled alternative in {@link EvaluatorParser#conditions}.
	 * @param ctx the parse tree
	 */
	void enterAnd(EvaluatorParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code And}
	 * labeled alternative in {@link EvaluatorParser#conditions}.
	 * @param ctx the parse tree
	 */
	void exitAnd(EvaluatorParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code likeSingle}
	 * labeled alternative in {@link EvaluatorParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterLikeSingle(EvaluatorParser.LikeSingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code likeSingle}
	 * labeled alternative in {@link EvaluatorParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitLikeSingle(EvaluatorParser.LikeSingleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code likeDouble}
	 * labeled alternative in {@link EvaluatorParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterLikeDouble(EvaluatorParser.LikeDoubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code likeDouble}
	 * labeled alternative in {@link EvaluatorParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitLikeDouble(EvaluatorParser.LikeDoubleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code like}
	 * labeled alternative in {@link EvaluatorParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterLike(EvaluatorParser.LikeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code like}
	 * labeled alternative in {@link EvaluatorParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitLike(EvaluatorParser.LikeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Gt}
	 * labeled alternative in {@link EvaluatorParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterGt(EvaluatorParser.GtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Gt}
	 * labeled alternative in {@link EvaluatorParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitGt(EvaluatorParser.GtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Lt}
	 * labeled alternative in {@link EvaluatorParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterLt(EvaluatorParser.LtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Lt}
	 * labeled alternative in {@link EvaluatorParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitLt(EvaluatorParser.LtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Ge}
	 * labeled alternative in {@link EvaluatorParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterGe(EvaluatorParser.GeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Ge}
	 * labeled alternative in {@link EvaluatorParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitGe(EvaluatorParser.GeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Le}
	 * labeled alternative in {@link EvaluatorParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterLe(EvaluatorParser.LeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Le}
	 * labeled alternative in {@link EvaluatorParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitLe(EvaluatorParser.LeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link EvaluatorParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterEqual(EvaluatorParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link EvaluatorParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitEqual(EvaluatorParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NEqual}
	 * labeled alternative in {@link EvaluatorParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterNEqual(EvaluatorParser.NEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NEqual}
	 * labeled alternative in {@link EvaluatorParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitNEqual(EvaluatorParser.NEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Function}
	 * labeled alternative in {@link EvaluatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunction(EvaluatorParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Function}
	 * labeled alternative in {@link EvaluatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunction(EvaluatorParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SingleString}
	 * labeled alternative in {@link EvaluatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSingleString(EvaluatorParser.SingleStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SingleString}
	 * labeled alternative in {@link EvaluatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSingleString(EvaluatorParser.SingleStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NInt}
	 * labeled alternative in {@link EvaluatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNInt(EvaluatorParser.NIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NInt}
	 * labeled alternative in {@link EvaluatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNInt(EvaluatorParser.NIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link EvaluatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(EvaluatorParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link EvaluatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(EvaluatorParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link EvaluatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(EvaluatorParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link EvaluatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(EvaluatorParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link EvaluatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParens(EvaluatorParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link EvaluatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParens(EvaluatorParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoubleString}
	 * labeled alternative in {@link EvaluatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDoubleString(EvaluatorParser.DoubleStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoubleString}
	 * labeled alternative in {@link EvaluatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDoubleString(EvaluatorParser.DoubleStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NFloat}
	 * labeled alternative in {@link EvaluatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNFloat(EvaluatorParser.NFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NFloat}
	 * labeled alternative in {@link EvaluatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNFloat(EvaluatorParser.NFloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PInt}
	 * labeled alternative in {@link EvaluatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPInt(EvaluatorParser.PIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PInt}
	 * labeled alternative in {@link EvaluatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPInt(EvaluatorParser.PIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ID}
	 * labeled alternative in {@link EvaluatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterID(EvaluatorParser.IDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ID}
	 * labeled alternative in {@link EvaluatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitID(EvaluatorParser.IDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PFloat}
	 * labeled alternative in {@link EvaluatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPFloat(EvaluatorParser.PFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PFloat}
	 * labeled alternative in {@link EvaluatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPFloat(EvaluatorParser.PFloatContext ctx);
}