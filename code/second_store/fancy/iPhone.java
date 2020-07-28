package second_store.fancy;
import second_store.base.CellPhone;

public class iPhone extends CellPhone {
  private String make;
  private double price;

  public iPhone (String make, double price, double[] dims, String color) {
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

  @Override
  public void callNumber(String number) {
    System.out.println("Calling number in a fancy and expensive manner " + number);
    batteryLife -= 3;
    setCPUSpeed();
  }

  @Override
  public void setCPUSpeed() {
    if (batteryLife > 80) {
      CPUSpeed = 100;
    } else if (batteryLife > 50) {
      CPUSpeed = 70;
    } else {
      CPUSpeed = 50;
    }
  } 
}