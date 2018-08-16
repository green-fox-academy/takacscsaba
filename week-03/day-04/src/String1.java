public class String1 {
  public static void main(String[] args) {
    String text = "xenoxoxtaxy";
    System.out.println(x2y(text));

  }

  public static String x2y(String s) {
    int length = s.length();
    StringBuilder builder = new StringBuilder();

    if (length == 0) {
      return s;
    } else if (s.startsWith("x")) {
      return "y" + x2y(s.substring(1));
    } else {
      return s.charAt(0) + x2y(s.substring(1));
    }
  }
}
// Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.