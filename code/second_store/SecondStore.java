package second_store;
import second_store.fancy.*;

public class SecondStore {
  public static void main (String[] args) {
    Galaxy s3 = new Galaxy("S3",500.00, new double[]{5.0, 3.0}, "Gray");
    iPhone X = new iPhone("X", 100.00, new double[]{7.0, 3.5}, "Rose Gold");

    for (int i = 0; i < 30; i++) {
      s3.callNumber("123-456-7890");   
      X.callNumber("123-456-7890");
    }

    System.out.println("Galaxy battery: " + s3.getBatteryLife());
    System.out.println("iPhone battery: " + X.getBatteryLife());
  }
}
