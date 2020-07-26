package store.fancy;
import store.base.CellPhoneTwo;

public class Android extends CellPhoneTwo {
  private String make;
  private double price;

  public Android (String make, double price, double[] dims, String color) {
    super(dims, color);
    this.make = make;
    this.price = price;
  }

  public String getMake() {
    return make;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }
}