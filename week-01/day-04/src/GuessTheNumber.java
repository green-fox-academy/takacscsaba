import java.util.Scanner;

public class GuessTheNumber {
  public static void main(String[] args) {

    int sol = 311;
    int guess = 0;

    String request = "Please enter a number: ";
    System.out.print(request);

    while (guess != sol) {
      Scanner input = new Scanner(System.in);
      guess = input.nextInt();

      if (guess < sol) {
        System.out.println("The stored number is higher");

        System.out.print(request);
      } else if (guess > sol) {
        System.out.println("The stored number is lower");

        System.out.print(request);
      }
    }
    System.out.println("You found the number: " + sol);
  }
}
