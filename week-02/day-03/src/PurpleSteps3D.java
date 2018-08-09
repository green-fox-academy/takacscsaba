import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3D {
  public static void mainDraw(Graphics graphics) {

    for (int i = 0; i < HEIGHT; i = 2 * i + 10) {
      Color purple = new Color(128, 0, 128);
      graphics.setColor(purple);
      graphics.fill3DRect(i, i, i + 10, i + 10, true);

//      graphics.setColor(Color.BLACK);
//      graphics.drawLine(i, i, i, 2 * i + 10);
//      graphics.drawLine(i, i, 2 * i + 10, i);
//      graphics.drawLine(2 * i + 10, i, 2 * i + 10, 2 * i + 10);
//      graphics.drawLine(i, 2 * i + 10, 2 * i + 10, 2 * i + 10);
    }
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
