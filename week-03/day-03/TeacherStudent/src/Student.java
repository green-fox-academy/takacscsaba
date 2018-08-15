public class Student {
  int IQ = 75;

  public void learn() {
    IQ++;
  }

  public void question(Teacher teacher) {
    teacher.answer();
  }
}