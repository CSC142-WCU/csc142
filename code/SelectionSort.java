import java.util.Random;

public class SelectionSort {
  public static void main(String[] args) {
    Random rand = new Random();
    int[] numArray = new int[20];

    String s = "";
    for (int i = 0; i < 20; i++) {
      numArray[i] = rand.nextInt(40);
      s += numArray[i] + " ";
    }
    System.out.println("Unsorted array: " + s.trim());

    s = "";
    for (int i = 0; i < 20; i++) {
      int minIndex = i;
      for (int j = i + 1; j < 20; j++) {
        if (numArray[minIndex] > numArray[j]) {
          minIndex = j;
        }
      }
      int tmp = numArray[minIndex];
      numArray[minIndex] = numArray[i];
      numArray[i] = tmp;
      s += numArray[i] + " ";
    }
    System.out.println("Sorted array: " + s.trim());
  }
}