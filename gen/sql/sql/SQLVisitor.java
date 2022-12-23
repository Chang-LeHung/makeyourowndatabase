// Generated from /Users/huchang/IdeaProjects/makeyourdatabase/src/main/java/sql/sql/SQL.g4 by ANTLR 4.10.1
package sql.sql;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SQLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code SQLCreate}
	 * labeled alternative in {@link SQLParser#create}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSQLCreate(SQLParser.SQLCreateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SQLSelect}
	 * labeled alternative in {@link SQLParser#select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSQLSelect(SQLParser.SQLSelectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SQLInsertOne}
	 * labeled alternative in {@link SQLParser#insert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSQLInsertOne(SQLParser.SQLInsertOneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SQLInsertMany}
	 * labeled alternative in {@link SQLParser#insert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSQLInsertMany(SQLParser.SQLInsertManyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SQLUpdate}
	 * labeled alternative in {@link SQLParser#update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSQLUpdate(SQLParser.SQLUpdateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SQLDelete}
	 * labeled alternative in {@link SQLParser#delete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSQLDelete(SQLParser.SQLDeleteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UpdateAssign}
	 * labeled alternative in {@link SQLParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateAssign(SQLParser.UpdateAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup(SQLParser.GroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData(SQLParser.DataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrdinaryItem}
	 * labeled alternative in {@link SQLParser#itemexpre}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdinaryItem(SQLParser.OrdinaryItemContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionItem}
	 * labeled alternative in {@link SQLParser#itemexpre}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionItem(SQLParser.FunctionItemContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhereCondition}
	 * labeled alternative in {@link SQLParser#where}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereCondition(SQLParser.WhereConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HavingCondition}
	 * labeled alternative in {@link SQLParser#having}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHavingCondition(SQLParser.HavingConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GroupBy}
	 * labeled alternative in {@link SQLParser#groupby}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupBy(SQLParser.GroupByContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryKey}
	 * labeled alternative in {@link SQLParser#pkeys}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryKey(SQLParser.PrimaryKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#rkeys}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRkeys(SQLParser.RkeysContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForeignKey}
	 * labeled alternative in {@link SQLParser#fk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeignKey(SQLParser.ForeignKeyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReferenceKey}
	 * labeled alternative in {@link SQLParser#rk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceKey(SQLParser.ReferenceKeyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SingleItem}
	 * labeled alternative in {@link SQLParser#item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleItem(SQLParser.SingleItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#constrain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstrain(SQLParser.ConstrainContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#conditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditions(SQLParser.ConditionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(SQLParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SQLParser.ExpressionContext ctx);
}