import org.junit.Assert;
import org.junit.Test;

public class MainTest {

  @Test
  public void ifAnagramReturnsTrue() {
    String word1 = "roka";
    String word2 = "karo";
    Assert.assertTrue(Main.isAnagram(word1, word2));
  }
}
