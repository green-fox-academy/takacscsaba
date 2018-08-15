import java.util.ArrayList;
import java.util.List;

public class TicTacToe2 {

  public static void main(String[] args) {
    System.out.println("im runnin");
    ticTacResult("win-o.txt");
  }

  private static void ticTacResult(String s) {
    List<List<String>> matrix = new ArrayList<>();

    matrix.add(new ArrayList<String>());
    matrix.get(0).add("X");
    matrix.get(0).add("O");
    matrix.get(0).add("X");
    matrix.add(new ArrayList<String>());
    matrix.get(1).add("X");
    matrix.get(1).add("X");
    matrix.get(1).add("X");
    matrix.add(new ArrayList<String>());
    matrix.get(2).add("O");
    matrix.get(2).add("O");
    matrix.get(2).add("O");

    System.out.println(checkDiagonally(matrix));
    System.out.println(checkHorizontally(matrix));
    System.out.println(checkVertically(matrix));

  }

  public static String checkHorizontally(List<List<String>> matrix) {
    int xWinning = -1;
    int oWinning = -1;

    for (int i = 0; i < matrix.size(); i++) {
      for (int j = 0; j < matrix.size(); j++) {
        if (matrix.get(j).get(i).equals("X")) {
          xWinning++;
        }
        if (matrix.get(j).get(i).equals("O")) {
          oWinning++;
        }
      }
    }

    if (xWinning >= 3 && oWinning >= 3) {
      return "DRAW";
    } else if (xWinning >= 3) {
      return "X";
    } else if (oWinning >= 3) {
      return "O";
    } else return null;
  }

  public static String checkVertically(List<List<String>> matrix) {
    int xWinning = -1;
    int oWinning = -1;

    for (int i = 0; i < matrix.size(); i++) {
      for (int j = 0; j < matrix.size(); j++) {
        if (matrix.get(i).get(j).equals("X")) {
          xWinning++;
        }
        if (matrix.get(i).get(j).equals("O")) {
          oWinning++;
        }
      }
    }

    if (xWinning >= 3 && oWinning >= 3) {
      return "DRAW";
    } else if (xWinning >= 3) {
      return "X";
    } else if (oWinning >= 3) {
      return "O";
    } else return null;
  }

  public static String checkDiagonally(List<List<String>> matrix) {
    int xWinning = 0;
    int oWinning = 0;

    for (int i = 0; i < matrix.size(); i++) {
      for (int j = 0; j < matrix.get(i).size(); j++) {
        if (i == j && matrix.get(i).get(j).equals("X")) {
          xWinning++;
        }
        if (i == j && matrix.get(i).get(j).equals("O")) {
          oWinning++;
        }
      }
    }

    if (xWinning == 3) {
      return "X";
    } else if (oWinning == 3) {
      return "O";
    } else return null;
  }
}
