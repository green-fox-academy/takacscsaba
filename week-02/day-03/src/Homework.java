import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Homework {
  public static void main(String[] args) {

    JFrame f = new JFrame("Title");
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    HomeworkPeach p = new HomeworkPeach();
    f.add(p);
    f.setSize(400,250);
    f.setVisible(true);
  }
}