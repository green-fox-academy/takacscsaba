import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
  public static void mainDraw(Graphics graphics) {
    honeyComb(200, 0, 150, graphics);
  }

  //side of the hexagon is one size long
  public static void hexagon(int xTile, int yTile, int size, Graphics graphics) {
    int height = (int) (Math.sqrt(3) / 2 * size);
    int xpoints[] = {xTile - size / 2, xTile, xTile + size, xTile + size * 3 / 2, xTile + size, xTile};
    int ypoints[] = {yTile + height, yTile, yTile, yTile + height, yTile + height * 2, yTile + height * 2};
    int npoints = 6;

    graphics.drawPolygon(xpoints, ypoints, npoints);
  }

  public static void honeyComb(int origoX, int origoY, int size, Graphics graphics) {
    if (size < 10) {
    } else {
      hexagon(origoX, origoY, size, graphics);
      int height = (int) (Math.sqrt(3) / 2 * size);
      honeyComb(origoX, origoY, size / 2, graphics);
      honeyComb(origoX + size * 3 / 4, origoY + height / 2, size / 2, graphics);
      honeyComb(origoX, origoY + height, size / 2, graphics);
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
