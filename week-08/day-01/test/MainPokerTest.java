import org.junit.Assert;
import org.junit.Test;

public class MainPokerTest {

  @Test(expected = IllegalArgumentException.class)
  public void doesNotAllowDuplicateCardWithinHand() {
    String blackHand = "3H3D 5S 9C 2H";
    String whiteHand = "2C 3H 4S 8C AH";
    Main.Poker(blackHand, whiteHand);
  }

  @Test(expected = IllegalArgumentException.class)
  public void ifHandContainsMoreThanTwoOfTheSameCard() {
    String blackHand = "2H 3D 5S 9C 2H";
    String whiteHand = "2C 3H 4S 8C AH";
    Main.Poker(blackHand, whiteHand);
  }

  @Test
  public void validCardCreation() {
    Card card = new Card("10", 'H');
    Assert.assertEquals(card, Main.cardFromString("10H"));
  }
}
