package sql.evaluator.bytecode.data;

import java.util.Objects;

public class StringData extends DataType{
  private String param;

  public String getParam() {
    return param;
  }

  public StringData(char dataType, String param) {
    super(dataType);
    this.param = param;
  }

  @Override
  public String toString() {
    return "StringData{" +
            "param='" + param + '\'' +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    StringData that = (StringData) o;
    return Objects.equals(param, that.param);
  }

  @Override
  public String toStr() {
    return "" + param;
  }


  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), param);
  }

  public void setParam(String param) {
    this.param = param;
  }

  public StringData(char dataType) {
    super(dataType);
  }
}
