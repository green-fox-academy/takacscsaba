import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Calculator {
  public static void main(String... args) {
    calculate();
  }

  public static int calculate() {
    Scanner requestScan = new Scanner(System.in);
    String requestOperation = "Please type in the expression (e.g. '+ 4 4'): ";
    System.out.print(requestOperation);

    String input = requestScan.nextLine();

    List<String> inputArr = new ArrayList<>(Arrays.asList(input.split(" ")));
    String operator = inputArr.get(0);
    Double operand1 = Double.parseDouble(inputArr.get(1));
    Double operand2 = Double.parseDouble(inputArr.get(2));

    double solution = 0;
    switch (operator) {
      case "+":
        solution = operand1 + operand2;
        break;
      case "-":
        solution = operand1 - operand2;
        break;
      case "*":
        solution = operand1 * operand2;
        break;
      case "/":
        solution = operand1 / operand2;
        break;
      case "%":
        solution = operand1 % operand2;
        break;
    }
    if (solution % 1 != 0) {
      System.out.println(solution);
    } else {
      System.out.println(Math.round(solution));
    }

    return calculate();
  }
}