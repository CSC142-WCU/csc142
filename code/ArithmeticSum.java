public class ArithmeticSum {

  public static int sumSeries(int num) {
    if (num == 0) {
      return 0;
    } else  {
      return num + sumSeries(num - 1);
    }
  }

  public static void main(String[] args) {
    System.out.println("Evaluate arithmetic sum of " + Integer.parseInt(args[0]));
    System.out.println(sumSeries(Integer.parseInt(args[0])));
  }
}