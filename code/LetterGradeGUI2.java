import javax.swing.*;
import java.awt.event.*;

public class LetterGradeGUI2 extends JFrame {
  private JPanel panel;
  private JLabel messageLabel;
  private JLabel gradeLabel;
  private JTextField gradeField;
  private JButton gradeConvertButton;
  private final int WINDOW_WIDTH = 350;
  private final int WINDOW_HEIGHT = 100;
  
  public LetterGradeGUI2 () {
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
    gradeConvertButton.addActionListener(new gradeConvertButtonListener());
    panel = new JPanel();
    panel.add(messageLabel);
    panel.add(gradeField);
    panel.add(gradeConvertButton);
  }

  private class gradeConvertButtonListener implements ActionListener {
    public void actionPerformed (ActionEvent e) {
      double numGrade = Double.parseDouble(gradeField.getText());
      String grade;
      double[] numWCUPA = new double[]{93,90,87,83,80,77,73,70,67,63,60};
      String[] letterWCUPA = new String[]{"A","A-","B+","B","B-","C+","C","C-","D+","D","D-"};
      grade = "F";
      for (int j = 0; j < numWCUPA.length; j+=2) {
        if (numGrade >= numWCUPA[j]) {
          grade = letterWCUPA[j];
          break;
        }
      }
      JOptionPane.showMessageDialog(null, "Letter grade for " + numGrade + " is " + grade);
    }
  }

  public static void main(String[] args) {
    LetterGradeGUI2 newGUI = new LetterGradeGUI2();
  }
}