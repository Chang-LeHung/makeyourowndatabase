import org.junit.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileTest {

  @Test
  public void testFile() {
    File file = new File(".");
    for (File listFile : file.listFiles()) {
      System.out.println(listFile.getName());
      System.out.println(listFile.getName().substring(0, listFile.getName().length()-2));
      System.out.println(listFile.isFile());
    }
  }

  @Test
  public void testPath() {
    Path path = Paths.get("/users", "huchang", "hello");
    System.out.println(path.getFileName());
  }

  @Test
  public void testFileLocation() throws IOException {
    FileOutputStream demo = new FileOutputStream("demo");
    demo.write("hello world".getBytes(StandardCharsets.UTF_8));
    FileDescriptor fd = demo.getFD();
    fd.sync();
    demo.close();
  }

}
