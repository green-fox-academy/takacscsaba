import javax.swing.*;

import java.awt.*;
import java.lang.reflect.Array;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayV2 {
  public static void mainDraw(Graphics graphics) {
    for (int i = 0; i < WIDTH - 2; i = i + 1) {
      int r = (int) (Math.random() * 255);
      int g = (int) (Math.random() * 255);
      int b = (int) (Math.random() * 255);
      Color randomColor = new Color(r, g, b);
      graphics.setColor(randomColor);
      graphics.drawLine(i + 2, 0, WIDTH, i + 1);
      graphics.setColor(randomColor);
      graphics.drawLine(0, i + 2, i + 1, HEIGHT);
      graphics.setColor(randomColor);
      graphics.drawLine(i + 2, HEIGHT, WIDTH, HEIGHT - i - 1);
      graphics.setColor(randomColor);
      graphics.drawLine(i + 1, 0, 0, WIDTH - i - 2);
    }
  }

  // Don't touch the code below
  static int WIDTH = 600;
  static int HEIGHT = 600;

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
