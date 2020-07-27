import javax.swing.*;

public class GUI2 extends JFrame {

  public GUI2 () {
    int WINDOW_WIDTH = 350;
    int WINDOW_HEIGHT = 200;

    this.setTitle("Hello");
    this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    GUI2 newGUI = new GUI2();
  }
}