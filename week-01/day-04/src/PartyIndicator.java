import java.util.Scanner;

public class PartyIndicator {
  public static void main(String[] args) {

    String girlsreq = "Please enter the number of girls: ";
    System.out.print(girlsreq);

    Scanner input1 = new Scanner(System.in);
    int girls = input1.nextInt();

    String boysreq = "Please enter the number of boys: ";
    System.out.print(boysreq);

    Scanner input2 = new Scanner(System.in);
    int boys = input2.nextInt();

    if ((boys == girls) && ((boys + girls) >= 20)) {
      System.out.println("The party is excellent!");
    } else if ((girls != 0) && (girls != boys) && ((girls + boys) >= 20)) {
      System.out.println("Quite cool party!");
    } else if ((girls != 0) && (girls + boys) < 20) {
      System.out.println("Average party...!");
    } else if (girls == 0) {
      System.out.println("Sausage party!");
    }
  }
}
