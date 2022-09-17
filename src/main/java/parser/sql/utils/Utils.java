package parser.sql.utils;

import java.util.HashSet;

public class Utils {
  
  public static HashSet<ReserveWord> startKeyWord = new HashSet<>();
  
  static {
    startKeyWord.add(ReserveWord.DELETE);
    startKeyWord.add(ReserveWord.CREATE);
    startKeyWord.add(ReserveWord.DROP);
    startKeyWord.add(ReserveWord.UPDATE);
    startKeyWord.add(ReserveWord.WHERE);
    startKeyWord.add(ReserveWord.FROM);
    startKeyWord.add(ReserveWord.INSERT);
    startKeyWord.add(ReserveWord.JOIN);
    startKeyWord.add(ReserveWord.SELECT);
  }
}
