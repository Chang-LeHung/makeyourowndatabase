package db.engines.simple;

public class Item {

  private String name;
  private String type;

  /* 如果是 char varchar string 表示最多几个字符 -1 表示不是以上类型*/
  private int size;

  @Override
  public String toString() {
    return "Item{" +
            "name='" + name + '\'' +
            ", type=" + type +
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
}
