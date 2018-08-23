import org.junit.Assert;
import org.junit.Test;

public class AnagramTest {
  Anagram anagram = new Anagram();

  @Test
  public void areTheyAnagramsOrNot() {
    String string1 = "catto";
    String string2 = "tocta";
    Assert.assertEquals(true, anagram.anagram(string1, string2));
  }
}
