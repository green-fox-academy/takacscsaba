import java.util.Scanner;

public class factorio {
  public static void main(String[] args) {
    Scanner request01 = new Scanner(System.in);
    String request1 = "Please enter a number: ";
    System.out.print(request1);
    int numberInput = request01.nextInt();

    System.out.println(factorio(numberInput));
  }

  public static int factorio(int numberInput) {
    int factorio = 1;
    for (int i = 1; i <= numberInput; i++) {
      factorio = factorio * i;
    }
    return factorio;

  }

}