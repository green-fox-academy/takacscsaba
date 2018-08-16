public class NumberAdder {
  public static void main(String[] args) {
    int x = 3;
    System.out.println(counter(x));
  }

  public static int counter(int n) {
    if (n == 0) {
      return 0;
    } else {
      System.out.println(n);
      return counter(n - 1) + n;
    }
  }
}
// Write a recursive function that takes one parameter: n and adds numbers from 1 to n.