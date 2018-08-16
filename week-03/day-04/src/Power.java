public class Power {
  public static void main(String[] args) {
    int x = 10;
    int y = 10;
    System.out.println(powerN(x, y));
  }

  public static long powerN(long n, long m) {
    if (m == 1) {
      return n;
    } else {
      return n * powerN(n, m - 1);
    }
  }
}