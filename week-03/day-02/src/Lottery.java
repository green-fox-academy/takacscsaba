import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Lottery {
  public static void main(String[] args) {
    Path path = Paths.get("lottery.txt");
    System.out.println(fiveMostCommonNum(path));
  }

  public static List<String> fiveMostCommonNum(Path path) {
    HashMap<String, Integer> map = new HashMap<>();
    try {
      List<String> lines = Files.readAllLines(path);
      for (int i = 0; i < lines.size(); i++) {
        for (int j = 11; j < 16; j++) {
          String number = lines.get(i).split(";")[j];
          if (!map.containsKey(number)) {
            map.put(number, 1);
          } else {
            map.replace(number, map.get(number) + 1);
          }
        }
      }
      System.out.println(map);
    } catch (Exception e) {
    }
    List<Integer> list = new ArrayList<Integer>(map.values());
    Collections.sort(list, Collections.reverseOrder());
    List<Integer> top5Values = list.subList(0, 5);
    List<String> top5 = new ArrayList<String>();
    for (int i = 0; i < top5Values.size(); i++) {
    return top5;
  }
}
