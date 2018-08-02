import java.util.Scanner;

public class OddEven {
  public static void main(String[] args) {
    String request = "Please enter a number: ";
    System.out.print(request);

    Scanner input = new Scanner(System.in);
    int number = input.nextInt();

    if ((number % 2) == 0) {
      System.out.println("Even");
    }
    else {
      System.out.println("Odd");
    }
  }
}
