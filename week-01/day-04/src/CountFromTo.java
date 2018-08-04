import java.util.Scanner;

public class CountFromTo {
  public static void main(String[] args) {


    String request = "Please enter number: ";
    System.out.print(request);

    Scanner input1 = new Scanner(System.in);
    int number1 = input1.nextInt();

    System.out.print(request);

    Scanner input2 = new Scanner(System.in);
    int number2 = input2.nextInt();

    if (number1 >= number2) {
      System.out.println("The second number should be bigger");
    }
    else if (number1 < number2) {
      for (int i = number1; i < number2; i++) {
        System.out.println(i);
      }
    }
  }
}
