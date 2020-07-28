package second_store.base;

public abstract class CellPhone
{
  private double[] dims; 
  private String color; 
  private int brightness; 
  public int batteryLife; 
  public int CPUSpeed; 

  public CellPhone(double[] d, String c) {
    dims = d; 
    color = c;
    brightness = 40;
    batteryLife = 100;
    CPUSpeed = 100;
  }
  
  public void setBrightness(int b) {
    brightness = b; 
  } 
  
  public int getBrightness() {
    return brightness; 
  }
  
  public String getColor() {
    return color; 
  }
   
  public double[] getDims() {
    return dims; 
  }

  public abstract void callNumber(String number);

  public abstract void setCPUSpeed();

  public int getBatteryLife() {
    return batteryLife;
  }

  public int getCPUSpeed() {
    return CPUSpeed;
  }
}