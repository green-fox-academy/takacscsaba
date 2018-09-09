import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Exercise8 {
  public static void main(String[] args) {
//    Write a Stream Expression to find the frequency of numbers in the following array:
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2));

    System.out.println(
        numbers.stream()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));

    System.out.println(numFreqMethod(numbers));
  }

  public static Map<Integer, Integer> numFreqMethod(ArrayList<Integer> numbers) {
    Map<Integer, Integer> numFreqCount = new HashMap<>();
    for (int i = 0; i < numbers.size(); i++) {
      int num = numbers.get(i);
      if (!numFreqCount.containsKey(num)) {
        numFreqCount.put(num, 1);
      } else {
        numFreqCount.replace(num, numFreqCount.get(num) + 1);
      }
    }
    return numFreqCount;
  }
}
