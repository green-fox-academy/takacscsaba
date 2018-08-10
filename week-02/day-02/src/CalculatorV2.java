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

    double solution = 0;
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
// Create a simple calculator application which reads the parameters from the prompt
// and prints the result to the prompt.
// It should support the following operations,
// create a method named "calculate()":
// +, -, *, /, % and it should support two operands.
// The format of the expressions must be: {operation} {operand} {operand}.
// Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

// You can use the Scanner class
// It should work like this:

// Start the program
// It prints: "Please type in the expression:"
// Waits for the user input
// Print the result to the prompt
// Exit