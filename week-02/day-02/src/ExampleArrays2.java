import java.util.ArrayList;
import java.util.Arrays;

public class ExampleArrays2 {
  public static void main(String[] args) {
    ArrayList<Integer> list2 = new ArrayList<>(5);
    ArrayList<Integer> listWithElements = new ArrayList<>();
    listWithElements.add(8);
    listWithElements.add(3277832);
    System.out.println(listWithElements);

    ArrayList<Integer> listWithElements2 = new ArrayList<>(Arrays.asList(5, 6, 9348));
    listWithElements2.addAll(listWithElements);
    System.out.println(listWithElements2);


    System.out.println(listWithElements2.isEmpty()); //boolean
    System.out.println(listWithElements2.contains(5)); //contains 5 elements?
    System.out.println(listWithElements2.containsAll(Arrays.asList(5, 6))); //contains these elements?
    System.out.println(Integer.valueOf(6));
    System.out.println(listWithElements2.remove(0)); //removes element on index 0
    //listWithElements2.clear(); //deletes every element
    //System.out.println(listWithElements2.isEmpty());
  }
}
