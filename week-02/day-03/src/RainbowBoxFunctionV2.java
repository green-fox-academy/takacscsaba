//import javax.swing.*;
//
//import java.awt.*;
//
//import static javax.swing.JFrame.EXIT_ON_CLOSE;
//
//public class RainbowBoxFunctionV2 {
//  public static void mainDraw(Graphics graphics) {
//
//  }
//
//  public static void rainbow(Graphics graphics) {
//    String[] rainbowColor = {"RED", "ORANGE", "YELLOW", "GREEN", "BLUE", "INDIGO", "VIOLET"};
//
//    Color rainbowColor = new Color();
//
//    for (int i = HEIGHT; i >= 0; i--) {
//      graphics.setColor();
//      int x = (int) (Math.random() * HEIGHT);
////      int x = (int) (Math.random() * WIDTH);
//      graphics.drawRect(WIDTH / 2 - x / 2, HEIGHT / 2 - x / 2, x, x);
//    }
//  }
//
//  // Don't touch the code below
//  static int WIDTH = 320;
//  static int HEIGHT = 343;
//
//  public static void main(String[] args) {
//    JFrame jFrame = new JFrame("Drawing");
//    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
//    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
//    jFrame.add(new ImagePanel());
//    jFrame.setLocationRelativeTo(null);
//    jFrame.setVisible(true);
//  }
//
//  static class ImagePanel extends JPanel {
//    @Override
//    protected void paintComponent(Graphics graphics) {
//      super.paintComponent(graphics);
//      mainDraw(graphics);
//    }
//  }
//}
//
