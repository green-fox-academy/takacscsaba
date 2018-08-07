import java.util.Arrays;

public class ExampleString {
  public static void main(String[] args) {
    String beka = "Békanyál";

    System.out.println(beka.startsWith("t")); // booean if it starts with "t"

    String[] myStringArray = beka.split("");
    System.out.println(Arrays.toString(myStringArray));

    System.out.println(beka.length());
    System.out.println(beka.substring(0, 4));
    System.out.println(beka.charAt(0));

    String beka2 = "nyál";
    String beka3 = "békanyál";

    System.out.println(beka.equals(beka2));
    System.out.println(beka == beka2);
    System.out.println(beka.compareTo(beka2));
    System.out.println(beka.compareTo(beka3));
    System.out.println(beka.compareToIgnoreCase(beka3));
    System.out.println(beka.startsWith("B")); //if it starts with a "t"
    System.out.println(beka.indexOf("k"));
    System.out.println(beka.indexOf("n", 3));

  }
}
