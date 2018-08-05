public class GreeterFunction {

  static String al = "Greenfox";

  public static void main(String[] args) {

    int d = 0;
    System.out.println(greet(d));
  }
  public static int greet(int d) {
    System.out.println("Greetings dear, " + al);
    return d;
  }
}
// - Create a string variable named `al` and assign the value `Greenfox` to it
// - Create a function called `greet` that greets it's input parameter
// - Greeting is printing e.g. `Greetings dear, Greenfox`
// - Greet `al`