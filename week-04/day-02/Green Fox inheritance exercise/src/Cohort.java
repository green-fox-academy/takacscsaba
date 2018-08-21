import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Cohort {
  String name;
  List<String> students;
  List<String> mentors;

  public void addStudent(String student) {
    students.add(student);
  }

  public void addMentor(String mentor) {
    students.add(mentor);
  }

  public void info() {
    System.out.println("The name cohort has " + students.size() + " students and " + mentors.size() + " mentors.");
  }

  public Cohort(String name) {
    students = new ArrayList<String>();
    mentors = new ArrayList<String>();
  }
}