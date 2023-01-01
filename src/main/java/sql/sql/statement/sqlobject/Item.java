package sql.sql.statement.sqlobject;

import java.io.Serializable;

public class Item implements Serializable {

  public static final long serialVersionUID = 2222222222L;
  private String name;
  private String type;
  private String constrain;

  /* 如果是 char varchar string 表示最多几个字符 -1 表示不是以上类型*/
  private int size;

  @Override
  public String toString() {
    return "Item{" +
            "name='" + name + '\'' +
            ", type='" + type + '\'' +
            ", constrain='" + constrain + '\'' +
            ", size=" + size +
            '}';
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getConstrain() {
    return constrain;
  }

  public void setConstrain(String constrain) {
    this.constrain = constrain;
  }

  public boolean isPrimaryKey() {
    return "primarykey".equalsIgnoreCase(constrain);
  }

  public boolean isUnique() {
    return "unique".equalsIgnoreCase(constrain);
  }

  public boolean isNotNull() {
    return "notnull".equalsIgnoreCase(constrain);
  }
}
