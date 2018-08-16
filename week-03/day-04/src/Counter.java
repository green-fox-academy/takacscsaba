public class Counter {
  public static void main(String[] args) {
    int x = 10;
    counter(x);
  }

  public static int counter(int n) {
    if (n == 0) {
      return 1;
    } else {
      System.out.println(n);
      return counter(n - 1);
    }
  }
}