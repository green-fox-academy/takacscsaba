import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Exercise7 {
  public static void main(String[] args) {
//    Write a Stream Expression to find the frequency of characters in a given string!
    String charFrequency = "I wanna see Joe Hisaishi live in Budokan.";


    System.out.println(charFreqMethod(charFrequency));
  }

  public static Map<Character, Integer> charFreqMethod(String charFrequency) {
    Map<Character, Integer> charFreqCount = new HashMap<>();
    for (int i = 0; i < charFrequency.length(); i++) {
      Character c = charFrequency.charAt(i);
      if (!charFreqCount.containsKey(c)) {
        charFreqCount.put(c, 1);
      } else {
        charFreqCount.replace(c, charFreqCount.get(c) + 1);
      }
    }
    return charFreqCount;
  }
}
