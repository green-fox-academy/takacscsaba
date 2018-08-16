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
// We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).