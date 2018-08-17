import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
  public static void mainDraw(Graphics graphics) {
    triangles(300, 0, 300, graphics);
    upsideDownTriangle(300, 0, 300, graphics);
  }

  public static void upsideDownTriangle(int xTile, int yTile, int size, Graphics graphics) {
    int height = (int) (Math.sqrt(3) / 2 * size);
    int xpoints[] = {xTile - xTile, 2 * xTile, xTile};
    int ypoints[] = {yTile, yTile, yTile + 2 * height};
    int npoints = 3;

    graphics.drawPolygon(xpoints, ypoints, npoints);
  }

  public static void mainTriangle(int xTile, int yTile, int size, Graphics graphics) {
    int height = (int) (Math.sqrt(3) / 2 * size);
    int xpoints[] = {xTile, xTile + size / 2, xTile - size / 2};
    int ypoints[] = {yTile, yTile + height, yTile + height};
    int npoints = 3;

    graphics.drawPolygon(xpoints, ypoints, npoints);
  }

  public static void triangles(int origoX, int origoY, int size, Graphics graphics) {
    if (size < 5) {
    } else {
      mainTriangle(origoX, origoY, size, graphics);
      int height = (int) (Math.sqrt(3) / 2 * size);
      triangles(origoX + size / 2, origoY, size / 2, graphics);
      triangles(origoX - size / 2, origoY, size / 2, graphics);
      triangles(origoX, origoY + height, size / 2, graphics);
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
