import java.util.Scanner;

public class PrintBigger {
  public static void main(String[] args) {
    String request = "Please enter a number: ";
    System.out.print(request);

    Scanner input1 = new Scanner(System.in);
    int number1 = input1.nextInt();

    System.out.print(request);

    Scanner input2 = new Scanner(System.in);
    int number2 = input2.nextInt();

    if (number1 < number2) {
      System.out.println(number2);
    }
    else if (number1 > number2) {
      System.out.println(number1);
    }
    else {
      System.out.println("They're even");
    }
  }
}
