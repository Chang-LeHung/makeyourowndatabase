package db.actions;

import sql.evaluator.bytecode.data.DataType;
import sql.sql.statement.sqlobject.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface DBOperations {

  List<Map<String, DataType>> doSelect(SQLSelect select);

  boolean doCreate(SQLCreate create);

  boolean doUpdate(SQLUpdate update);

  boolean doDelete(SQLDelete delete);

  boolean doInsert(SQLInsert insert);
}
