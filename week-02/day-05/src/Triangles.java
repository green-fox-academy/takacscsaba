import javax.swing.*;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.IllegalFormatWidthException;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
  public static void mainDraw(Graphics graphics) {
    for (int i = 0; i < 400; i = i + 20) {
      graphics.drawLine(WIDTH / 2 - i / 2 - 10, i + 20, WIDTH / 2 + i / 2 + 10, i + 20);
      graphics.drawLine(WIDTH / 2 - i / 2, i, WIDTH / 2 + 200 - i, 400);
      graphics.drawLine(WIDTH / 2 + i / 2, i, WIDTH / 2 - 200 + i, 400);
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
