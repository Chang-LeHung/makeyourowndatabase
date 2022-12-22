import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class SyntaxTest {


  @Test
  public void test01() {
    String name = "hello world";
    byte[] bytes = name.getBytes(StandardCharsets.UTF_8);
    String s = new String(bytes, StandardCharsets.UTF_8);
    System.out.println(s);
    ArrayList<Integer> list = new ArrayList<>();
  }

  @Test
  public void convention(){
    int data = 10;
    float f = (float) data;
    System.out.println(f);
  }
}
