import java.util.Random;

public class SelectionSortVisual {
  public static void main(String[] args) {
    Random rand = new Random();
    int size = 10;
    int[] numArray = new int[size];

    String s = "";
    for (int i = 0; i < size; i++) {
      numArray[i] = rand.nextInt(40);
      s += numArray[i] + " ";
    }
    System.out.println("Unsorted array: " + s.trim());

    s = "";
    for (int i = 0; i < size; i++) {
      System.out.println("Index: " + i + "  =======================================");
      String tmpS = s + "| [" + numArray[i] + "] ";
      int minIndex = i;
      for (int j = i + 1; j < size; j++) {
        if (numArray[minIndex] > numArray[j]) {
          minIndex = j;
        }
      }

      for (int j = i + 1; j < size; j++) {
        if (j == minIndex) {
          tmpS += "[" + numArray[j] + "] ";
        } else {
          tmpS += numArray[j] + " ";
        }
      }

      int tmp = numArray[minIndex];
      numArray[minIndex] = numArray[i];
      numArray[i] = tmp;
      s += numArray[i] + " ";

      String partial = s;
      for (int j = i + 1; j < size; j++) {
        partial += numArray[j] + " ";        
      }
      System.out.println("Swap?: " + tmpS);
      System.out.println("Partial: " + partial);
    }
    System.out.println("===========================================================");
    System.out.println("Final sorted array: " + s.trim());
  }
}