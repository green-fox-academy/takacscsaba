import javax.swing.*;

import java.awt.*;

import static java.awt.Frame.getFrames;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3DV2 {
  public static void mainDraw(Graphics graphics) {

    int size = 20;
    int x = 10;
    for (int i = 0; i < 7; i++) {
      size = i * 10;
      x += size - 10;
      squareDrawing(graphics, x, size);
    }
  }

  public static void squareDrawing(Graphics graphics, int x, int size) {
    Color purple = new Color(128, 0, 128);
    graphics.setColor(purple);
    graphics.fill3DRect(x, x, size, size, true);
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
