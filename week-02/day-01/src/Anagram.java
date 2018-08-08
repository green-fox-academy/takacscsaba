import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Anagram {
  public static void main(String[] args) {
    Scanner inputWord = new Scanner(System.in);
    String inputRequest = "Please type in a word: ";
    System.out.print(inputRequest);
    String input1 = inputWord.nextLine();
    System.out.print(inputRequest);
    String input2 = inputWord.nextLine();

    boolean answer = anagram(input1, input2);
    System.out.println(answer);
  }

  public static Boolean anagram(String string1, String string2) {

    List<Character> chars1 = new ArrayList<>();
    List<Character> chars2 = new ArrayList<>();

    for (char ch : string1.toCharArray()) {
      chars1.add(ch);
    }
    for (char ch : string2.toCharArray()) {
      chars2.add(ch);
    }

    Collections.sort(chars1);
    Collections.sort(chars2);
    return chars1.equals(chars2);
  }
}