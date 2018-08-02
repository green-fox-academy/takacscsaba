import java.util.Scanner;

public class FizzBuzz {
  public static void main(String[] args) {

    int a = 0;
    while (a < 100) {
      a++;

      if ((a % 5 != 0) && (a % 3 == 0)) {
        System.out.println("Fizz");
      }
      else if ((a % 5 == 0) && (a % 3 != 0)) {
        System.out.println("Buzz");
      }
      else if ((a % 5 == 0) && (a % 3 == 0)) {
        System.out.println("FizzBuzz");
      }
      else {
        System.out.println(a);
      }
    }
  }
}
