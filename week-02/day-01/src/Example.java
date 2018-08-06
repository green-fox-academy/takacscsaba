import java.util.Arrays;
import java.util.Scanner;
//import java.util.Collections;

public class Example {

  public static void main(String[] args) {
    int[] array = {2, 3, 4};

    //Arrays.sort(array, Collections.reverseOrder());

    //Scanner myScanner = new Scanner(System.in);
    //Scanner new Scanner(System.in);
    //myScanner.nextLine();
    //new --> filling in the emptiness, so you can use it

    System.out.println(printIntArray(array));
  }

  public static String printIntArray(int[] array) {

    String result = "[";
    for (int i = 0; i < array.length; i++) {
      result += array[i];
      if (i != array.length - 1) {
        result += ", ";
      }
    }
    result += "]";
    return result;
  }
}