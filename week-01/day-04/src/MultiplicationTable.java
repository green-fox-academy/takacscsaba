import java.util.Scanner;

public class MultiplicationTable {
  public static void main(String[] args) {

    String request = "Please enter number: ";
    System.out.print(request);

    Scanner input = new Scanner(System.in);
    int number = input.nextInt();

    for (int i = 1; i <= 10; i++) {
      System.out.println(i + " * " + number + " = " + (i * number));
    }
  }
}
