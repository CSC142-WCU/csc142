import javax.swing.*;

public class GUI1 {
  public static void main(String[] args) {
    int WINDOW_WIDTH = 350;
    int WINDOW_HEIGHT = 200;

    JFrame frame = new JFrame();
    frame.setTitle("Hello");
    frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}