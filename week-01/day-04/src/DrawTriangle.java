import java.util.Scanner;

public class DrawTriangle {
  public static void main(String[] args) {

    String request = "Please enter the height of your triangle: ";
    System.out.print(request);

    Scanner input = new Scanner(System.in);
    int number = input.nextInt();

    for (int x = 1; x <= number; x++)
    {
      for (int i = 1; i <= x; i++)
      {
        System.out.print("*");
      }
      System.out.println("");
    }
  }
}
