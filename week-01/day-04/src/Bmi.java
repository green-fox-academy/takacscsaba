public class Bmi {
  public static void main(String[] args) {
    double massInKg = 70;
    double heightInM = 1.80;

    double bmi = massInKg / (heightInM * heightInM);
    System.out.println(bmi);

    // BMI = weight (kg) ÷ height^2 (m^2)
  }
}
