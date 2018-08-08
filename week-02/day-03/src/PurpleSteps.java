import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps {
  public static void mainDraw(Graphics graphics) {

    for (int i = 0; i < 19 * 19; i = i + 20) {
      Color purple = new Color(128, 0, 128);
      graphics.setColor(purple);
      graphics.fillRect(i, i, 20, 20);
      graphics.setColor(Color.BLACK);
      graphics.drawLine(i, i, i, i + 20);
      graphics.drawLine(i, i, i + 20, i);
      graphics.drawLine(i + 20, i, i + 20, i + 20);
      graphics.drawLine(i, i + 20, i + 20, i + 20);
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