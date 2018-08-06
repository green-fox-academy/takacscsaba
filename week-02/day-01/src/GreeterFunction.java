public class GreeterFunction {

  public static void main(String[] args) {

    String al = "Greenfox";
    greet(al);
  }

  public static String greet(String al) {
    System.out.println("Greetings dear, " + al);
    return al;
  }
}