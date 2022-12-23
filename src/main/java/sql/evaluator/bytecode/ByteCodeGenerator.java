package sql.evaluator.bytecode;

import sql.evaluator.EvaluatorBaseVisitor;
import sql.evaluator.EvaluatorParser;
import sql.evaluator.bytecode.bytecodes.ByteCode;
import sql.evaluator.bytecode.bytecodes.ByteCodeCall;
import sql.evaluator.bytecode.bytecodes.ByteCodeConst;
import sql.evaluator.bytecode.bytecodes.ByteCodeLoad;
import sql.evaluator.bytecode.data.Float;
import sql.evaluator.bytecode.data.Int;
import sql.evaluator.bytecode.data.StringData;

import java.util.List;

public class ByteCodeGenerator extends EvaluatorBaseVisitor<Void> {

  private List<ByteCode> byteCodes;

  @Override
  public Void visitSingleString(EvaluatorParser.SingleStringContext ctx) {
    String text = ctx.ID().getText();
    StringData data = new StringData((char) 3, text);
    byteCodes.add(new ByteCodeConst(Operator.LOAD_CONST, data));
    return null;
  }

  @Override
  public Void visitDoubleString(EvaluatorParser.DoubleStringContext ctx) {
    String text = ctx.ID().getText();
    StringData data = new StringData((char) 3, text);
    byteCodes.add(new ByteCodeConst(Operator.LOAD_CONST, data));
    return null;
  }

  public ByteCodeGenerator(List<ByteCode> byteCodes) {
    this.byteCodes = byteCodes;
  }

  public List<ByteCode> getByteCodes() {
    return byteCodes;
  }

  public void setByteCodes(List<ByteCode> byteCodes) {
    this.byteCodes = byteCodes;
  }

  @Override
  public Void visitNot(EvaluatorParser.NotContext ctx) {
    EvaluatorParser.ConditionsContext conditions = ctx.conditions();
    visit(conditions);
    byteCodes.add(new ByteCode(Operator.NOT));
    return null;
  }

  @Override
  public Void visitOr(EvaluatorParser.OrContext ctx) {
    EvaluatorParser.ConditionsContext conditions1 = ctx.conditions(0);
    visit(conditions1);
    EvaluatorParser.ConditionsContext conditions = ctx.conditions(1);
    visit(conditions);
    byteCodes.add(new ByteCode(Operator.OR));
    return null;
  }

  @Override
  public Void visitParensCondition(EvaluatorParser.ParensConditionContext ctx) {
    return super.visitParensCondition(ctx);
  }

  @Override
  public Void visitSingle(EvaluatorParser.SingleContext ctx) {
    return super.visitSingle(ctx);
  }

  @Override
  public Void visitAnd(EvaluatorParser.AndContext ctx) {
    EvaluatorParser.ConditionsContext conditions1 = ctx.conditions(0);
    visit(conditions1);
    EvaluatorParser.ConditionsContext conditions = ctx.conditions(1);
    visit(conditions);
    byteCodes.add(new ByteCode(Operator.AND));
    return null;
  }

  @Override
  public Void visitGt(EvaluatorParser.GtContext ctx) {
    EvaluatorParser.ExpressionContext expression = ctx.expression(0);
    visit(expression);
    expression = ctx.expression(1);
    visit(expression);
    byteCodes.add(new ByteCode(Operator.GT));
    return null;
  }

  @Override
  public Void visitLt(EvaluatorParser.LtContext ctx) {
    EvaluatorParser.ExpressionContext expression = ctx.expression(0);
    visit(expression);
    expression = ctx.expression(1);
    visit(expression);
    byteCodes.add(new ByteCode(Operator.LT));
    return null;
  }

  @Override
  public Void visitGe(EvaluatorParser.GeContext ctx) {
    EvaluatorParser.ExpressionContext expression = ctx.expression(0);
    visit(expression);
    expression = ctx.expression(1);
    visit(expression);
    byteCodes.add(new ByteCode(Operator.GE));
    return null;
  }

  @Override
  public Void visitLe(EvaluatorParser.LeContext ctx) {
    EvaluatorParser.ExpressionContext expression = ctx.expression(0);
    visit(expression);
    expression = ctx.expression(1);
    visit(expression);
    byteCodes.add(new ByteCode(Operator.LE));
    return null;
  }

  @Override
  public Void visitEqual(EvaluatorParser.EqualContext ctx) {
    EvaluatorParser.ExpressionContext expression = ctx.expression(0);
    visit(expression);
    expression = ctx.expression(1);
    visit(expression);
    byteCodes.add(new ByteCode(Operator.EQ));
    return null;
  }

  @Override
  public Void visitNEqual(EvaluatorParser.NEqualContext ctx) {
    EvaluatorParser.ExpressionContext expression = ctx.expression(0);
    visit(expression);
    expression = ctx.expression(1);
    visit(expression);
    byteCodes.add(new ByteCode(Operator.NE));
    return null;
  }

  @Override
  public Void visitFunction(EvaluatorParser.FunctionContext ctx) {
    ByteCodeCall call = new ByteCodeCall(Operator.CALL);
    List<EvaluatorParser.ExpressionContext> contexts = ctx.expression();
    for (EvaluatorParser.ExpressionContext context : contexts) {
      visit(context);
    }
    call.setFunctionName(ctx.ID().getText());
    call.setNumParams(contexts.size());
    byteCodes.add(call);
    return null;
  }

  @Override
  public Void visitNInt(EvaluatorParser.NIntContext ctx) {
    String text = ctx.INT().getText();
    byteCodes.add(new ByteCodeConst(Operator.LOAD_CONST,
            new Int((char) 0, -Integer.parseInt(text))));
    return null;
  }

  @Override
  public Void visitMulDiv(EvaluatorParser.MulDivContext ctx) {
    EvaluatorParser.ExpressionContext expression = ctx.expression(0);
    visit(expression);
    expression = ctx.expression(1);
    visit(expression);
    int type = ctx.op.getType();
    if (type == EvaluatorParser.MUL)
      byteCodes.add(new ByteCode(Operator.MUL));
    else if (type == EvaluatorParser.DIV)
      byteCodes.add(new ByteCode(Operator.DIV));
    return null;
  }

  @Override
  public Void visitAddSub(EvaluatorParser.AddSubContext ctx) {
    EvaluatorParser.ExpressionContext expression = ctx.expression(0);
    visit(expression);
    expression = ctx.expression(1);
    visit(expression);
    int type = ctx.op.getType();
    if (type == EvaluatorParser.SUB)
      byteCodes.add(new ByteCode(Operator.SUB));
    else if (type == EvaluatorParser.ADD)
      byteCodes.add(new ByteCode(Operator.ADD));
    return null;
  }

  @Override
  public Void visitParens(EvaluatorParser.ParensContext ctx) {
    return super.visitParens(ctx);
  }

  @Override
  public Void visitNFloat(EvaluatorParser.NFloatContext ctx) {
    String text = ctx.FLOAT().getText();
    ByteCodeConst code = new ByteCodeConst(Operator.LOAD_CONST,
            new Float((char) 1, -java.lang.Float.parseFloat(text)));
    byteCodes.add(code);
    return null;
  }

  @Override
  public Void visitPInt(EvaluatorParser.PIntContext ctx) {
    String text = ctx.INT().getText();
    ByteCodeConst code = new ByteCodeConst(Operator.LOAD_CONST, new Int((char) 0, Integer.parseInt(text)));
    byteCodes.add(code);
    return null;
  }

  @Override
  public Void visitID(EvaluatorParser.IDContext ctx) {
    String text = ctx.ID().getText();
    byteCodes.add(new ByteCodeLoad(Operator.LOAD_VAR, text));
    return null;
  }

  @Override
  public Void visitPFloat(EvaluatorParser.PFloatContext ctx) {
    String text = ctx.FLOAT().getText();
    Float data = new Float((char) 1, java.lang.Float.parseFloat(text));
    byteCodes.add(new ByteCodeConst(Operator.LOAD_CONST, data));
    return null;
  }
}