// Generated from /Users/huchang/IdeaProjects/makeyourdatabase/src/main/java/sql/sql/SQL.g4 by ANTLR 4.10.1
package sql.sql;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SQLParser}.
 */
public interface SQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code DoCreate}
	 * labeled alternative in {@link SQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDoCreate(SQLParser.DoCreateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoCreate}
	 * labeled alternative in {@link SQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDoCreate(SQLParser.DoCreateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoSelect}
	 * labeled alternative in {@link SQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDoSelect(SQLParser.DoSelectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoSelect}
	 * labeled alternative in {@link SQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDoSelect(SQLParser.DoSelectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoInsert}
	 * labeled alternative in {@link SQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDoInsert(SQLParser.DoInsertContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoInsert}
	 * labeled alternative in {@link SQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDoInsert(SQLParser.DoInsertContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoUpdate}
	 * labeled alternative in {@link SQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDoUpdate(SQLParser.DoUpdateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoUpdate}
	 * labeled alternative in {@link SQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDoUpdate(SQLParser.DoUpdateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoDelete}
	 * labeled alternative in {@link SQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDoDelete(SQLParser.DoDeleteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoDelete}
	 * labeled alternative in {@link SQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDoDelete(SQLParser.DoDeleteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SQLCreate}
	 * labeled alternative in {@link SQLParser#create}.
	 * @param ctx the parse tree
	 */
	void enterSQLCreate(SQLParser.SQLCreateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SQLCreate}
	 * labeled alternative in {@link SQLParser#create}.
	 * @param ctx the parse tree
	 */
	void exitSQLCreate(SQLParser.SQLCreateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SQLSelect}
	 * labeled alternative in {@link SQLParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSQLSelect(SQLParser.SQLSelectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SQLSelect}
	 * labeled alternative in {@link SQLParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSQLSelect(SQLParser.SQLSelectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SQLInsertOne}
	 * labeled alternative in {@link SQLParser#insert}.
	 * @param ctx the parse tree
	 */
	void enterSQLInsertOne(SQLParser.SQLInsertOneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SQLInsertOne}
	 * labeled alternative in {@link SQLParser#insert}.
	 * @param ctx the parse tree
	 */
	void exitSQLInsertOne(SQLParser.SQLInsertOneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SQLInsertMany}
	 * labeled alternative in {@link SQLParser#insert}.
	 * @param ctx the parse tree
	 */
	void enterSQLInsertMany(SQLParser.SQLInsertManyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SQLInsertMany}
	 * labeled alternative in {@link SQLParser#insert}.
	 * @param ctx the parse tree
	 */
	void exitSQLInsertMany(SQLParser.SQLInsertManyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SQLUpdate}
	 * labeled alternative in {@link SQLParser#update}.
	 * @param ctx the parse tree
	 */
	void enterSQLUpdate(SQLParser.SQLUpdateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SQLUpdate}
	 * labeled alternative in {@link SQLParser#update}.
	 * @param ctx the parse tree
	 */
	void exitSQLUpdate(SQLParser.SQLUpdateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SQLDelete}
	 * labeled alternative in {@link SQLParser#delete}.
	 * @param ctx the parse tree
	 */
	void enterSQLDelete(SQLParser.SQLDeleteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SQLDelete}
	 * labeled alternative in {@link SQLParser#delete}.
	 * @param ctx the parse tree
	 */
	void exitSQLDelete(SQLParser.SQLDeleteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UpdateAssign}
	 * labeled alternative in {@link SQLParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterUpdateAssign(SQLParser.UpdateAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UpdateAssign}
	 * labeled alternative in {@link SQLParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitUpdateAssign(SQLParser.UpdateAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#group}.
	 * @param ctx the parse tree
	 */
	void enterGroup(SQLParser.GroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#group}.
	 * @param ctx the parse tree
	 */
	void exitGroup(SQLParser.GroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#data}.
	 * @param ctx the parse tree
	 */
	void enterData(SQLParser.DataContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#data}.
	 * @param ctx the parse tree
	 */
	void exitData(SQLParser.DataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrdinaryItem}
	 * labeled alternative in {@link SQLParser#itemexpre}.
	 * @param ctx the parse tree
	 */
	void enterOrdinaryItem(SQLParser.OrdinaryItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrdinaryItem}
	 * labeled alternative in {@link SQLParser#itemexpre}.
	 * @param ctx the parse tree
	 */
	void exitOrdinaryItem(SQLParser.OrdinaryItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionItem}
	 * labeled alternative in {@link SQLParser#itemexpre}.
	 * @param ctx the parse tree
	 */
	void enterFunctionItem(SQLParser.FunctionItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionItem}
	 * labeled alternative in {@link SQLParser#itemexpre}.
	 * @param ctx the parse tree
	 */
	void exitFunctionItem(SQLParser.FunctionItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhereCondition}
	 * labeled alternative in {@link SQLParser#where}.
	 * @param ctx the parse tree
	 */
	void enterWhereCondition(SQLParser.WhereConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhereCondition}
	 * labeled alternative in {@link SQLParser#where}.
	 * @param ctx the parse tree
	 */
	void exitWhereCondition(SQLParser.WhereConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HavingCondition}
	 * labeled alternative in {@link SQLParser#having}.
	 * @param ctx the parse tree
	 */
	void enterHavingCondition(SQLParser.HavingConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HavingCondition}
	 * labeled alternative in {@link SQLParser#having}.
	 * @param ctx the parse tree
	 */
	void exitHavingCondition(SQLParser.HavingConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GroupByImpl}
	 * labeled alternative in {@link SQLParser#groupby}.
	 * @param ctx the parse tree
	 */
	void enterGroupByImpl(SQLParser.GroupByImplContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GroupByImpl}
	 * labeled alternative in {@link SQLParser#groupby}.
	 * @param ctx the parse tree
	 */
	void exitGroupByImpl(SQLParser.GroupByImplContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryKey}
	 * labeled alternative in {@link SQLParser#pkeys}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryKey(SQLParser.PrimaryKeyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryKey}
	 * labeled alternative in {@link SQLParser#pkeys}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryKey(SQLParser.PrimaryKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#rkeys}.
	 * @param ctx the parse tree
	 */
	void enterRkeys(SQLParser.RkeysContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#rkeys}.
	 * @param ctx the parse tree
	 */
	void exitRkeys(SQLParser.RkeysContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForeignKey}
	 * labeled alternative in {@link SQLParser#fk}.
	 * @param ctx the parse tree
	 */
	void enterForeignKey(SQLParser.ForeignKeyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForeignKey}
	 * labeled alternative in {@link SQLParser#fk}.
	 * @param ctx the parse tree
	 */
	void exitForeignKey(SQLParser.ForeignKeyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReferenceKey}
	 * labeled alternative in {@link SQLParser#rk}.
	 * @param ctx the parse tree
	 */
	void enterReferenceKey(SQLParser.ReferenceKeyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReferenceKey}
	 * labeled alternative in {@link SQLParser#rk}.
	 * @param ctx the parse tree
	 */
	void exitReferenceKey(SQLParser.ReferenceKeyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SingleItem}
	 * labeled alternative in {@link SQLParser#item}.
	 * @param ctx the parse tree
	 */
	void enterSingleItem(SQLParser.SingleItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SingleItem}
	 * labeled alternative in {@link SQLParser#item}.
	 * @param ctx the parse tree
	 */
	void exitSingleItem(SQLParser.SingleItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#constrain}.
	 * @param ctx the parse tree
	 */
	void enterConstrain(SQLParser.ConstrainContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#constrain}.
	 * @param ctx the parse tree
	 */
	void exitConstrain(SQLParser.ConstrainContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#conditions}.
	 * @param ctx the parse tree
	 */
	void enterConditions(SQLParser.ConditionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#conditions}.
	 * @param ctx the parse tree
	 */
	void exitConditions(SQLParser.ConditionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(SQLParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(SQLParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SQLParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SQLParser.ExpressionContext ctx);
}