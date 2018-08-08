import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
  public static void mainDraw(Graphics graphics) {

//    graphics.drawRect(50, 50, 200, 150);

    graphics.setColor(Color.CYAN);
    graphics.drawLine(50, 50, 50, 200);
    graphics.setColor(Color.MAGENTA);
    graphics.drawLine(50, 50, 250, 50);
    graphics.setColor(Color.ORANGE);
    graphics.drawLine(250, 50, 250, 200);
    graphics.setColor(Color.GREEN);
    graphics.drawLine(50, 200, 250, 200);

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