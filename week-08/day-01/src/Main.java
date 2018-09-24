import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    // write your code here
  }

  public static boolean isAnagram(String word1, String word2) {
    char[] word1Chars = word1.toLowerCase().toCharArray();
    char[] word2Chars = word2.toLowerCase().toCharArray();
    Arrays.sort(word1Chars);
    Arrays.sort(word2Chars);
    if (Arrays.equals(word1Chars, word2Chars)) {
      return true;
    } else if (word1.length() != word2.length()) {
      return false;
    }
    return false;
  }
}
