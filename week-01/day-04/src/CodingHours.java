public class CodingHours {
  public static void main(String[] args) {

    int hour = 6;
    int week = 17;
    int day = 5;
    float workhours = 52;

    System.out.println(hour * week * day);

    System.out.println((hour * week * day) / (workhours * week) * 100 + "%");
  }
}
