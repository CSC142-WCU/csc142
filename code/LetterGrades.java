import java.util.Scanner;

public class LetterGrades {
  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);
    double a;
    for (int i = 0; i < 10; i++) {
      System.out.println("Enter grade for student " + i + ": ");
      a = stdin.nextDouble();
      //System.out.println("You entered " + a);
      if (a >= 93) {
        System.out.println("A");
      } else if (a >= 90 && a <= 92) {
        System.out.println("A-");
      } else if (a >= 87 && a <= 89) {
        System.out.println("B+");
      } else if (a >= 83 && a <= 86) {
        System.out.println("B");
      } else if (a >= 80 && a <= 82) {
        System.out.println("B-");
      } else if (a >= 77 && a <= 79) {
        System.out.println("C+");
      } else if (a >= 73 && a <= 76) {
        System.out.println("C");
      } else if (a >= 70 && a <= 72) {
        System.out.println("C-");
      } else if (a >= 67 && a <= 69) {
        System.out.println("D+");
      } else if (a >= 63 && a <= 66) {
        System.out.println("D");
      } else if (a >= 60 && a <= 62) {
        System.out.println("D-");
      } else {
        System.out.println("F");
      }
    }
  }
}
