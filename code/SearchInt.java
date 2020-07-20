import java.util.Random;


public class SearchInt {
  public static void main(String[] args) {
    Random rand = new Random();
    int[] numArray = new int[20];

    if (args.length != 1) {
      System.out.println("Usage: java SearchInt NUM");
      System.out.println("With NUM is an integer between 0 and 40");
      System.exit(0);
    } 

    String s = "";
    for (int i = 0; i < 20; i++) {
      numArray[i] = rand.nextInt(40);
      s += numArray[i] + " ";
    }
    System.out.println("Array: " + s.trim());


    int num = Integer.parseInt(args[0]);
    for (int i = 0; i < 20; i++) {
      if (num == numArray[i]) {
        System.out.println("Found a match at position " + i);
        System.exit(0);
      }
    }

    System.out.println("There is no match!");
  }
}