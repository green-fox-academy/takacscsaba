import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HomeworkPeach2 extends JPanel {

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    this.setBackground(Color.WHITE);

    g.setColor(Color.BLUE);
    //drawLine(x1, y1, x2, y2);
    g.drawLine(10, 25, 200, 45);

    g.setColor(Color.RED);
    g.drawRect(10, 55, 100, 30);

    g.setColor(Color.GREEN);
    //g.fillOval(x, y, width, height);
    g.fillOval(10, 95, 100, 30);

    g.setColor(Color.ORANGE);
    //g.fill3DRect(x, y, width, height, raised);
    g.fill3DRect(10, 160, 100, 50, true);
  }
}