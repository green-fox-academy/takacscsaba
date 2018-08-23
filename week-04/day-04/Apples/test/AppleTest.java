import org.junit.Assert;
import org.junit.Test;

public class AppleTest {
  String expectedResult = "apple";
  Apple myObject = new Apple();

  @Test
  public void stringIsAppleOrNot() {
    Assert.assertEquals(expectedResult, myObject.getApple());
  }
}
