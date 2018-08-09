public class Reverse {
  public static void main(String... args) {
    String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

    String backward = reversed;
    normal(backward);

    /*
    StringBuffer backward = new StringBuffer(reversed);
    backward.reverse();
    System.out.println(backward.toString());
    */
  }
  static String normal(String string) {
    for (int i = string.length() - 1; i >= 0; i--) {
      System.out.print(string.charAt(i));
    }
    return string;
  }
}