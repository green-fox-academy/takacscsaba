import java.util.Scanner;

public class DrawChessTable {
  public static void main(String[] args) {

    String request = "Please enter a number: ";
    System.out.print(request);

    Scanner input = new Scanner(System.in);
    int number = input.nextInt();

    for (int row = 1; row <= number; row++) {
      for (int column = 1; column <= 4; column++) {

        if (row % 2 == 0) {
          System.out.print("% ");
        } else {
          System.out.print(" %");
        }
      }
      System.out.println();
    }
  }
}