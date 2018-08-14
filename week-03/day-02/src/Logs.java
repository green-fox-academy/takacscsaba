import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Logs {
  public static void main(String[] args) {
    Path path = Paths.get("logs.txt");
    System.out.println(uniqueIP(path));

  }

  public static List<String> uniqueIP(Path path) {
    List<String> uniqueIPList = new ArrayList<>();
    try {
      List<String> lines = Files.readAllLines(path);
      for (int i = 0; i < lines.size(); i++) {
//        IPList.add((String) lines.get(i).subSequence(27, 38));
        String IPList = lines.get(i).split("   ")[1];

          if (!uniqueIPList.contains(IPList)) {
            uniqueIPList.add(IPList);
        }
      }
    } catch (Exception e) {
    }
    return uniqueIPList;
  }
}
// Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns the GET / POST request ratio.