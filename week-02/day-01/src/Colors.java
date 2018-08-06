import java.util.Arrays;

public class Colors {
  public static void main(String[] args) {
    String[][] colors = {{"lime", "forest green", "olive", "pale green", "spring green"}, {"orange red", "red", "tomato"}, {"orchid", "violet", "pink", "hot pink"}};

    for (int row = 0; row < colors.length; row++) {
      for (int column = 0; column < colors[row].length; column++) {
        System.out.print(colors[row][column] + " ");
      }
      System.out.println();
    }
  }
}