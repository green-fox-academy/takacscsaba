import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GoToCenterV2 {
  public static void mainDraw(Graphics graphics) {
    int x1 = 100;
    int y1 = 70;
    for (int i = 1; i <= 3; i++) {
      x1 = x1 + 20;
      y1 = y1 + 20;
      centerSquare(graphics, x1, y1);
    }

  }

  public static void centerSquare(Graphics graphics, int x1, int y1) {
    graphics.drawLine(x1, y1, WIDTH / 2, HEIGHT / 2);
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
