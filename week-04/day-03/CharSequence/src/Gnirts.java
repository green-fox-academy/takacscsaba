public class Gnirts implements CharSequence {
  public String string;

  public Gnirts(String string) {
    this.string = string;
  }

  @Override
  public int length() {
    return string.length();
  }

  @Override
  public char charAt(int index) {
    return string.charAt(string.length() - 1 - index);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    StringBuilder stringBuilder = new StringBuilder(string);
    stringBuilder.reverse();
    return stringBuilder.subSequence(start, end);
  }

  @Override
  public String toString() {
    return string.toString();
  }
}
