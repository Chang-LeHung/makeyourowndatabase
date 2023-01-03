package sql.sql.statement;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.TerminalNode;
import sql.sql.SQLBaseVisitor;
import sql.sql.SQLParser;
import sql.sql.statement.sqlobject.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SQLObjectGenerator extends SQLBaseVisitor<Void> {

  private SQLCreate create;
  private SQLUpdate update;
  private SQLInsert insert;
  private SQLDelete delete;
  private SQLSelect select;

  private ANTLRInputStream stream;

  public ANTLRInputStream getStream() {
    return stream;
  }

  public void setStream(ANTLRInputStream stream) {
    this.stream = stream;
  }

  /**
   * curStatementType == 0 create
   * curStatementType == 1 select
   * curStatementType == 2 insert
   * curStatementType == 3 update
   * curStatementType == 4 delete
   */
  private int curStatementType;

  public boolean isCreate() {
    return curStatementType == 0;
  }

  public boolean isSelect() {
    return curStatementType == 1;
  }

  public boolean isInsert() {
    return curStatementType == 2;
  }

  public boolean isUpdate() {
    return curStatementType == 3;
  }

  public boolean isDelete() {
    return curStatementType == 4;
  }

  @Override
  public Void visitDoCreate(SQLParser.DoCreateContext ctx) {
    curStatementType = 0;
    create = new SQLCreate();
    create.setItems(new ArrayList<>());
    create.setPrimaryKey(new ArrayList<>());
    create.setReferences(new ArrayList<>());
    create.setForeignKey(new ArrayList<>());
    return super.visitDoCreate(ctx);
  }

  @Override
  public Void visitDoSelect(SQLParser.DoSelectContext ctx) {
    curStatementType = 1;
    select = new SQLSelect();
    select.setFields(new ArrayList<>());
    select.setFields(new ArrayList<>());
    select.setItems(new ArrayList<>());
    return super.visitDoSelect(ctx);
  }

  @Override
  public Void visitDoInsert(SQLParser.DoInsertContext ctx) {
    curStatementType = 2;
    insert = new SQLInsert();
    insert.setAssigns(new ArrayList<>());
    return super.visitDoInsert(ctx);
  }

  @Override
  public Void visitDoUpdate(SQLParser.DoUpdateContext ctx) {
    curStatementType = 3;
    update = new SQLUpdate();
    update.setMap(new HashMap<>());
    return super.visitDoUpdate(ctx);
  }

  @Override
  public Void visitDoDelete(SQLParser.DoDeleteContext ctx) {
    curStatementType = 4;
    delete = new SQLDelete();
    return super.visitDoDelete(ctx);
  }

  @Override
  public Void visitSQLCreate(SQLParser.SQLCreateContext ctx) {
    String text = ctx.ID().getText();
    create.settableName(text);
    return super.visitSQLCreate(ctx);
  }

  @Override
  public Void visitSQLSelect(SQLParser.SQLSelectContext ctx) {
    super.visitSQLSelect(ctx);
    select.setTableName(ctx.ID().getText());
    List<SQLParser.ExpressionContext> contexts = ctx.expression();
    for (SQLParser.ExpressionContext context : contexts) {
      select.getItems().add(context.getText());
    }
    return null;
  }

  @Override
  public Void visitSQLInsertOne(SQLParser.SQLInsertOneContext ctx) {
    super.visitSQLInsertOne(ctx);
    List<TerminalNode> ids = ctx.ID();
    insert.setTableName(ids.get(0).getText());
    SQLParser.GroupContext group = ctx.group();
    List<Map<String, Object>> maps = new ArrayList<>();
    HashMap<String, Object> map = new HashMap<>();

    List<SQLParser.DataContext> data = group.data();
    for (int i = 0; i < ids.size() - 1; ++i) {
      map.put(ids.get(i + 1).getText(), data.get(i).getText());
    }
    maps.add(map);
    insert.setAssigns(maps);
    return null;
  }

  @Override
  public Void visitSQLInsertMany(SQLParser.SQLInsertManyContext ctx) {
    super.visitSQLInsertMany(ctx);
    List<TerminalNode> ids = ctx.ID();
    insert.setTableName(ids.get(0).getText());
    List<Map<String, Object>> maps = new ArrayList<>();

    List<SQLParser.GroupContext> groups = ctx.group();
    for (SQLParser.GroupContext group : groups) {
      Map<String, Object> map = new HashMap<>();
      List<SQLParser.DataContext> data = group.data();
      for (int i = 0; i < ids.size() - 1; ++i) {
        map.put(ids.get(i + 1).getText(), data.get(i).getText());
      }
      maps.add(map);
    }
    insert.setAssigns(maps);
    return null;
  }

  @Override
  public Void visitSQLUpdate(SQLParser.SQLUpdateContext ctx) {
    super.visitSQLUpdate(ctx);
    update.setTableName(ctx.ID().getText());
    return null;
  }

  @Override
  public Void visitSQLDelete(SQLParser.SQLDeleteContext ctx) {
    super.visitSQLDelete(ctx);

    delete.setTableName(ctx.ID().getText());
    return null;
  }

  @Override
  public Void visitUpdateAssign(SQLParser.UpdateAssignContext ctx) {
    super.visitUpdateAssign(ctx);
    TerminalNode id = ctx.ID();
    update.getMap().put(id.getText(), ctx.data().getText());
    return null;
  }

  @Override
  public Void visitGroup(SQLParser.GroupContext ctx) {
    super.visitGroup(ctx);
    return null;
  }

  @Override
  public Void visitData(SQLParser.DataContext ctx) {
    return super.visitData(ctx);
  }

  @Override
  public Void visitOrdinaryItem(SQLParser.OrdinaryItemContext ctx) {
    super.visitOrdinaryItem(ctx);
    Filed filed = new Filed();
    filed.setName(ctx.ID().getText());
    select.getFields().add(filed);
    return null;
  }

  @Override
  public Void visitFunctionItem(SQLParser.FunctionItemContext ctx) {
    super.visitFunctionItem(ctx);
    Filed filed = new Filed();
    filed.setName(ctx.ID(1).getText());
    filed.setAggregation(ctx.ID(0).getText());
    select.getFields().add(filed);
    return null;
  }

  @Override
  public Void visitWhereCondition(SQLParser.WhereConditionContext ctx) {
    super.visitWhereCondition(ctx);
    int a, b;
    a = ctx.conditions().start.getStartIndex();
    b = ctx.conditions().stop.getStopIndex();
    Interval interval = new Interval(a,b);
    switch (curStatementType) {
      case 1:
        select.setWhere(stream.getText(interval));
        break;
      case 3:
        update.setCondition(stream.getText(interval));
        break;
      case 4:
        delete.setCondition(stream.getText(interval));
        break;
    }
    return null;
  }

  @Override
  public Void visitHavingCondition(SQLParser.HavingConditionContext ctx) {
    super.visitHavingCondition(ctx);
    select.setHaving(ctx.conditions().getText());
    return null;
  }


  @Override
  public Void visitPrimaryKey(SQLParser.PrimaryKeyContext ctx) {
    super.visitPrimaryKey(ctx);
    List<TerminalNode> ids = ctx.ID();
    for (TerminalNode id : ids) {
      create.getPrimaryKey().add(id.getText());
    }
    return null;
  }

  @Override
  public Void visitRkeys(SQLParser.RkeysContext ctx) {
    return super.visitRkeys(ctx);
  }

  @Override
  public Void visitForeignKey(SQLParser.ForeignKeyContext ctx) {
    super.visitForeignKey(ctx);
    List<TerminalNode> ids = ctx.ID();
    for (TerminalNode id : ids) {
      create.getForeignKey().add(id.getText());
    }
    return null;
  }

  @Override
  public Void visitGroupByImpl(SQLParser.GroupByImplContext ctx) {
    super.visitGroupByImpl(ctx);
    select.setGroupByField(ctx.ID().getText());
    return null;
  }

  @Override
  public Void visitReferenceKey(SQLParser.ReferenceKeyContext ctx) {
    super.visitReferenceKey(ctx);
    List<TerminalNode> ids = ctx.ID();
    for (int i = 0; i < ids.size(); ++i){
      if (i == 0)
        create.setForeignTable((ids.get(i).getText()));
      else
        create.getReferences().add((ids.get(i).getText()));
    }
    return null;
  }

  @Override
  public Void visitSingleItem(SQLParser.SingleItemContext ctx) {
    super.visitSingleItem(ctx);
    String id = ctx.ID().getText();
    String type = ctx.TYPE().getText();
    TerminalNode mint = ctx.MINT();
    Item item = new Item();
    item.setName(id);
    item.setType(type);
    if (mint != null)
      item.setSize(Integer.parseInt(mint.getText()));
    else
      item.setSize(-1);
    SQLParser.ConstrainContext constrain = ctx.constrain();
    if (constrain != null) item.setConstrain(constrain.getText());
    create.getItems().add(item);
    return null;
  }

  @Override
  public Void visitConstrain(SQLParser.ConstrainContext ctx) {
    return super.visitConstrain(ctx);
  }

  @Override
  public Void visitConditions(SQLParser.ConditionsContext ctx) {
    return super.visitConditions(ctx);
  }

  @Override
  public Void visitCondition(SQLParser.ConditionContext ctx) {
    return super.visitCondition(ctx);
  }

  @Override
  public Void visitExpression(SQLParser.ExpressionContext ctx) {
    return super.visitExpression(ctx);
  }

  public SQLCreate getCreate() {
    return create;
  }

  public void setCreate(SQLCreate create) {
    this.create = create;
  }

  public SQLUpdate getUpdate() {
    return update;
  }

  public void setUpdate(SQLUpdate update) {
    this.update = update;
  }

  public SQLInsert getInsert() {
    return insert;
  }

  public void setInsert(SQLInsert insert) {
    this.insert = insert;
  }

  public SQLDelete getDelete() {
    return delete;
  }

  public void setDelete(SQLDelete delete) {
    this.delete = delete;
  }

  public SQLSelect getSelect() {
    return select;
  }

  public void setSelect(SQLSelect select) {
    this.select = select;
  }
}
