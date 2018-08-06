import java.util.Scanner;

public class ParametricAverage {

  public static void main(String[] args) {
    Scanner question = new Scanner(System.in);

    int total = 0;

    System.out.print("Please input a number: ");

    int number = question.nextInt();

    for (int i = 0; i < number; i++) {
      System.out.print("Number " + (i + 1) + " : ");
      int input = question.nextInt();
      total = input + total;
    }

    float avr = (float) total / (float) number;

    if (avr % 1 != 0) {
      System.out.println("Sum: " + total + " Avr: " + avr);
    } else {
      System.out.println("Sum: " + total + " Avr: " + Math.round(avr));
    }
  }
}
