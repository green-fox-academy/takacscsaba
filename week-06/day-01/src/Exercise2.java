import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise2 {
  public static void main(String[] args) {
//    Write a Stream Expression to get the average value of the odd numbers from the following array:
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

    System.out.println(
        numbers.stream()
               .mapToDouble(x -> x)
               .average());

    System.out.println(avrValueMethod(numbers));
  }

  public static double avrValueMethod(ArrayList<Integer> numbers) {
    double avrValue = 0;
    for (int i = 0; i < numbers.size(); i++) {
      avrValue += numbers.get(i);
    }
    double avr = avrValue / numbers.size();
    return avr;
  }
}
