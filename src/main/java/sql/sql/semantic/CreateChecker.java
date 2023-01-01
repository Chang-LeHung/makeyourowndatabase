package sql.sql.semantic;

import sql.sql.statement.sqlobject.Item;
import sql.sql.statement.sqlobject.SQLCreate;

import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreateChecker implements Checker {

  private SQLCreate create;
  private String errMsg;

  public CreateChecker(SQLCreate create) {
    this.create = create;
  }

  public CreateChecker() {

  }

  public String getErrMsg() {
    return errMsg;
  }

  public SQLCreate getCreate() {
    return create;
  }

  public void setCreate(SQLCreate create) {
    this.create = create;
  }

  @Override
  public boolean doCheck() {
    if (create.gettableName() == null) {
      errMsg = "table name should not be null";
      return false;
    }

    List<Item> items = create.getItems();
    List<String> primaryKey = create.getPrimaryKey();
    if (primaryKey.size() == 0) {
      for (Item item : items) {
        if (item.isPrimaryKey())
          primaryKey.add(item.getName());
      }
      if (primaryKey.size() == 0) {
        errMsg = "no primary key";
        return false;
      }
    }else {
      for (Item item : items) {
        if (item.isPrimaryKey()) {
          errMsg = "primary key can not exist in item and list them alone at the same time";
          return false;
        }
      }
      Set<String> set = items.stream().map(Item::getName).collect(Collectors.toSet());
      if (!set.containsAll(primaryKey)) {
        errMsg = "not all primary key exist in item";
        return false;
      }
    }
    return true;
  }

  @Override
  public void reset() {

  }
}
