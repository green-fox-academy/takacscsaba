import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PalindromeSearcher {
  public static void main(String[] args) {
    Scanner inputWord = new Scanner(System.in);
    String inputRequest = "Please type in a word: ";
    System.out.print(inputRequest);
    String input = inputWord.nextLine();

    System.out.println(palindrome(input));
  }

  public static List palindrome(String string) {
    List<Character> charList = new ArrayList<>();
    for (char c : string.toCharArray()) {
      charList.add(c);
    }
    List<Character> chars = new ArrayList<>();
    for (int i = 0; i <= string.length() - 1; i++) {
      for (int j = string.length() - 1; j > i; j--) {
        if (charList.get(i).equals(charList.get(j))) {
          chars.add(string.charAt(i));
          chars.add(string.charAt(j));
        }
      }
    }
    return chars;
  }
}