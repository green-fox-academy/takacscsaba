public class Main {

  public static void main(String[] args) {
    Student student = new Student();
    Teacher teacher = new Teacher();

    student.learn();
    System.out.println(student.IQ);
    student.question(teacher);
    System.out.println(teacher.knowledge);
    teacher.answer();
    System.out.println(teacher.knowledge);
    teacher.teach(student);
    System.out.println(student.IQ);
  }
}