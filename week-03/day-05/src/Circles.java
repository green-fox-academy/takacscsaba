import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Circles {
  public static void mainDraw(Graphics graphics) {
    circles(200, 0, 300, graphics);
  }

  public static void mainCircle(int xTile, int yTile, int size, Graphics graphics) {
    graphics.drawOval(xTile, yTile, size, size);
  }

  public static void circles(int origoX, int origoY, int size, Graphics graphics) {
    if (size < 5) {
    } else {
      mainCircle(origoX, origoY, size, graphics);
//      circles(origoX + size / 4, origoY / 2, size / 2, graphics);
      circles();
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