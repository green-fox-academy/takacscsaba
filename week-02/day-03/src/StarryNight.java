import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
  public static void mainDraw(Graphics graphics) {
    stars(graphics);
  }

  public static void stars(Graphics graphics) {
    for (int i = 0; i < 10; i++) {
      int size = 2;
      for (int j = 0; j < 248; j++) {
        int r = j;
        int g = j;
        int b = j;
        graphics.setColor(new Color(r, g, b));
          int x = (int) (Math.random() * 2000);
          int y = (int) (Math.random() * 1400);
          graphics.fillOval(x, y, size, size);
      }
    }
  }
  //  - The stars can be small squares
  //  - The stars should have random positions on the canvas
  //  - The stars should have random color (some shade of grey)

  // Don't touch the code below
  static int WIDTH = 1000;
  static int HEIGHT = 700;

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
      this.setBackground(Color.BLACK);
      mainDraw(graphics);
    }
  }
}
