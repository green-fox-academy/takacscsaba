import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EncodedLines {

  public static void main(String[] args) {
    Path path = Paths.get("encoded-lines.txt");
    decrypt(path);
  }

  public static void decrypt(Path path) {
    try {
      List<String> lines = Files.readAllLines(path);
      for (int i = 0; i < lines.size(); i++) {
        String oneline = new String();
        for (int j = 0; j < lines.get(i).length(); j++) {
          char c = lines.get(i).charAt(j);
          c--;
          oneline += c;
        }
        System.out.println(oneline);
      }
    } catch (Exception e) {
    }
  }
}