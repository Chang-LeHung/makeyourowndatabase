package sql.evaluator.bytecode.data;

import java.util.Objects;

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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    Int anInt = (Int) o;
    return val == anInt.val;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), val);
  }

  public Int(char dataType) {
    super(dataType);
  }
}
