import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunctionV2 {
  public static void mainDraw(Graphics graphics) {
    String[] rainbowColor = {"RED", "ORANGE", "YELLOW", "GREEN", "BLUE", "INDIGO", "VIOLET"};
    Map<String, Color> rainbowColorList = new HashMap<>();
    rainbowColorList.put("RED", Color.RED);
    rainbowColorList.put("ORANGE", Color.ORANGE);
    rainbowColorList.put("YELLOW", Color.YELLOW);
    rainbowColorList.put("GREEN", Color.GREEN);
    rainbowColorList.put("BLUE", Color.BLUE);
    rainbowColorList.put("INDIGO", new Color(75, 0, 130));
    rainbowColorList.put("VIOLET", new Color(127, 0, 255));

    int x = 343;
    for (int i = rainbowColor.length - 1; i >= 0; i--) {
      squareSizeColor(graphics, x, rainbowColorList.get(rainbowColor[i]));
      x -= 47;
    }
  }

  public static void squareSizeColor(Graphics graphics, int x, Color color) {
    graphics.setColor(color);
    graphics.fillRect(WIDTH / 2 - x / 2, HEIGHT / 2 - x / 2, x, x);
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

