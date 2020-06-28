public class CreditCard {
  private static double balance;

  public CreditCard(double b) {
    balance = b; 
  }
  
  public static void debit (double amount) {
    balance = balance - amount;
  }
  
  public static void credit (double amount) {
    balance = balance + amount;
  }
  
  public static double getBalance () {
    return balance;
  }
}