public class Exams {
  public static void keepAndPass (int studentRemain, int examRemain, int studentOrder) {
    if (studentRemain != 1) {
      System.out.println("Keep one exam and pass " + (examRemain - 1) + " to the next student!");
      keepAndPass(studentRemain - 1, examRemain - 1, studentOrder + 1);
    } else {
      System.out.println("This is the last student without an exam!");
    }
    System.out.println("Student " + studentOrder + " starts the exam!");
  }

  public static void main(String[] args) {
    System.out.println("There are 5 students taking the exam!");
    keepAndPass(5, 5, 1);
  }

}