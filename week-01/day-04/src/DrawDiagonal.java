import java.util.Scanner;

public class DrawDiagonal {
  public static void main(String[] args) {

    String request = "Please enter a number: ";
    System.out.print(request);

    Scanner input = new Scanner(System.in);
    int number = input.nextInt();

    for (int row = 1; row <= number; row++) {
      for (int column = 1; column <= number; column++) {

        if (row == 1 || row == number || column == 1 || column == number || row == column) {
          System.out.print("%");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
