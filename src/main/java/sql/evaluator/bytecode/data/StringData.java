package sql.evaluator.bytecode.data;

public class StringData extends DataType{
  private String param;

  public String getParam() {
    return param;
  }

  public StringData(char dataType, String param) {
    super(dataType);
    this.param = param;
  }

  public void setParam(String param) {
    this.param = param;
  }

  public StringData(char dataType) {
    super(dataType);
  }
}
