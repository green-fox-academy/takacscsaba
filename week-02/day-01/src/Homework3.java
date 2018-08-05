import java.util.Scanner;

public class Homework3 {

  static double myPI = 3.14159; // Class Variable

  public static void main(String[] args) {

    //System.out.println(addThem(1,2));
    int d = 5;
    tryToChange(d);
    System.out.println("main d = " + d);

  }

  public static void tryToChange(int d) {

    d = d + 1;
    System.out.println("tryToChange d = " + d);
  }

/*  public static int addThem(int a, int b) {

    double smallPI = 3.140; //Local Variable

    int c = a + b;

    return c;
  } */
}