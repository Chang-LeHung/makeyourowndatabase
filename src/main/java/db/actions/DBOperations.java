package db.actions;

import sql.sql.statement.sqlobject.*;

import java.util.HashMap;

public interface DBOperations {

  HashMap<String, Object> doSelect(SQLSelect select);

  boolean doCreate(SQLCreate create);

  boolean doUpdate(SQLUpdate update);

  boolean doDelete(SQLDelete delete);

  boolean doInsert(SQLInsert insert);
}
