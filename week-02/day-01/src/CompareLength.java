public class CompareLength {
  public static void main(String[] args) {
    int[] p1 = {1, 2, 3};
    int[] p2 = {4, 5};

    if (p2.length > p1.length) {
      System.out.println("P2 as more elements.");
    } else {
      System.out.println("P1 has more elements.");
    }
  }
}