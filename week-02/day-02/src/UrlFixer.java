import java.util.Arrays;

public class UrlFixer {
  public static void main(String... args) {
    String url = "https//www.reddit.com/r/nevertellmethebots";

    url = url.replace("bots", "odds");
    url = url.substring(0, 5) + ":" + url.substring(5);

    System.out.println(url);

//    String[] urlArr = url.split("");
//
//    final int N = urlArr.length;
//    urlArr = Arrays.copyOf(urlArr, N + 1);
//    urlArr[N] = " ";
//
//    for (int i = urlArr.length - 1; i > 0; i--) {
//      if (i > 6) {
//        urlArr[i] = urlArr[i - 1];
//      } else {
//        urlArr[i] = urlArr[i];
//      }
//    }
//    urlArr[5] = ":";
//
//    System.out.println(Arrays.toString(urlArr).replace(", ", "").replace("[", "").replace("]", ""));
  }
}