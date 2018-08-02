import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
      double mile = 0.621371;

      String request = "Please enter the kilometer (use whole number): ";
      System.out.print(request);

      Scanner scanner = new Scanner(System.in);
      int kilometer = scanner.nextInt();
      System.out.println(kilometer * mile);
  }
}
