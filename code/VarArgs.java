public class VarArgs {

  public static void printArgs(String... values) {
    System.out.println("Run printArgs ... ");
    for (int i = 0; i < values.length; i++) {
      System.out.println(values[i]);
    }
  }

  public static void main(String[] args) {
    printArgs("rams");
    printArgs("golden","rams");
    printArgs("golden","rams","wcupa");
    printArgs("golden","rams","wcupa","university");
  }
}