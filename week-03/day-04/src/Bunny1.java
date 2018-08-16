public class Bunny1 {
  public static void main(String[] args) {
    int bunnies = 30;
    System.out.println(bunnyEars(bunnies));

  }
  public static int bunnyEars(int n) {
    if (n == 0) {
      return 0;
    } else {
      return 2 + bunnyEars(n - 1);
    }
  }
}