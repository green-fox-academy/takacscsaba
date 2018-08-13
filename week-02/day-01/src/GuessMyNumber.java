import java.util.Scanner;

public class GuessMyNumber {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please enter the maximum number: ");
    int input = scanner.nextInt();
    myNum(input);
  }

  public static void myNum(int input) {
    int exactNumber = 1 + (int) (Math.random() * input);
    int lives = 5;

    for (int i = 5; i >= 0; i--) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Please enter your guess between 1 and " + (input - 1) + ": ");
      int guess = scanner.nextInt();
      if (i == 0) {
        System.out.println("You died. The number was: " + exactNumber);
      } else if (guess < exactNumber) {
        System.out.println("Too low. You have only " + i + " lives left.");
      } else if (guess > exactNumber) {
        System.out.println("Too high. You have only " + i + " lives left.");
      } else if (guess == exactNumber) {
        System.out.println("Congrats, you won!");
        break;
      }
    }
  }
}