import java.util.HashMap;
import java.util.Map;

public class ExampleHashMap {
  public static void main(String[] args) {

    HashMap<String, Integer> grades = new HashMap<>();
    grades.put("Juli", 5);
    grades.put("Marci", 4);
    grades.put("János", 4);
    grades.put("Ili", 3);
    System.out.println(grades);
    System.out.println("Juli");

    //for (Map.Entry<String, HashMap> entry : grades.entrySet()) {

     // System.out.println("Key is: " + entry.getKey() + " & Value is: ");
     // System.out.println(entry.getValue());

   // }
  }
}
