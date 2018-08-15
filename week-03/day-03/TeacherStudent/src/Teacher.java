public class Teacher {
  int knowledge = 200;

  public void answer() {
    knowledge--;
  }

  public void teach(Student student) {
    student.learn();
  }
}