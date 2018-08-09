import javax.swing.*;

import java.awt.*;
import java.lang.reflect.Array;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {
  public static void mainDraw(Graphics graphics) {
    graphics.setColor(Color.GREEN);
    int[][] coordinates1 = new int[][]{{10, 10}, {290, 10}, {290, 290}, {10, 290}};
    int[][] coordinates2 = new int[][]{{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70}, {120, 100}, {85, 130}, {50, 100}};
    coordinates(graphics, coordinates1);
    coordinates(graphics, coordinates2);
  }

  public static Graphics coordinates(Graphics graphics, int[][] array) {
    for (int i = 0; i <= array.length - 1; i++) {
      if (i != array.length - 1)
        graphics.drawLine(array[i][0], array[i][1], array[i + 1][0], array[i + 1][1]);
      else {
        graphics.drawLine(array[i][0], array[i][1], array[i - array.length + 1][0], array[i - array.length + 1][1]);
      }
    }
    return graphics;
  }

  // Don't touch the code below
  static int WIDTH = 300;
  static int HEIGHT = 300;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}
