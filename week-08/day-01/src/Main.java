import java.util.Map;
import java.util.TreeMap;

public class Main {

  public static void main(String[] args) {
    // write your code here
  }

  public static boolean isAnagram(String word1, String word2) {
    if (word1.equals(word2)) {
      return true;
    } else if (word1.length() != word2.length()) {
      return false;
    }
    return false;
  }
}
