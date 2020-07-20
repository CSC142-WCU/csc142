import java.util.Random;

public class BinarySearch {
  public static int[] selectionSort(int[] unsorted) {
    int[] numArray = unsorted;
    for (int i = 0; i < numArray.length; i++) {
      int minIndex = i;
      for (int j = i + 1; j < numArray.length; j++) {
        if (numArray[minIndex] > numArray[j]) {
          minIndex = j;
        }
      }
      int tmp = numArray[minIndex];
      numArray[minIndex] = numArray[i];
      numArray[i] = tmp;
    }
    return numArray;
  }

  public static void main(String[] args) {
    Random rand = new Random();
    int size = 20;
    int[] unsorted = new int[size];

    if (args.length != 1) {
      System.out.println("Usage: java SearchInt NUM");
      System.out.println("With NUM is an integer between 0 and " + size);
      System.exit(0);
    } 

    String s = "";
    for (int i = 0; i < size; i++) {
      unsorted[i] = rand.nextInt(size);
      s += unsorted[i] + " ";
    }
    System.out.println("Unsorted Array: " + s.trim());

    s = "";
    int[] sorted = selectionSort(unsorted);
    for (int i = 0; i < size; i++) {
      s += sorted[i] + " ";
    }
    System.out.println("Sorted Array: " + s.trim());

    int num = Integer.parseInt(args[0]);
    int begin = 0;
    int end = size - 1;
    int mid = (begin + end) / 2;
    do {
      if (num < sorted[mid]) {
        end = mid - 1;
      } else if (num > sorted[mid]) {
        begin = mid + 1;
      } else {
        System.out.println("Found a match at position " + mid);
        System.exit(0);
      }
      mid = (begin + end) / 2;
    } while (begin <= end);
    System.out.println("There is no match!");
  }
}