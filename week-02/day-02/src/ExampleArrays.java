import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExampleArrays {
  public static void main(String[] args) {

    List<Integer> list = new ArrayList<>();
    list.add(Integer.valueOf(10)); //storing Integer objects
    list.add(20); //now compiler converts it into Integer.valueOf(20)
    list.add(30);
    System.out.println(list);

    for (int i = 0; i < list.size(); i++) {
      int newInt = list.get(i) + 2;
      list.set(i, newInt);
    }

    System.out.println(list);

    int[] x = new int[5];
    int[] y = {6, 855, 5435};

    x[4] = 348;
    System.out.println(Arrays.toString(x));

    ArrayList<Integer> list2 = new ArrayList<>(5);
    ArrayList<Integer> listWithElements = new ArrayList<>();
    listWithElements.add(8);
    listWithElements.add(3277832);
    System.out.println(listWithElements);

    ArrayList<Integer> listWithElements2 = new ArrayList<>(Arrays.asList(5, 6, 9348));
    listWithElements2.addAll(listWithElements);
    System.out.println(listWithElements2);

    //Converting an array to ArrayList
    String[] arrayString = {"hello", "hi", "ciao"};
    ArrayList<String> arrayL = new ArrayList<>(Arrays.asList(arrayString));
    System.out.println(arrayL);


  }
}
