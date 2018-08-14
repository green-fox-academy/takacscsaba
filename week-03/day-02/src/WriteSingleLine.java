import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {
  public static void main(String[] args) {
    String filename = "my-file.txt";
    writeOpen(filename);
  }
  public static void writeOpen(String string) {
    try {
      List<String> content = new ArrayList();
      content.add("Takács Csaba");
      Path filePath = Paths.get(string);
      Files.write(filePath, content);

      List<String> lines = Files.readAllLines(filePath);
      for (int i = 0; i <= lines.size() ; i++) {
        System.out.println(lines.get(i));
      }
    } catch (Exception e) {
      System.out.println("Unable to write file: my-file.txt");
    }
  }
}
// Open a file called "my-file.txt"
// Write your name in it as a single line
// If the program is unable to write the file,
// then it should print an error message like: "Unable to write file: my-file.txt"
