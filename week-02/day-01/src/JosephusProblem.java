import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JosephusProblem {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please enter the number of players: ");
    int input = scanner.nextInt();
    //
    List<Integer> numbers = new ArrayList<>();
    for (int i = 1; i <= input; i++) {
      numbers.add(i);
    }

    System.out.println(numbers.toString());
    while (numbers.size() != 0) {
      for (int i = 0; i <= numbers.size(); i++) {
        if (i == numbers.size()) {
          numbers.remove(i);
          System.out.println(numbers.toString());
        } else {
          numbers.remove(i + 1);
          System.out.println(numbers.toString());
        }
      }
    }
  }
//  public static int winner(int playersNum) {
//      }
}
// Write a function to solve Josephus Problem.
// The program should ask for a number, this number represents how many people are in the "game".
// The return value should be the number of the "winning" seat.
//
//    Examples
//    number of people	number of the winning seat
//    1	                1
//    2	                1
//    3	                3
//    7	                7
//    12	              9
//    41	              19