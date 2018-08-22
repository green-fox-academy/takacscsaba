public class Shifter implements CharSequence {
  public String string;
  int shiftNumber;

  public Shifter(String string, int shiftNumber) {
    this.string = string;
    this.shiftNumber = shiftNumber;
  }

  @Override
  public int length() {
    return string.length() + shiftNumber;
  }

  @Override
  public char charAt(int index) {
    return string.charAt(index + shiftNumber);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return string.subSequence(start + shiftNumber, end + shiftNumber);
  }

  @Override
  public String toString() {
    return string.toString();
  }
}
