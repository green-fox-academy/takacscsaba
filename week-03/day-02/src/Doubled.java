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
    List<String> string = new ArrayList<>();
    List<Character> chars = new ArrayList<>();
    try {
      List<String> lines = Files.readAllLines(path);
      for (int i = 0; i < lines.size(); i++) {
        string.add(lines.get(i) + "\n");
      }
      for (int i = 0; i < string.size(); i++) {
        for (int j = 0; j < lines.get(i).length(); j = j + 2) {
          chars.add(string.get(i).charAt(j));
        }
      }
    } catch (Exception e) {
    }
    StringBuilder builder = new StringBuilder(chars.size());
    for (Character ch : chars) {
      builder.append(ch);
    }
    System.out.println(builder.toString());
  }
}
// Create a method that decrypts the duplicated-chars.txt