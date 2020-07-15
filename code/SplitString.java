public class SplitString {
  public static void main(String[] args) {
    String s = "a-b-c-d";
    String listS[] = s.split("b-c");
    for (int i = 0; i < listS.length; i++) {
      System.out.println(listS[i]);
    }
  }
}