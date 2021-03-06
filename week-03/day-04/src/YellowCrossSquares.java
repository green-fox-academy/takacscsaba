import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class YellowCrossSquares {
  public static void mainDraw(Graphics graphics) {

    int size = (int) Math.pow(3, 6);
    int startingPositionX = 0;
    int startingPositionY = 0;
    drawFractal(startingPositionX, startingPositionY, size, graphics);
  }

  public static void drawRectal(int x, int y, int size, Graphics graphics) {
    graphics.drawRect(x, y, size, size);
  }

  public static void drawFractal(int x, int y, int size, Graphics graphics) {
    drawRectal(x, y, size, graphics);
    if (size > 5) {
      drawFractal(x + size / 3, y, size / 3, graphics);
      drawFractal(x, y + size / 3, size / 3, graphics);
      drawFractal(x + 2 * (size / 3), y + size / 3, size / 3, graphics);
      drawFractal(x + size / 3, y + 2 * (size / 3), size / 3, graphics);

    }
  }

  // Don't touch the code below
  static int WIDTH = (int) Math.pow(3, 6);
  static int HEIGHT = (int) Math.pow(3, 6);

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
      this.setBackground(Color.YELLOW);
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}
