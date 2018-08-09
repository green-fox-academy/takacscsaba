import javax.swing.*;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.IllegalFormatWidthException;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
  public static void mainDraw(Graphics graphics) {
    for (int i = 10; i < WIDTH / 2; i = i + 10) {
      graphics.setColor(Color.GREEN);
      graphics.drawLine(i + 10, HEIGHT / 2, WIDTH / 2, HEIGHT / 2 - i);
      graphics.drawLine(i + 10, HEIGHT / 2, WIDTH / 2, HEIGHT / 2 + i);
      graphics.drawLine(WIDTH - i, HEIGHT / 2, WIDTH / 2, HEIGHT / 2 - i);
      graphics.drawLine(WIDTH - i, HEIGHT / 2, WIDTH / 2, HEIGHT / 2 + i);
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
