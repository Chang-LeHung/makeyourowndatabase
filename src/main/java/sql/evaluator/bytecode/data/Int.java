package sql.evaluator.bytecode.data;

public class Int extends DataType{
  private int val;

  public int getVal() {
    return val;
  }

  public void setVal(int val) {
    this.val = val;
  }

  @Override
  public String toString() {
    return "Int{" +
            "val=" + val +
            '}';
  }

  public Int(char dataType, int val) {
    super(dataType);
    this.val = val;
  }

  public Int(char dataType) {
    super(dataType);
  }
}
