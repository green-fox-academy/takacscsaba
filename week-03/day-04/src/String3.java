public class String3 {
  public static void main(String[] args) {
    String text = "xenoxoxtaxy";
    System.out.println(x2y(text));
  }


  public static String x2y(String s) {
    int length = s.length();

    if (length == 1) {
      return s;
    } else {
      return s.charAt(0) + "*" + x2y(s.substring(1));
    }
  }
}