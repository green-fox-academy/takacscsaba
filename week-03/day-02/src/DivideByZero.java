import java.util.Scanner;

public class DivideByZero {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please enter a number: ");
    int input = scanner.nextInt();

    dividesTen(input);
  }

  public static int dividesTen(int number) {
    try {
      System.out.println(number = 10 / number);
    } catch (ArithmeticException e) {
      System.out.println("fail");
    }
    return number;
  }
}