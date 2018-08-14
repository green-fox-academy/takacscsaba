import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {
  public static void main(String[] args) {
    String filename = "my-name.txt";
    writeOpen(filename);
  }

  public static void writeOpen(String string) {
    List<String> content = new ArrayList();
    content.add("Takács Csaba");

    try {
      Path filePath = Paths.get(string);
      Files.write(filePath, content, StandardOpenOption.APPEND);

      List<String> lines = Files.readAllLines(filePath);
      for (int i = 0; i < lines.size(); i++) {
        System.out.println(lines.get(i));
      }
    } catch (Exception e) {
      System.out.println("Unable to write file: my-file.txt");
    }
  }
}
