import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CalculatorV2 {
  public static void main(String... args) {
    Scanner requestScan = new Scanner(System.in);
    String requestOperation = "Please type in the expression (e.g. '+ 4 4'): ";
    System.out.print(requestOperation);

    String input = requestScan.nextLine();

    calculate(input);
  }

  public static double calculate(String input) {

    List<String> inputArr = new ArrayList<>(Arrays.asList(input.split(" ")));

    List<Double> doubleList = new ArrayList<>(inputArr.size());

    for (int i = 1; i < inputArr.size(); i++) {
      doubleList.add(Double.parseDouble(inputArr.get(i)));
    }

    String operator = inputArr.get(0);
    Double operand1 = doubleList.get(0);
    Double operand2 = doubleList.get(1);

    double solution = 0.0;
    if (operator.equals("+")) {
      solution = operand1 + operand2;
    } else if (operator.equals("-")) {
      solution = operand1 - operand2;
    } else if (operator.equals("*")) {
      solution = operand1 * operand2;
    } else if (operator.equals("/")) {
      solution = operand1 / operand2;
    } else if (operator.equals("%")) {
      solution = operand1 % operand2;
    }

//    if (operator == "+") {
//      solution = operand1 + operand2;
//    } else if (operator =="-") {
//      solution = operand1 - operand2;
//    } else if (operator == "*") {
//      solution = operand1 * operand2;
//    } else if (operator == "/") {
//      solution = operand1 / operand2;
//    } else if (operator == "%") {
//      solution = operand1 % operand2;
//    }

    if (solution % 1 != 0) {
      System.out.println(solution);
    } else {
      System.out.println(Math.round(solution));
//      e.g. changes 8.0 -> 8
    }
    return solution;
  }
}