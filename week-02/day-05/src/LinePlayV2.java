import javax.swing.*;

import java.awt.*;
import java.lang.reflect.Array;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayV2 {
  public static void mainDraw(Graphics graphics) {
    for (int i = 0; i < WIDTH - 40; i = i + 20) {
      graphics.setColor(new Color(0, 88, 12));
      graphics.drawLine(i + 40, 0, WIDTH, i + 20);
      graphics.setColor(new Color(0, 6, 124));
      graphics.drawLine(0, i + 40, i + 20, HEIGHT);
      graphics.setColor(new Color(255, 4, 0));
      graphics.drawLine(i + 40, HEIGHT, WIDTH, HEIGHT - i - 20);
      graphics.setColor(new Color(255, 79, 0));
      graphics.drawLine(i + 20, 0, 0, WIDTH - i - 40);
    }
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
