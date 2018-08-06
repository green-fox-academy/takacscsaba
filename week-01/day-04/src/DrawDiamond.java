import java.util.Scanner;

public class DrawDiamond {
  public static void main(String[] args) {

    String request = "Please enter the number of rows of your diamond: ";
    System.out.print(request);

    Scanner input = new Scanner(System.in);
    int number = input.nextInt();

    if (number % 2 == 0) {
      for (int i = 1; i <= number / 2; i++) {
        for (int j = 1; j < number - i; j++) {
          System.out.print(" ");
        }
        for (int k = 0; k < 2 * i - 1; k++) {
          System.out.print("*");
        }
        System.out.println();
      }

      for (int i = number / 2; i >= 1; i--) {
        for (int j = 1; j < number - i; j++) {
          System.out.print(" ");
        }
        for (int k = 0; k < 2 * i - 1; k++) {
          System.out.print("*");
        }

        System.out.println();
      }
    } else {
      for (int i = 1; i <= number / 2 + 1; i++) {
        for (int j = 1; j < number - i; j++) {
          System.out.print(" ");
        }
        for (int k = 0; k < 2 * i - 1; k++) {
          System.out.print("*");
        }
        System.out.println();
      }

      for (int i = number / 2; i >= 1; i--) {
        for (int j = 1; j < number - i; j++) {
          System.out.print(" ");
        }
        for (int k = 0; k < 2 * i - 1; k++) {
          System.out.print("*");
        }

        System.out.println();
      }
    }
  }
}