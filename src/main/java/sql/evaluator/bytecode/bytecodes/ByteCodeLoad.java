package sql.evaluator.bytecode.bytecodes;

import sql.evaluator.bytecode.Operator;

public class ByteCodeLoad extends ByteCode{
  private String variableName;

  public String getVariableName() {
    return variableName;
  }

  public void setVariableName(String variableName) {
    this.variableName = variableName;
  }

  @Override
  public String toString() {
    return "ByteCodeLoad{" +
            "variableName='" + variableName + '\'' +
            '}';
  }

  public ByteCodeLoad(Operator operator, String variableName) {
    super(operator);
    this.variableName = variableName;
  }

  public ByteCodeLoad(Operator operator) {
    super(operator);
  }
}
