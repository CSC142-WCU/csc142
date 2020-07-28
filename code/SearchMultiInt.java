import java.util.Random;

public class SearchMultiInt {
  public static void main(String[] args) {
    Random rand = new Random();
    int[] numArray = new int[20];

    if (args.length == 0) {
      System.out.println("Usage: java SearchInt NUM1 NUM2 ...");
      System.out.println("With NUM1, NUM2, ... are integers between 0 and 40");
      System.exit(0);
    } 

    String s = "";
    for (int i = 0; i < 20; i++) {
      numArray[i] = rand.nextInt(40);
      s += numArray[i] + " ";
    }
    System.out.println("Array: " + s.trim());

    int count = 0;
    for (int j = 0; j < args.length; j++){
      int num = Integer.parseInt(args[j]);
      for (int i = 0; i < 20; i++) {
        if (num == numArray[i]) {
          System.out.println("Found a match for " + num + " at position " + i);
          count ++;
        }
      }
    }
    if (count == 0) {
      System.out.println("There is no match!");
    }
  }
}