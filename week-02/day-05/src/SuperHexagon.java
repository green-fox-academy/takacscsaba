import javax.swing.*;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.IllegalFormatWidthException;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SuperHexagon {
  public static void mainDraw(Graphics graphics) {
    double cubicRoot = 15 * Math.cbrt(3);
    int cubicRootI = (int)cubicRoot;

    double[][] coordinates1 = new double[][]{{WIDTH / 2, 0}, {WIDTH / 2 + 30, 0}, {WIDTH / 2 + 45, cubicRootI}, {WIDTH / 2 + 30, 2 * cubicRootI}, {WIDTH / 2, 2 * cubicRootI}, {WIDTH / 2 - 15, cubicRootI}, {WIDTH / 2, 0}};
//    int[][] coordinates2 = new int[][]{{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70}, {120, 100}, {85, 130}, {50, 100}};
    coordinates(graphics, coordinates1);
  }

  public static Graphics coordinates(Graphics graphics, double[][] array) {
    double cubicRoot = 15 * Math.cbrt(3);
    int cubicRootI = (int)cubicRoot;

    for (int j = 0; j <= 120; j = j + 30) {
      for (int i = 0; i <= array.length - 1; i++) {
        if (i != array.length - 1)
          graphics.drawLine((int) array[i][0] + j + j/2, (int) array[i][1] + cubicRootI, (int) array[i + 1][0] + j + j/2, (int) array[i + 1][1] + cubicRootI);
        else {
          graphics.drawLine((int) array[i][0] + j, (int) array[i][1] + j, (int) array[i - array.length + 1][0] + j, (int) array[i - array.length + 1][1] + j);
        }
      }
    }
    return graphics;
  }

//    for (int i = 0; i <= 210/2; i = i + 30) {
//      for (int j = 0; j < 210 - i; j++) {
//        graphics.drawLine(WIDTH / 2, i, WIDTH / 2 + 30, i);
//      }
//      for (int k = 210 - i; k >= 210/2; k = k - 30) {
//        graphics.drawLine(WIDTH / 2, k, WIDTH / 2 + 30, k);
//      }
//      for (int j = 0; j < 210 - i; j++) {
//        graphics.drawLine(WIDTH / 2, i/2, WIDTH / 2 + 30, i/2);
//      }
//      for (int k = 210 - i; k >= 210/2; k = k - 30) {
//        graphics.drawLine(WIDTH / 2, k, WIDTH / 2 + 30, k);
//      }
//    }

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
