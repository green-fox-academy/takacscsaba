import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CheckerboardV2 {
  public static void mainDraw(Graphics graphics) {
    int x;
    int y;

    for (y = 0; y < HEIGHT; y += HEIGHT / 8 * 2) {
      for (x = 0; x < WIDTH; x += WIDTH / 8 * 2) {
        checkerOne(graphics, x, y);
      }
    }
  }

  public static void checkerOne(Graphics graphics, int x, int y) {
    graphics.fillRect(x, y, WIDTH / 8, HEIGHT / 8);
    graphics.fillRect(x + WIDTH / 8, y + HEIGHT / 8, WIDTH / 8, HEIGHT / 8);
  }

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