import java.util.Scanner;

public class AverageOfInput {
  public static void main(String[] args) {

    String request1 = "Please enter number 1: ";
    System.out.print(request1);
    Scanner scanner1 = new Scanner(System.in);
    int number1 = scanner1.nextInt();

    String request2 = "Please enter number 2: ";
    System.out.print(request2);
    Scanner scanner2 = new Scanner(System.in);
    int number2 = scanner2.nextInt();


    String request3 = "Please enter number 3: ";
    System.out.print(request3);
    Scanner scanner3 = new Scanner(System.in);
    int number3 = scanner3.nextInt();


    String request4 = "Please enter number 4: ";
    System.out.print(request4);
    Scanner scanner4 = new Scanner(System.in);
    int number4 = scanner4.nextInt();


    String request5 = "Please enter number 5: ";
    System.out.print(request5);
    Scanner scanner5 = new Scanner(System.in);
    int number5 = scanner5.nextInt();

    int sum = number1 + number2 + number3 + number4 + number5;
    float avr = (number1 + number2 + number3 + number4 + number5) / 5;

    System.out.println("Sum: " + sum + ", Average: " + avr);
  }
}
