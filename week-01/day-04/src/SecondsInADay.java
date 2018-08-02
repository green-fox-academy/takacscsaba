public class SecondsInADay {
    public static void main(String[] args) {
      int currentHours = 14;
      int currentMinutes = 34;
      int currentSeconds = 42;

      int hours = 24;
      int minutes = 60;
      int seconds = 60;
      int everysec = (hours * minutes * seconds);
      int currentsec = (currentHours * minutes * seconds) + (currentMinutes * seconds) + currentSeconds;


      int remainsec = everysec - currentsec;

      System.out.println(remainsec);
    }
}
