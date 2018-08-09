import java.util.*;

public class IsInList {
  public static void main(String... args) {
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));
    System.out.println(checkNums(list));
  }

  public static Boolean checkNums(List list) {
    List checkNums = Arrays.asList(4, 8, 12, 16);
    boolean isIn = true;
    if (list.containsAll(checkNums)) {
      isIn = true;
    } else {
      isIn = false;
    }
    return isIn;
  }
}