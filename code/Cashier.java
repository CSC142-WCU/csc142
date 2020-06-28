public class Cashier {
  public static double payment (double cash, double price) {
    return (cash - price);
  }
  
  public static void payment (CreditCard cc, double price) {
    cc.debit(price);
  }
}