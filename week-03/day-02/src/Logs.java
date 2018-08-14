import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Logs {
  public static void main(String[] args) {
    Path path = Paths.get("logs.txt");
    System.out.println(IP(path));

  }

  public static List<String> IP(Path path) {
    List<String> uniqueIPList = new ArrayList<>();
    try {
      List<String> lines = Files.readAllLines(path);
      for (int i = 0; i < lines.size(); i++) {
//        IPList.add((String) lines.get(i).subSequence(27, 38));
        String[] stringList = lines.get(i).split("   ");
        
        for (int j = 0; j < IPs.length; j++) {
          if (!uniqueIPList.contains(IPs))
        }
      }
    } catch (Exception e) {
    }
    return IPList;
  }
}
// Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP adresses.
// Write a function that returns the GET / POST request ratio.