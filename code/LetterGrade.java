import java.util.Scanner;

public class LetterGrade {
  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);
    double numGrade;
    String grade;
    double[] numWCUPA = new double[]{93,90,87,83,80,77,73,70,67,63,60};
    String[] letterWCUPA = new String[]{"A","A-","B+","B","B-","C+","C","C-","D+","D","D-"};
    System.out.println("Enter grade for student: ");
    numGrade = stdin.nextDouble();
    
    System.out.println("NUMBER TO LETTER: ");
    grade = "F";
    for (int j = 0; j < numWCUPA.length; j+=2) {
      if (numGrade >= numWCUPA[j]) {
        grade = letterWCUPA[j];
        break;
      }
    }
    System.out.println("Letter grade for " + numGrade + " is " + grade);
  }
}
