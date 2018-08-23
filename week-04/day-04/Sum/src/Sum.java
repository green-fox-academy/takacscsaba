import java.util.ArrayList;
import java.util.List;

public class Sum {
  public int getSum(List<Integer> list) {
    int sum = 0;
    for (int i = 0; i < list.size(); i++) {
      sum += list.get(i);
    }
    return sum;
  }
}
