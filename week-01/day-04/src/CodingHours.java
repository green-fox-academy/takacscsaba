public class CodingHours {
  public static void main(String[] args) {

    int hour = 6;
    int week = 17;
    int day = 5;
    float workhours = 52;

    System.out.println(hour * week * day);

    System.out.println((hour * week * day) / (workhours * week) * 100 + "%");

    // An average Green Fox attendee codes 6 hours daily
    // The semester is 17 weeks long
    //
    // Print how many hours is spent with coding in a semester by an attendee,
    // if the attendee only codes on workdays.
    //
    // Print the percentage of the coding hours in the semester if the average
    // work hours weekly is 52
  }
}
