import org.junit.Assert;
import org.junit.Test;

public class AppleTest {
  String apple = "apple";
  Apple myObject = new Apple();

  @Test
  public void stringIsAppleOrNot() {
    Assert.assertEquals(apple, myObject.getApple());
  }
}
