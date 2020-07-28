public class CheckNum  {
  public static void main(String[] args) {
    int[] a = new int[]{0,0,0,0,0,0,0,0,0};
    for (int i = 0; i < 9; i++) {
      int num = Integer.parseInt(args[i]) - 1; 
      a[num] = 1;
      
    }
    int sum = 0;
    for (int i = 0; i < 9; i++) {
      sum += a[i];
    }
    System.out.println(sum);
  }
}