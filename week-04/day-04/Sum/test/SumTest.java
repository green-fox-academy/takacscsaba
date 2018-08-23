import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SumTest {
  int expectedSum = 6;
  Sum sum = new Sum();

  @Test
  public void shouldReturnSix() {
    List<Integer> listSixTest = new ArrayList<>();
    listSixTest.add(6);
    Assert.assertEquals(expectedSum, sum.getSum(listSixTest));
  }

  @Test
  public void emptyList(){
    
  }
}
