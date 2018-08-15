import java.util.Arrays;

public class Domino {
  private final int[] values;

  public Domino(int valueA, int valueB) {
    this.values = new int[]{valueA, valueB};
  }

  public int[] getValues() {
    return values;
  }

  @Override
  public String toString() {
    return "[" + values[0] + ", " + values[1] + "]";
  }
}
//Dominoes
//    You have the list of Dominoes
//    Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
//    eg: [2, 4], [4, 3], [3, 5] ...
