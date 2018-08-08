import java.util.Scanner;

public class SubStr {
  public static void main(String[] args) {
    Scanner request = new Scanner(System.in);
    System.out.print("Please input your text: ");
    String input = request.nextLine();

    System.out.print("Please input your word: ");
    String q = request.nextLine();

    System.out.println(subStr(input, q));
//    System.out.println(subStr("this is what I'm searching in", "not"));
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