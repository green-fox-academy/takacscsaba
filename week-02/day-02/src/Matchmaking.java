import java.util.*;

public class Matchmaking {
  public static void main(String... args) {
    ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Claire", "Kat", "Jane"));
    ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Tom", "Todd", "Neef", "Jeff"));

    System.out.println(makingMatches(girls, boys));
  }

  public static ArrayList makingMatches(ArrayList<String> girls, ArrayList<String> boys) {
    ArrayList<String> makingMatches = new ArrayList<>();
    for (int i = 0; i < girls.size(); i++) {
      String temp1 = girls.get(i);
      String temp2 = boys.get(i);
      makingMatches.add(temp1);
      makingMatches.add(temp2);
    }
    return makingMatches;
  }
}