import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise3 {
  public static void main(String[] args) {
//    Write a Stream Expression to get the squared value of the positive numbers from the following array:
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

    numbers.stream()
           .filter(x -> x % 2 ==0)
           .mapToInt(x -> x*x)
           .forEach(System.out::println);

    System.out.println(sqrValueMethod(numbers));
  }

  public static List<Integer> sqrValueMethod(ArrayList<Integer> numbers) {
    List<Integer> sqrValue = new ArrayList<>();
    for (int i = 0; i < numbers.size(); i++) {
      if (numbers.get(i) % 2 ==0) {
        sqrValue.add(numbers.get(i) * numbers.get(i));
      }
    }
    return sqrValue;
  }
}
