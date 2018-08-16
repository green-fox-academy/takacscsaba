public class Fibonacci {
  public static void main(String[] args) {
    int fibonNum = 8;
    System.out.println(fibonacci(fibonNum));
  }

  public static int fibonacci(int n) {
    if (n <= 1) {
      return 0;
    } else if (n <= 2) {
      return 1;
    } else {
      return fibonacci((n - 1)) + fibonacci((n - 2));
    }
  }
}