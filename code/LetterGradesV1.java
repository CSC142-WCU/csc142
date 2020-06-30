import java.util.Scanner;

public class LetterGradesV1 {
  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);
    System.out.println("How many students?");
    int studentCount = stdin.nextInt(); 
    double[] numGrades = new double[studentCount];
    String[] grades = new String[studentCount];
    double[] numWCUPA = new double[]{93,90,87,83,80,77,73,70,67,63,60};
    String[] letterWCUPA = new String[]{"A","A-","B+","B","B-","C+","C","C-","D+","D","D-"};
    for (int i = 0; i < studentCount; i++) {
      System.out.println("Enter grade for student " + i + ": ");
      numGrades[i] = stdin.nextDouble();
    }
    System.out.println("NUMBER TO LETTER: ");
    for (int i = 0; i < studentCount; i++) {
      grades[i] = "F";
      for (int j = 0; j < numWCUPA.length; j++) {
        if (numGrades[i] >= numWCUPA[j]) {
          grades[i] = letterWCUPA[j];
          break;
        }
      }
      System.out.println("Letter grade for " + numGrades[i] + " is " + grades[i]);
    }
  }
}
