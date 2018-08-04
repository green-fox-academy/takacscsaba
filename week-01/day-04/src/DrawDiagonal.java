import java.util.Scanner;

public class DrawDiagonal {
  public static void main(String[] args) {

    String request = "Please enter a number: ";
    System.out.print(request);

    Scanner input = new Scanner(System.in);
    int number = input.nextInt();

    for (int i = 1; i <= number; i++) {
      for (int j = 1; j <= number; j++) {

        if (i == 1 || i == number || j == 1 || j == number || i == j) {
          System.out.print("%");
        } else {
          System.out.print(" ");
        }
// %%%%%
// %%  %
// % % %
// %  %%
// %%%%%
      }
      System.out.println();
    }
  }
}
