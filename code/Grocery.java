import java.util.Scanner;

public class Grocery {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Cashier c = new Cashier();
    double price = 67.89;
    System.out.println("The price is $" + 67.89);
    System.out.println("Select payment options: ");
    System.out.println("1. Cash");
    System.out.println("2. Credit");
    int paymentMethod = sc.nextInt();
    if (paymentMethod == 1) {
      System.out.println("How much cash are you paying?");
      double cash = sc.nextDouble();
      double remainder = c.payment(cash, price);
      if (remainder < 0) {
        System.out.println("You still need an additional $" + (remainder * (-1)));
      } else {
        System.out.println("You receive back $" + remainder);
      }
    } else {
      CreditCard cc = new CreditCard(100);
      c.payment(cc, price);
      System.out.println("Your credit card balance is $" + cc.getBalance());
    }
  }
}