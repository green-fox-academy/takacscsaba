import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

  public static void mainDraw(Graphics graphics) {

    for (int i = 1; i <= 4; i++) {
      int r = (int) (Math.random() * 255);
      int g = (int) (Math.random() * 255);
      int b = (int) (Math.random() * 255);
      Color randomColor = new Color(r, g, b);
      graphics.setColor(randomColor);
      int x1 = (int) (Math.random() * ((WIDTH)));
      int y1 = (int) (Math.random() * ((HEIGHT)));
      int x2 = (int) (Math.random() * WIDTH);
      int y2 = (int) (Math.random() * HEIGHT);
//      if (x1 + x2 > WIDTH && y1 + y2 > HEIGHT) {
//        graphics.drawRect(x1, y1, x2 - x1, y2 - y1);
//      } else if (x1 + x2 > WIDTH) {
//        graphics.drawRect(x1, y1, x2 -  x1, y2);
//      } else if (y1 + y2 > HEIGHT) {
//        graphics.drawRect(x1, y1, x2, y2 - y1);
//      } else {
//        graphics.drawRect(x1, y1, x2, y2);
//      }
        graphics.drawRect(x1, y1, x2, y2);

    }
  }
  // draw four different size and color rectangles.
  // avoid code duplication.


  //    Don't touch the code below
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
