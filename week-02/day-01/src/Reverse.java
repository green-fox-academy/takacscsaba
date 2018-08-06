import java.util.Arrays;

public class Reverse {
  public static void main(String[] args) {
    int[] aj = {3, 4, 5, 6, 7};

    int a;

    for (int i = 0; i < aj.length / 2; i++) {
      a = aj[i];
      aj[i] = aj[aj.length - 1 - i];
      aj[aj.length - 1 - i] = a;
    }
    System.out.println(Arrays.toString(aj));
  }
}