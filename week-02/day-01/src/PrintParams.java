import java.util.Scanner;

public class PrintParams {
  public static void main(String[] args) {
    printParams("izebize", "szepcicahercegno", "hellobelloka");

  }

  public static void printParams(String... a) {

    for (int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
    }
  }
}