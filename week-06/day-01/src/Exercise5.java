import java.util.ArrayList;
import java.util.List;

public class Exercise5 {
  public static void main(String[] args) {
//    Write a Stream Expression to find the uppercase characters in a string!
    String upperLowerCases = "I wanna see Joe Hisaishi live in Budokan.";

    System.out.println(upperCaseMethod(upperLowerCases));
  }

  public static String upperCaseMethod(String string) {
    String upperString = string.toUpperCase();
    List<Character> upperLetters = new ArrayList<>();
    for (int i = 0; i < string.length(); i++) {
      if (string.charAt(i) == upperString.charAt(i) && string.charAt(i) != ' ' && string.charAt(i) != '.') {
        upperLetters.add(string.charAt(i));
      }
    }
    String upperLettersString = upperLetters.toString().replaceAll(",", "").replace("[", "").replace("]", "");
    return upperLettersString;
  }
}
