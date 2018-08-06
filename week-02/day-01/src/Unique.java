import java.util.Arrays;

public class Unique {
  public static void main(String[] args) {

    int[] input = new int[]{1, 11, 34, 11, 52, 61, 1, 34};

    int[] unique = new int[1];

    unique[0] = input[0];

    for (int i = 1; i < input.length; i++) {
      boolean match = false;
      for (int j = 0; j < unique.length; j++) {
        if (input[i] == unique[j]) {
          match = true;
        }
      }
      if (!match) {
        int[] temp = new int[unique.length + 1];
        for (int j = 0; j < unique.length; j++) {
          temp[j] = unique[j];
        }
        temp[temp.length - 1] = input[i];
        unique = temp;
      }
    }

    System.out.println(Arrays.toString(unique));

    //  Example
    //System.out.println(unique(new int[]{1, 11, 34, 11, 52, 61, 1, 34}));
    //  should print: `[1, 11, 34, 52, 61]`
  }
}
//  Create a function that takes a list of numbers as a parameter
//  Returns a list of numbers where every number in the list occurs only once