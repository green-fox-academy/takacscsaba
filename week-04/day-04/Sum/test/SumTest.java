import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SumTest {
  Sum sum = new Sum();

  @Test
  public void shouldReturnSix() {
    List<Integer> listSixTest = new ArrayList<>();
    listSixTest.add(6);
    int expectedSum = 6;
    Assert.assertEquals(expectedSum, sum.getSum(listSixTest));
  }

  @Test
  public void emptyListTest() {
    List<Integer> emptyListTest = new ArrayList<>();
    int expectedResult = 0;
    int shouldBeZero = sum.getSum(emptyListTest);
    Assert.assertEquals(expectedResult, shouldBeZero);
  }

  @Test
  public void oneElementTest() {
    List<Integer> oneElementList = new ArrayList<>();
    oneElementList.add(311);
    int expectedResult = 311;
    int oneElement = sum.getSum(oneElementList);
    Assert.assertEquals(expectedResult, oneElement);
  }

  @Test
  public void multipleElementTest() {
    List<Integer> multipleElementList = new ArrayList<>();
    multipleElementList.add(311);
    multipleElementList.add(112);
    multipleElementList.add(23);
    int expectedResult = 311 + 112 + 23;
    int sumResult = sum.getSum(multipleElementList);
    Assert.assertEquals(expectedResult, sumResult);
  }

  @Test(expected = NullPointerException.class)
  public void nullListTest() {
    List<Integer> nullList = null;
    Assert.assertEquals(null, sum.getSum(nullList));
  }
}
