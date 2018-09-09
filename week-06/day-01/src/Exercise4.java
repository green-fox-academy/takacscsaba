import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise4 {
  public static void main(String[] args) {
//    Write a Stream Expression to find which number squared value is more than 20 from the following array:
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 9, 2, 8, 6, 5));

    System.out.println(sqrValueAbove20Method(numbers));
  }

  public static List<Integer> sqrValueAbove20Method(ArrayList<Integer> numbers) {
    List<Integer> sqrValue = new ArrayList<>();
    for (int i = 0; i < numbers.size(); i++) {
      if (numbers.get(i) * numbers.get(i) > 20) {
        sqrValue.add(numbers.get(i) * numbers.get(i));
      }
    }
    return sqrValue;
  }
}
