import java.util.*;

public class IsInList {
  public static void main(String... args) {
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));
    checkNums(list);
  }

  public static void checkNums(List list) {
    List checkNums = Arrays.asList(4, 8, 12, 16);
    if (list.containsAll(checkNums)) {
      System.out.println(true);
    } else {
      System.out.println(false);
    }
  }
}