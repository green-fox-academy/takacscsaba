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