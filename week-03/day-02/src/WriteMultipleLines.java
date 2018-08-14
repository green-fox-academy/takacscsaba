import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WriteMultipleLines {
  public static void main(String[] args) {
    Path filepath = Paths.get("my-new-file.txt");
    String word = "apple";
    int number = 5;
    writer(filepath, word, number);
  }

  public static void writer(Path path, String word, int number) {
    try {
      List<String> content = new ArrayList();
      content.add(word);
      for (int i = 0; i < number; i++) {
        Files.write(path, content, StandardOpenOption.APPEND);
      }
      List<String> lines = Files.readAllLines(path);
    } catch (Exception e) {
      System.out.println("nop");
    }
  }
}