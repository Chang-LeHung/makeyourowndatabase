package sql.evaluator.bytecode.data;

import sql.evaluator.bytecode.Utils;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Container extends DataType{

  private List<DataType> container;

  public Container(char dataType, List<DataType> container) {
    super(dataType);
    this.container = container;
  }

  @Override
  public String toStr() {
    return "" + container;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    Container container1 = (Container) o;
    return Objects.equals(container, container1.container);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), container);
  }

  public List<DataType> getContainer() {
    return container;
  }

  public void setContainer(List<DataType> container) {
    this.container = container;
  }

  public Container(char dataType) {
    super(dataType);
  }

  public double min() {
    DataType t = container.get(0);
    for(int i = 1; i < container.size(); ++i) {
      if (!Utils.compare(t, container.get(i)))
        t = container.get(i);
    }
    return Utils.dataToFloat(t);
  }

  public double max() {
    DataType t = container.get(0);
    for(int i = 1; i < container.size(); ++i) {
      if (Utils.compare(t, container.get(i)))
        t = container.get(i);
    }
    return Utils.dataToFloat(t);
  }

  public double avg() {
    double val = 0;
    for (DataType data : container) {
      if (data instanceof Float)
        val += Utils.dataToFloat(data);
      else
        val += Utils.dataToInt(data);
    }
    return val / container.size();
  }
}
