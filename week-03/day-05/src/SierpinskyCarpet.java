import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SierpinskyCarpet {
  public static void mainDraw(Graphics graphics) {
    int size = 200;
    squares(300 - size/2, 300-size/2, size, graphics);
  }

  public static void mainSquare(int xTile, int yTile, int size, Graphics graphics) {
    graphics.fillRect(xTile, yTile, size, size);
  }

  public static void squares(int X, int Y, int size, Graphics graphics) {
    if (size < 2) {
    } else {
      mainSquare(X, Y, size, graphics);
      squares(X+size/3, Y / 3, size / 3, graphics);
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
