package sql.evaluator.bytecode.data;

import java.util.Objects;

public class Bool extends DataType implements ToStr{

  private boolean val;
  public Bool(char dataType) {
    super(dataType);
  }

  public boolean isVal() {
    return val;
  }

  public void setVal(boolean val) {
    this.val = val;
  }

  @Override
  public String toString() {
    return "Bool{" +
            "val=" + val +
            '}';
  }

  @Override
  public String toStr() {
    return "" + val;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    Bool bool = (Bool) o;
    return val == bool.val;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), val);
  }

  public Bool(char dataType, boolean val) {
    super(dataType);
    this.val = val;
  }
}
