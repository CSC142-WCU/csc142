public class CLA_Math {
  public static void main(String[] args) {
    if (args.length != 2) {
      System.out.println("The program must take in two command line arguments representing two integer values");
    } else {
      System.out.println("Addition: " + (Integer.parseInt(args[0]) + Integer.parseInt(args[1])));
      System.out.println("Subtraction: " + (Integer.parseInt(args[0]) - Integer.parseInt(args[1])));
      System.out.println("Multiplication: " + (Integer.parseInt(args[0]) * Integer.parseInt(args[1])));
    }
  }
}