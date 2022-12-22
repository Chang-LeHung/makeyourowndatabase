package sql.evaluator.bytecode.bytecodes;

import sql.evaluator.bytecode.Operator;

public class ByteCode {

  private Operator operator;

  public ByteCode(Operator operator) {
    this.operator = operator;
  }

  public Operator getOperator() {
    return operator;
  }

  public void setOperator(Operator operator) {
    this.operator = operator;
  }

  @Override
  public String toString() {
    return "ByteCode{" +
            "operator=" + operator +
            '}';
  }
}
