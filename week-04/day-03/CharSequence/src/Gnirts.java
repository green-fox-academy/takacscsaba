public class Gnirts implements CharSequenceInterface {
  public String string;

  public Gnirts(String string) {
    this.string = string;
  }

  @Override
  public int length() {
    return 0;
  }

  @Override
  public char charAt(int index) {
    return string.charAt(string.length() - 1 -index);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }
}
