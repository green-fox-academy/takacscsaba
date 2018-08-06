import java.util.Scanner;

public class Sum {
  public static void main(String[] args) {
    int total = 0;

    Scanner request01 = new Scanner(System.in);
    String request1 = "Please enter number 1: ";
    System.out.print(request1);
    int numberInput1 = request01.nextInt();

    Scanner request02 = new Scanner(System.in);
    String request2 = "Please enter number 2: ";
    System.out.print(request2);
    int numberInput2 = request02.nextInt();

    sum(numberInput1, numberInput2);

  }
  public static void sum(int numberInput1, int numberInput2) {

    int total = numberInput1 + numberInput2;
    System.out.println(total);
  }
}
// - Write a function called `sum` that sum all the numbers
//   until the given parameter and returns with an integer
