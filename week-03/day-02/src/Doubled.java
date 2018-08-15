import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {

  public static void main(String[] args) {
    Path path = Paths.get("duplicated-chars.txt");
    everySecond(path);
  }

  public static void everySecond(Path path) {
    List<Character> chars = new ArrayList<>();
    try {
      List<String> lines = Files.readAllLines(path);
      for (int i = 0; i < lines.size(); i++) {
        String oneline = new String();
        for (int j = 0; j < lines.get(i).length(); j = j + 2) {
          oneline += lines.get(i).charAt(j);
        }
        System.out.println(oneline);
      }
    } catch (Exception e) {
    }
  }
}