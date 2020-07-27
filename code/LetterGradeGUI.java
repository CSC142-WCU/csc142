import javax.swing.*;

public class LetterGradeGUI extends JFrame {
  private JPanel panel;
  private JLabel messageLabel;
  private JTextField gradeField;
  private JButton gradeConvertButton;
  private final int WINDOW_WIDTH = 350;
  private final int WINDOW_HEIGHT = 100;
  
  public LetterGradeGUI () {
    this.setTitle("Numeric to Letter Grade");
    this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    buildPanel();
    add(panel);
    this.setVisible(true);
  }

  private void buildPanel() {
    messageLabel = new JLabel("Enter a student's numeric grade: ");
    gradeField = new JTextField(10);
    gradeConvertButton = new JButton("Convert");

    panel = new JPanel();
    panel.add(messageLabel);
    panel.add(gradeField);
    panel.add(gradeConvertButton);
  }

  public static void main(String[] args) {
    LetterGradeGUI newGUI = new LetterGradeGUI();
  }
}