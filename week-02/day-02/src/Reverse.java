public class Reverse {
  public static void main(String... args) {
    String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

    String backward = reversed;
    for (int i = backward.length() - 1; i >= 0; i--) {
      System.out.print(backward.charAt(i));
    }

    /*
    StringBuffer backward = new StringBuffer(reversed);
    backward.reverse();
    System.out.println(backward.toString());
    */
  }
}