import java.util.Scanner;

public class HelloUser {
  public static void main(String[] args) {
    String request = "Please enter your name: ";
    System.out.print(request);

    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();
    System.out.println("Hello, " + name + "!");
  }
}
