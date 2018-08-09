import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
  public static void mainDraw(Graphics graphics) {
    Color purple = new Color(128, 0, 128);
    for (int i = 0; i <= HEIGHT; i = i + 40) {
      for (int j = 0; j <= WIDTH; j = j + 20) {
        graphics.setColor(purple);
        graphics.fillRect(j, i, 20, 20);
      }
      for (int k = 0; k <= WIDTH; k = k + 20) {
        graphics.setColor(Color.GREEN);
        graphics.fillRect(i +20, k, 20, 20);
      }
//      for (int m = 0; m <= WIDTH; l = l + 20) {
//        graphics.setColor(Color.GREEN);
//        graphics.fillRect(l, i + 20, 20, 20);
//      }
    }
//    for (int i = 0; i <= HEIGHT; i = i + 40) {
//      for (int j = 0; j <= WIDTH; j = j + 20) {
//        graphics.setColor(purple);
//        graphics.fillRect(i, j, 20, 20);
//      }
//    }
  }

  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 343;

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