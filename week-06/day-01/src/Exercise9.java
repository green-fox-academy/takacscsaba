import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Exercise9 {
  public static void main(String[] args) {
//    Write a Stream Expression to convert a char array to a string!
    ArrayList<Character> charArray = new ArrayList<>(Arrays.asList('s', 'o', 'n', '.', 'g', 'o', 'h', 'a', 'n', 'S', 'S', 'J', '2'));

    System.out.println(
        charArray.stream()
            .map(String::valueOf)
            .collect(Collectors.joining()));

    System.out.println(charToStringMethod(charArray));
  }

  public static String charToStringMethod(ArrayList<Character> charArray) {
    StringBuilder stringBuilder = new StringBuilder();
    for (Character ch : charArray) {
      stringBuilder.append(ch);
    }
    return stringBuilder.toString();
//    return charArray.toString().replaceAll(", ", "").replace("[", "").replace("]", "");
  }
}
