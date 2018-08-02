import java.util.Scanner;

public class AnimalsAndLegs {
  public static void main(String[] args) {

    int chicklegs = 2;
    int piglegs = 4;

    String request1 = "Please enter the number of chickens (use whole number): ";
    System.out.print(request1);

    Scanner scanner1 = new Scanner(System.in);
    int chicken = scanner1.nextInt();

    String request2 = "Please enter the number of pigs (use whole number): ";
    System.out.print(request2);

    Scanner scanner2 = new Scanner(System.in);
    int pig = scanner2.nextInt();

    int legnum = (chicken * chicklegs) + (pig * piglegs);
    System.out.println("Your animals have " + legnum + " legs! Yeey!");
    // Write a program that asks for two integers
    // The first represents the number of chickens the farmer has
    // The second represents the number of pigs owned by the farmer
    // It should print how many legs all the animals have
  }
}
