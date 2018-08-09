import javax.swing.*;

import java.awt.*;
import java.lang.reflect.Array;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {
  public static void mainDraw(Graphics graphics) {
    for (int k = 1; k <= 4; k = k + 3) {
      for (int i = 0; i < WIDTH; i = i + WIDTH / 2) {
        for (int j = 0; j < (WIDTH - 40); j = (j + 20)) {
//          graphics.setColor(new Color(128, 0, 128));
//          graphics.drawLine(i + (j + 40) / 2/k, 0, i + WIDTH / 2/k, (j + 20) / 2/k);
//          graphics.setColor(Color.GREEN);
//          graphics.drawLine(i/k, (j + 40) / 2/k, i + (j + 20) / 2/k, HEIGHT / 2/k);
//
//          graphics.setColor(new Color(128, 0, 128));
//          graphics.drawLine((j + 40) / 2/k, i/k, WIDTH / 2/k, i + (j + 20) / 2/k);
//          graphics.setColor(Color.GREEN);
//          graphics.drawLine(0, i + (j + 40) / 2/k, (j + 20) / 2/k, i + HEIGHT / 2/k);

          graphics.setColor(new Color(128, 0, 128));
          graphics.drawLine(i + (j + 40) / 2/k, i/k, i + WIDTH / 2/k, i + (j + 20) / 2/k);
          graphics.setColor(Color.GREEN);
          graphics.drawLine(i/k, i + (j + 40) / 2/k, i + (j + 20) / 2/k, i + HEIGHT / 2/k);
        }
      }
    }
  }

  // Don't touch the code below
  static int WIDTH = 300;
  static int HEIGHT = 300;

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