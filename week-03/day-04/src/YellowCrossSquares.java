//import javax.swing.*;
//
//import java.awt.*;
//
//import static javax.swing.JFrame.EXIT_ON_CLOSE;
//
//public class YellowCrossSquares {
//  public static void mainDraw(Graphics graphics) {
//
//    int size = HEIGHT;
//    int startingPositionX = WIDTH / 3;
//    int startingPositionY = HEIGHT / 2 - size / 2;
//    drawFractal(startingPositionX, startingPositionY, size, graphics);
//  }
//
//  public static void drawLines(int x, int y, int size, Graphics graphics) {
//    graphics.drawLine(x, y, size, size);
//  }
//
//  public static void drawFractal(int x, int y, int size, Graphics graphics) {
//
//  // Don't touch the code below
//  static int WIDTH = 666;
//  static int HEIGHT = 666;
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
