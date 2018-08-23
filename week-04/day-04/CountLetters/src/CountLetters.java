import java.util.HashMap;
import java.util.Map;

public class CountLetters {
  public Map<String, Integer> counter(String string) {
    Map<String, Integer> dictionary = new HashMap<>();

    for (char c : string.toCharArray()) {
      String str = c + "";
      if (!dictionary.containsKey(str)) {
        dictionary.put(str, 1);
      } else {
        dictionary.put(str, dictionary.get(str) + 1);
      }
    }
    return dictionary;
  }
}