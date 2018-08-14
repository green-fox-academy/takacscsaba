import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
  public static void main(String[] args) {
    String filename = "my-file.txt";
    System.out.println(lineNum(filename));
  }

  public static int lineNum(String string) {
    try {
      Path filePath = Paths.get(string);
      List<String> lines = Files.readAllLines(filePath);
      int number = lines.size();
      return number;
    } catch (Exception e) {
      return 0;
    }
  }
}
// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.