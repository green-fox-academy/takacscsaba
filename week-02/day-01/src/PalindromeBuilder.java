import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PalindromeBuilder {
  public static void main(String[] args) {
    Scanner inputWord = new Scanner(System.in);
    String inputRequest = "Please type in a word: ";
    System.out.print(inputRequest);
    String input = inputWord.nextLine();

    System.out.println(palindrome(input));
    System.out.println(palindrome2(input));
  }

  public static String palindrome(String string) {

    List<Character> chars = new ArrayList<>();
    for (int i = 0; i <= string.length() - 1; i++) {
      chars.add(string.charAt(i));
    }
    for (int i = string.length() - 1; i >= 0; i--) {
      chars.add(string.charAt(i));
    }
    string = chars.toString().replace(", ", "").replace("[", "").replace("]", "");
    return string;
  }

  public static String palindrome2(String string) {
    return string + new StringBuilder(string).reverse().toString();
  }
}

