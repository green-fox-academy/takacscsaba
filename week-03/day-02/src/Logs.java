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
    System.out.println(getPostRatio(path));
  }

  public static List<String> uniqueIP(Path path) {
    List<String> uniqueIPList = new ArrayList<>();
    try {
      List<String> lines = Files.readAllLines(path);
      for (int i = 0; i < lines.size(); i++) {
        String IPList = lines.get(i).split("   ")[1];

        if (!uniqueIPList.contains(IPList)) {
          uniqueIPList.add(IPList);
        }
      }
    } catch (Exception e) {
    }
    return uniqueIPList;
  }

  public static double getPostRatio(Path path) {
    List<String> getList = new ArrayList<>();
    List<String> postList = new ArrayList<>();
    try {
      List<String> lines = Files.readAllLines(path);
      for (int i = 0; i < lines.size(); i++) {
        String IPList = lines.get(i).split("   ")[2];

        if (IPList.equals("GET /")) {
          getList.add(IPList);
        } else if (IPList.equals("POST /")) {
          postList.add(IPList);
        }
      }
    } catch (Exception e) {
    }
    double getPost = (double) getList.size() / (double) postList.size();
    return getPost;
  }
}