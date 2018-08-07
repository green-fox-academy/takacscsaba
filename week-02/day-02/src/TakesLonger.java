public class TakesLonger {
  public static void main(String... args){
    String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
    StringBuffer unfinishedQuote = new StringBuffer(quote);

    String missingWords = "always takes longer than ";
    unfinishedQuote.insert (quote.indexOf("you"), missingWords);

    System.out.println(unfinishedQuote);
  }
}