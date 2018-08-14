import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class TicTacToe {

  public static void main(String[] args) {
    ticTacResult("win-o.txt");
//    ticTacResult("win-x.txt");
//    ticTacResult("draw.txt");

//    System.out.println(ticTacResult("win-o.txt"))
//    // should print O
//
//    System.out.println(ticTacResult("win-x.txt"))
//    // should print X
//
//    System.out.println(ticTacResult("draw.txt"))
//    // should print draw
  }

  private static void ticTacResult(String s) {
    Path path = Paths.get(s);
    String[] chars;
    try {
      List<String> lines = Files.readAllLines(path);
//      for (int i = 0; i < lines.size(); i++) {
//        System.out.println(lines.get(i));
//      }
      for (int i = 0; i < lines.size(); i++) {
        String linesSep = lines.get(i).split("")[i];
        System.out.println(linesSep);
        for (int j = 0; j < lines.size(); j++) {
          String linesSep2 = lines.get(j).split("")[j];
          System.out.println(linesSep2);
        }
      }
    } catch (Exception e){
    }
  }
}
// Write a function that takes a filename as string,
// open and read it. The file data represents a tic-tac-toe
// game result. Return 'X'/'O'/'draw' based on which player
// has winning situation.