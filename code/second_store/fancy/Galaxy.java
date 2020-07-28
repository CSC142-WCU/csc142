package second_store.fancy;
import second_store.base.CellPhone;

public class Galaxy extends CellPhone {
  private String make;
  private double price;

  public Galaxy (String make, double price, double[] dims, String color) {
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
    System.out.println("Calling number in a fancy manner " + number);
    batteryLife -= 2;
    setCPUSpeed();
  }

  @Override
  public void setCPUSpeed() {
    if (batteryLife > 80) {
      CPUSpeed = 100;
    } else if (batteryLife > 50) {
      CPUSpeed = 60;
    } else {
      CPUSpeed = 40;
    }
  } 
}