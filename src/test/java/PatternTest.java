import org.junit.Test;

import java.util.regex.Pattern;

public class PatternTest {

  @Test
  public void test() {
    boolean b = Pattern.matches("huchang.*", "huchangasdasd");
    System.out.println(b);
    System.out.println(Pattern.matches(".hu", "ahu"));
  }
}
