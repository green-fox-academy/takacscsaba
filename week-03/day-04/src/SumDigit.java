public class SumDigit {
  public static void main(String[] args) {
    int x = 2139;
    System.out.println(sumDigit(x));
  }

  public static int sumDigit(int n) {
    if (n < 10) {
      System.out.println(n);
      return n;
    } else {
      return n % 10 + sumDigit(n / 10);
    }
  }
}