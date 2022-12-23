package sql.sql.statement.sqlobject;

public class Filed {


  private String name;
  private String aggregation;

  @Override
  public String toString() {
    return "Filed{" +
            "name='" + name + '\'' +
            ", aggregation='" + aggregation + '\'' +
            '}';
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAggregation() {
    return aggregation;
  }

  public void setAggregation(String aggregation) {
    this.aggregation = aggregation;
  }
}
