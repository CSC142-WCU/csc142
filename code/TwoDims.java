public class TwoDims {
  public static void main(String[] args) {
    int[][] oneArray = new int[3][3];
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        oneArray[i][j] = i * 3 + j;
      }
    }

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
          System.out.print(oneArray[i][j] + " ");
      }
      System.out.println("");
    }

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
          System.out.print(oneArray[j][i] + " ");
      }
      System.out.println("");
    }

  }
}