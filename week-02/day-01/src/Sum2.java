import java.util.Scanner;

public class Sum2 {
  public static void main(String[] args) {
    Scanner request01 = new Scanner(System.in);
    String request1 = "Please enter a number: ";
    System.out.print(request1);
    int numberInput = request01.nextInt();

    sum(numberInput);
  }

  public static void sum(int numberInput) {
    int total = 0;
    for (int i = 0; i <= numberInput; i++) {
      total = total + i;
    }
    System.out.println(total);
  }
}