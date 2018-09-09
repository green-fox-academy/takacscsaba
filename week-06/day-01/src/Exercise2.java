import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise2 {
  public static void main(String[] args) {
//    Write a Stream Expression to get the average value of the odd numbers from the following array:
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

    System.out.println(
        numbers.stream()
            .filter(x -> x % 2 != 0)
            .mapToDouble(x -> x)
            .average());

    System.out.println(avrValueMethod(numbers));
  }

  public static double avrValueMethod(ArrayList<Integer> numbers) {
    double avrValue = 0;
    List<Integer> oddNums = new ArrayList<>();
    for (int i = 0; i < numbers.size(); i++) {
      if (numbers.get(i) % 2 != 0) {
        avrValue += numbers.get(i);
        oddNums.add(numbers.get(i));
      }
    }
    double avr = avrValue / oddNums.size();
    return avr;
  }
}
