import org.junit.Assert;
import org.junit.Test;

public class MainTest {

  @Test
  public void ifTheyAreTheSame() {
    String word1 = "roka";
    String word2 = "roka";
    Assert.assertTrue(Main.isAnagram(word1, word2));
  }

  @Test
  public void ifAnagramReturnsTrue() {
    String word1 = "roka";
    String word2 = "karo";
    Assert.assertTrue(Main.isAnagram(word1, word2));
  }

  @Test
  public void ifTheyNotContainTheSameAmountOfCharacters() {
    String word1 = "roka";
    String word2 = "karok";
    Assert.assertFalse(Main.isAnagram(word1, word2));
  }

  @Test
  public void comparisonNotCaseSensitive() {
    String word1 = "RoKa";
    String word2 = "rOkA";
    Assert.assertTrue(Main.isAnagram(word1, word2));

  }
}
