import java.util.Scanner;

public class DrawPyramid {
  public static void main(String[] args) {

    String request = "Please enter the height of your pyramid: ";
    System.out.print(request);

    Scanner input = new Scanner(System.in);
    int number = input.nextInt();

    for (int i = 1; i <= number; i++) {
      for (int j = 1; j <= number - i; j++) {
        System.out.print(" ");
      }
      for (int k = 1; k <= 2 * i - 1; k++) {
        System.out.print("*");
      }
      System.out.println();
      }
    }
  }