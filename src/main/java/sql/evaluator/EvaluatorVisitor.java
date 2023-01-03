// Generated from /Users/huchang/IdeaProjects/makeyourdatabase/src/main/java/sql/evaluator/Evaluator.g4 by ANTLR 4.10.1
package sql.evaluator;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EvaluatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface EvaluatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link EvaluatorParser#conditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(EvaluatorParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link EvaluatorParser#conditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(EvaluatorParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Single}
	 * labeled alternative in {@link EvaluatorParser#conditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle(EvaluatorParser.SingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParensCondition}
	 * labeled alternative in {@link EvaluatorParser#conditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParensCondition(EvaluatorParser.ParensConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code And}
	 * labeled alternative in {@link EvaluatorParser#conditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(EvaluatorParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code likeSingle}
	 * labeled alternative in {@link EvaluatorParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLikeSingle(EvaluatorParser.LikeSingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code likeDouble}
	 * labeled alternative in {@link EvaluatorParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLikeDouble(EvaluatorParser.LikeDoubleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code like}
	 * labeled alternative in {@link EvaluatorParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLike(EvaluatorParser.LikeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Gt}
	 * labeled alternative in {@link EvaluatorParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGt(EvaluatorParser.GtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Lt}
	 * labeled alternative in {@link EvaluatorParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLt(EvaluatorParser.LtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Ge}
	 * labeled alternative in {@link EvaluatorParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGe(EvaluatorParser.GeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Le}
	 * labeled alternative in {@link EvaluatorParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLe(EvaluatorParser.LeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link EvaluatorParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual(EvaluatorParser.EqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NEqual}
	 * labeled alternative in {@link EvaluatorParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNEqual(EvaluatorParser.NEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Function}
	 * labeled alternative in {@link EvaluatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(EvaluatorParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SingleString}
	 * labeled alternative in {@link EvaluatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleString(EvaluatorParser.SingleStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NInt}
	 * labeled alternative in {@link EvaluatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNInt(EvaluatorParser.NIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link EvaluatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(EvaluatorParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link EvaluatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(EvaluatorParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link EvaluatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(EvaluatorParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoubleString}
	 * labeled alternative in {@link EvaluatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleString(EvaluatorParser.DoubleStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NFloat}
	 * labeled alternative in {@link EvaluatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNFloat(EvaluatorParser.NFloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PInt}
	 * labeled alternative in {@link EvaluatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPInt(EvaluatorParser.PIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ID}
	 * labeled alternative in {@link EvaluatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitID(EvaluatorParser.IDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PFloat}
	 * labeled alternative in {@link EvaluatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPFloat(EvaluatorParser.PFloatContext ctx);
}