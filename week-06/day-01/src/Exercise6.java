import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise6 {
  public static void main(String[] args) {
//    Write a Stream Expression to find the strings which starts with A and ends with I in the following array:
    ArrayList<String> cities = new ArrayList<>(Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS"));

    cities.stream()
        .filter(x -> x.charAt(0) == 'A')
        .filter(x -> x.charAt(x.length() - 1) == 'I')
        .forEach(System.out::println);

    System.out.println(AI(cities));
  }

  public static List<String> AI(ArrayList<String> cities) {
    List<String> AICities = new ArrayList<>();
    for (int i = 0; i < cities.size(); i++) {
      if (cities.get(i).charAt(0) == 'A' && cities.get(i).charAt(cities.get(i).length() - 1) == 'I') {
        AICities.add(cities.get(i));
      }
    }
    return AICities;
  }
}
