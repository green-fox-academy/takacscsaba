import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicTacToe {

  public static void main(String[] args) {
//    ticTacResult("win-o.txt");
//    ticTacResult("win-x.txt");
//    ticTacResult("draw.txt");

    System.out.println(ticTacResult("win-o.txt"));
//    // should print O
//
//    System.out.println(ticTacResult("win-x.txt"));
//    // should print X
//
//    System.out.println(ticTacResult("draw.txt"));
//    // should print draw
  }

  private static String ticTacResult(String s) {
    Path path = Paths.get(s);
    List<List<String>> matrix = new ArrayList<>();
    int winning = 0;
    try {
      List<String> lines = Files.readAllLines(path);
      // Creating matrix
      for (int i = 0; i < lines.size(); i++) {
        String[] matrixLines = lines.get(i).split("");
        matrix.add(new ArrayList<>());
        for (int j = 0; j < matrixLines.length; j++) {
          matrix.get(i).add(matrixLines[j]);
        }
      }
    } catch (Exception e) {
    }
    List<String> Xs = new ArrayList<String>();
    Xs.add("X");
    Xs.add("X");
    Xs.add("X");
    List<String> Os = new ArrayList<String>();
    Os.add("O");
    Os.add("O");
    Os.add("O");

    for (int i = 0; i < matrix.size(); i++) {
      for (int j = 0; j < matrix.get(i).size(); j++) {
        if (matrix.get(0).get(j).equals(matrix.get(1).get(j).equals(matrix.get(2).get(j).equals("X")))) {
          winning++;
          System.out.println("XVERT");
        }
        if (matrix.get(0).get(j).equals(matrix.get(1).get(j).equals(matrix.get(2).get(j).equals("O")))) {
          winning--;
          System.out.println("OVERT");
        }
      }
      if (matrix.get(i).equals(Xs)) {
        winning++;
        System.out.println("XSOR");
      }
      if (matrix.get(i).equals(Os)) {
        winning--;
        System.out.println("OSOR");
      }
    }
    if (matrix.get(0).get(2).equals(matrix.get(1).get(1).equals(matrix.get(2).get(0).equals("X")))) {
      winning++;
      System.out.println("XATLOBAL");
    }
    if (matrix.get(0).get(2).equals(matrix.get(1).get(1).equals(matrix.get(2).get(0).equals("O")))) {
      winning--;
      System.out.println("OATLOBAL");
    }
    if (matrix.get(0).get(0).equals(matrix.get(1).get(1).equals(matrix.get(2).get(2).equals("X")))) {
      winning++;
      System.out.println("XATLOJOBB");
    }
    if (matrix.get(0).get(0).equals(matrix.get(1).get(1).equals(matrix.get(2).get(2).equals("O")))) {
      winning--;
      System.out.println("XOATLOJOBB");
    }
    if (winning > 0) {
      return "X";
    } else if (winning < 0) {
      return "O";
    } else {
      return "draw";
    }
  }
}
// Write a function that takes a filename as string,
// open and read it. The file data represents a tic-tac-toe
// game result. Return 'X'/'O'/'draw' based on which player
// has winning situation.