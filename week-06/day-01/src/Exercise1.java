import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise1 {
  public static void main(String[] args) {
//    Write a Stream Expression to get the even numbers from the following array:
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

    System.out.println(numbers.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0)));
    numbers.stream()
           .filter(x -> x % 2 == 0)
           .forEach(System.out::println);

    System.out.println(evenNumsMethod(numbers));
  }

  public static List<Integer> evenNumsMethod(ArrayList<Integer> numbers){
    ArrayList<Integer> evenNumbers = new ArrayList<>();
    for (int i = 0; i < numbers.size(); i++) {
      if (numbers.get(i) % 2 == 0) {
        evenNumbers.add(numbers.get(i));
      }
    }
    return evenNumbers;
  }
}
