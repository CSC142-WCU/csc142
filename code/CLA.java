public class CLA {
  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("The program is not run with any command line arguments");
    } else {
      for (int i = 0; i < args.length; i++) {
        System.out.println("The " + (i+1) + "th argument of args is at position " + i + " of the args array and has value: " +  args[i]);
      }
    }
  }
}