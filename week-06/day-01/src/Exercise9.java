import java.util.ArrayList;
import java.util.Arrays;

public class Exercise9 {
  public static void main(String[] args) {
//    Write a Stream Expression to convert a char array to a string!
    ArrayList<Character> charArray = new ArrayList<>(Arrays.asList('s', 'o', 'n', '.', 'g', 'o', 'h', 'a', 'n', 's', 's', 'j', '2'));

    

    System.out.println(charToStringMethod(charArray));
  }

  public static String charToStringMethod(ArrayList<Character> charArray) {
    return charArray.toString().toString().replaceAll(", ", "").replace("[", "").replace("]", "");
  }
}
