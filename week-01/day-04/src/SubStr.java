import java.util.Scanner;

public class SubStr {
  public static void main(String[] args) {
    Scanner request = new Scanner(System.in);

    System.out.print("Please input your word: ");
    String q = request.nextLine();

    //  Create a function that takes two strings as a parameter
    //  Returns the starting index where the second one is starting in the first one
    //  Returns `-1` if the second string is not in the first one

    //  Example:
    System.out.println(subStr("this is what I'm searching in", q));
    //  should print: `17`
    System.out.println(subStr("this is what I'm searching in", "not"));
    //  should print: `-1`
  }

  public static int subStr(String input, String q) {
    for (int i = 0; i < input.length()  - q.length(); i++) {
      boolean found = true;
      for (int j = 0; j < q.length(); j++) {
        if (input.charAt(i + j) != q.charAt(j)) {
          found = false;
        }
      }
      if (found) {
        return i;
      }
    }
    return -1;
  }
}