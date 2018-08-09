import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubInt {
  public static void main(String[] args) {
    int x = 1;
    List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 11, 34, 52, 61));
    System.out.println(subInt(x, numbers));
  }

  public static List<Integer> subInt(int x, List<Integer> list) {

    List<String> intToStringArr = new ArrayList<>();
    for (Integer i : list) {
      intToStringArr.add(String.valueOf(i));
    }

    List<Integer> indecesString = new ArrayList<>();
    for (int i = 0; i < list.size(); i++) {
      if (intToStringArr.get(i).contains(Integer.toString(x))) {
        indecesString.add(i);
      }
    }

    ArrayList<Integer> indicesInteger = new ArrayList<>();
    for (int i = 0; i < indecesString.size(); i++) {
      indicesInteger.add(Integer.parseInt(String.valueOf(indecesString.get(i))));
    }
    return indicesInteger;
  }
}