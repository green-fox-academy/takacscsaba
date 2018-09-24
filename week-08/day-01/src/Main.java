import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    // write your code here
  }

  public static boolean isAnagram(String word1, String word2) {
    char[] word1Chars = word1.toLowerCase().toCharArray();
    char[] word2Chars = word2.toLowerCase().toCharArray();
    Arrays.sort(word1Chars);
    Arrays.sort(word2Chars);
    if (Arrays.equals(word1Chars, word2Chars)) {
      return true;
    } else {
      return false;
    }
  }

  public static String Poker(String blackHand, String whiteHand) {
//    String blackHand = "2H 10D 5S 9C 2H";
//    String whiteHand = "2C 3H 4S 8C AH";
    handToCards(blackHand);
    handToCards(whiteHand);
    return "Invalid Hand!";
  }
  
  public static Integer handChecker(List<Card> hand) {
//    return Collections.sort(hand);
    return null;
  }

  public static List<Card> handToCards(String hand) {
    List<Card> cardList = new ArrayList<Card>();
    String[] handArray = hand.split(" ");
    if (handArray.length != 5) {
      throw new IllegalArgumentException("Cards in hand not equal to 5.");
    } else {
      for (String cardString : handArray) {
        Card card = cardFromString(cardString);
        if (cardList.contains(card)) {
          throw new IllegalArgumentException("Duplicate card in hand: " + cardString);
        }
        cardList.add(card);
      }
      return cardList;
    }
  }

  public static Card cardFromString(String card) {
    if (card.length() == 3) {
      return new Card(card.substring(0, 2), card.charAt(2));
    } else if (card.length() == 2) {
      return new Card(card.substring(0, 1), card.charAt(1));
    } else {
      throw new IllegalArgumentException("Invalid card string format");
    }
  }
}
