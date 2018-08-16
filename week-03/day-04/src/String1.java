public class String1 {
  public static void main(String[] args) {
    String text = "xenoxoxtaxy";
    System.out.println(x2y(text));

  }
  public static String x2y(String s) {
    int length = s.length();
    if(length == 0) {
      return s;
    } else {
      if (s.contains("x")) {
        return s.replace("x", "y");
      }
    }
    return s;
  }
}
// Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.