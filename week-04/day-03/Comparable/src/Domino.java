public class Domino implements Comparable<Domino> {
  private int[] values;

  public Domino(){}

  public Domino(int valueA, int valueB) {
    this.values = new int[]{valueA, valueB};
  }

  public int[] getValues(int i) {
    return values;
  }

  @Override
  public String toString() {
    return "[" + values[0] + ", " + values[1] + "]";
  }

  @Override
  public int compareTo(Domino o) {
    return toString().compareTo(o.toString());
  }

  public int compare(Domino o1, Domino o2) {
    return o1.compareTo(o2);
  }
}
