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
// Given base and n that are both 1 or more, compute recursively (no loops)
// the value of base to the n power, so powerN(3, 2) is 9 (3 squared).