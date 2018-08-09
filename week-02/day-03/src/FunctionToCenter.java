import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
  public static void mainDraw(Graphics graphics) {
    int x = 70;
    int y = 310;
    lineStart(graphics, x, y);
  }

  public static void lineStart(Graphics graphics, int x, int y) {
    graphics.setColor(Color.GREEN);
    graphics.drawLine(x, y, WIDTH / 2, HEIGHT / 2);
    graphics.setColor(Color.MAGENTA);
    for (int i = 0; i <= WIDTH; i = i + 20) {
      graphics.drawLine(i, 0, WIDTH / 2, HEIGHT / 2);
      graphics.drawLine(WIDTH, i, WIDTH / 2, HEIGHT / 2);
      graphics.drawLine(i, HEIGHT, WIDTH / 2, HEIGHT / 2);
      graphics.drawLine(0, i, WIDTH / 2, HEIGHT / 2);
    }
  }
  // Create a line drawing function that takes 2 parameters:
  // The x and y coordinates of the line's starting point
  // and draws a line from that point to the center of the canvas.
  // Fill the canvas with lines from the edges, every 20 px, to the center.

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
