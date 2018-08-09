import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bubble {
  public static void main(String[] args) {
    List<Integer> listInt = new ArrayList<>();
    Collections.addAll(listInt, new Integer[]{32, 11, 7732, 2, 423342, 2323});
    System.out.println(bubble(listInt));
    System.out.println(advancedBubble(listInt));
  }

  public static List<Integer> bubble(List<Integer> list) {
    Collections.sort(list);
    return list;
  }

  public static List<Integer> advancedBubble(List<Integer> list) {
    Collections.sort(list);
    List<Integer> listBackward = new ArrayList<>();
    boolean descending = true;
    if (descending) {
      for (int i = list.size() - 1; i >= 0; i--) {
        listBackward.add(list.get(i));
      }
    }
    return listBackward;
  }
}
//  Create a function that takes a list of numbers as parameter
//  Returns a list where the elements are sorted in ascending numerical order
//  Make a second boolean parameter, if it's `true` sort that list descending

//  Example:
//    System.out.println(bubble(new int[] {34, 12, 24, 9, 5}));
//        //  should print [5, 9, 12, 24, 34]
//        System.out.println(advancedBubble(new int[] {34, 12, 24, 9, 5}, true));
//  should print [34, 24, 12, 9, 5]