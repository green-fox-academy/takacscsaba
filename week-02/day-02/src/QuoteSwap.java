import java.util.*;

public class QuoteSwap {
  public static void main(String... args) {
    ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));
    quoteSwap(list);
  }

  public static void quoteSwap(ArrayList<String> list) {
    Collections.swap(list, 2, 5);
    System.out.print("\"");
    for (int i = 0; i < list.size(); i++) {
      if (i < list.size() - 1) {
        System.out.print(list.get(i) + " ");
      } else {
        System.out.print(list.get(i));
      }
    }
    System.out.print("\"");
  }
}