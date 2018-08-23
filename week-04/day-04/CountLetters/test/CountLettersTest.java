import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class CountLettersTest {
  CountLetters countLetters = new CountLetters();

  @Test
  public void canItReallyCountTheLetters() {
    Map<String, Integer> map = new HashMap<>();


    Map<String, Integer> expectedMap = new HashMap<>();
//    expectedMap.entrySet();
    Assert.assertEquals(expectedResult, countLetters.counter("alma"));
  }
}
