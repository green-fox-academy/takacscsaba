public class Append_a {
  public static void main(String[] args) {

    String typo = "Chinchill";
    appendAFunc(typo);

  }
  public static String appendAFunc(String typoa) {
    typoa = typoa + "a";
    System.out.println(typoa);
    return typoa;
  }
}