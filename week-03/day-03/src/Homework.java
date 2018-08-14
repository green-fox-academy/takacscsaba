import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Homework {
  public static void main(String[] args) {
    ArrayList<Map<String, Object>> map = new ArrayList<Map<String, Object>>();

    Map<String, Object> row0 = new HashMap<String, Object>();
    row0.put("type", "White Birch");
    row0.put("leaf color", "green");
    row0.put("age", 140);
    row0.put("sex", "female");
    map.add(row0);

    Map<String, Object> row1 = new HashMap<String, Object>();
    row1.put("type", "Silky Oak");
    row1.put("leaf color", "yellow");
    row1.put("age", 100);
    row1.put("sex", "male");
    map.add(row1);

    Map<String, Object> row2 = new HashMap<String, Object>();
    row2.put("type", "Colorado blue spruce");
    row2.put("leaf color", "blue or blue-green");
    row2.put("age", 60);
    row2.put("sex", "female");
    map.add(row2);

    Map<String, Object> row3 = new HashMap<String, Object>();
    row3.put("type", "Coconut Palm");
    row3.put("leaf color", "green");
    row3.put("age", 80);
    row3.put("sex", "male");
    map.add(row3);

    Map<String, Object> row4 = new HashMap<String, Object>();
    row4.put("type", "Red Maple");
    row4.put("leaf color", "green");
    row4.put("age", 200);
    row4.put("sex", "female");
    map.add(row4);

    for (Map<String, Object> mapElement : map) {
      System.out.println(mapElement.get("type"));
    }
  }
}
