import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class YellowCrossSquares {
  public static void mainDraw(Graphics graphics) {

    int size = 300;
    int startingPositionX = WIDTH / 2 - size / 2;
    int startingPositionY = HEIGHT / 2 - size / 2;
    drawFractal(startingPositionX, startingPositionY, size, graphics);


  }

  public static void drawSquare(int x, int y, int size, Graphics graphics) {
    graphics.drawRect(x, y, size, size);
  }

  public static void drawFractal(int x, int y, int size, Graphics graphics) {
    graphics.drawRect(x, y, size, size);
    if (size > 5) {
      drawFractal(x - size / 4, y + size / 4, size / 2, graphics);
    }
  }

  // Don't touch the code below
  static int WIDTH = 666;
  static int HEIGHT = 666;

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
