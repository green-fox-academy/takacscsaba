import java.util.Arrays;

public class UrlFixer {
  public static void main(String... args) {
    String url = "https//www.reddit.com/r/nevertellmethebots";

    url = url.replace("bots", "odds");
    url = url.substring(0, 5) + ":" + url.substring(5);

    System.out.println(url);
//
//    String[] urlarr = url.split("");
//
//    final int N = urlarr.length;
//    urlarr = Arrays.copyOf(urlarr, N + 1);
//    urlarr[N] = " ";
//
//    for (int i = urlarr.length - 1; i > 0; i--) {
//      if (i > 6) {
//        urlarr[i] = urlarr[i - 1];
//      } else {
//        urlarr[i] = urlarr[i];
//      }
//    }
//    urlarr[5] = ":";
//
//    System.out.println(Arrays.toString(urlarr).replace(", ", "").replace("[", "").replace("]", ""));
  }
}