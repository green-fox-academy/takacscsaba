import java.util.Scanner;

public class DrawTriangle {
  public static void main(String[] args) {

    String request = "Please enter the height of your triangle: ";
    System.out.print(request);

    Scanner input = new Scanner(System.in);
    int number = input.nextInt();

    for (int i = 1; i <= number; i++)
    {
      for (int j = 1; j <= i; j++)
      {
        System.out.print("*");
      }
      System.out.println("");
    }
  }
}