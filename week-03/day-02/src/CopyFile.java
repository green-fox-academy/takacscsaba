import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
  public static void main(String[] args) {
    String filepath1 = "CopyFile1.txt";
    String filepath2 = "CopyFile2.txt";
    System.out.println(copyFunction(filepath1, filepath2));
  }

  public static boolean copyFunction(String fileName1, String fileName2) {
    Path filepath1 = Paths.get(fileName1);
    Path filepath2 = Paths.get(fileName2);
    try {
      List<String> lines = Files.readAllLines(filepath1);
      Files.write(filepath2, lines, StandardOpenOption.APPEND);
    } catch (Exception e) {
      return false;
    }
    return true;
  }
}
// Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful