import java.lang.reflect.Array;
import java.util.*;

public class AppendLetter {
  public static void main(String... args) {
    List<String> far = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");

    System.out.println(appendA(far));
  }

  public static List appendA(List<String> far2) {
    ArrayList<String> appendA = new ArrayList<>();
    for (int i = 0; i < far2.size(); i++) {
      String temp = far2.get(i) + "a";
      appendA.add(temp);
    }
    return appendA;
  }
}