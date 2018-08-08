import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Homework2 {
  public static void main(String[] args) {

    JFrame f = new JFrame("Title");
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    HomeworkPeach2 p = new HomeworkPeach2();
    p.setBackground(Color.WHITE);
    f.add(p);
    f.setSize(500, 270);
    f.setVisible(true);
  }
}
