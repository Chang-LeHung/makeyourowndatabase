package db.actions;

import sql.sql.statement.sqlobject.*;

import java.util.HashMap;

public interface DBOperations {

  HashMap<String, Object> doSelect(SQLSelect select);

  void doCreate(SQLCreate create);

  void doUpdate(SQLUpdate update);

  void doDelete(SQLDelete delete);

  void doInsert(SQLInsert insert);
}
