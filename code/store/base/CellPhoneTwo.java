package store.base;
/**
   The CellPhoneTwo class describes the characteristics of a cell phone (first draft). 
*/
public class CellPhoneTwo
{
  // Fields
  private double[] dims; // dimensions of the phone
  private String color;  // color of the phone   
  private int brightness; // brightness of the phone, values between 0 and 100
 
  /** 
    Constructor
    @param dims The dimensions of the phone. 
    @param color The color of the rectangle.
  */
  public CellPhoneTwo(double[] d, String c) {
    dims = d; 
    color = c;
    brightness = 40;
  }
  
  /**
    The setBrightness method stores a value in the brightness field.
    @param w The value to store in brightness. 
  */
  public void setBrightness(int b) {
    brightness = b; 
  } 
  
  /**
    The getBrightness method returns the CellPhoneTwo object's brightness.
    @return The value in the brightness field. 
  */
  public int getBrightness() {
    return brightness; 
  }
  
  /**
    The getColor method returns the CellPhoneTwo object's color.
    @return The value in the color field. 
  */
  public String getColor() {
    return color; 
  }
   
  /**
    The getDims method returns the CellPhoneTwo object's dimensions.
    @return The value in the dims field. 
  */
  public double[] getDims() {
    return dims; 
  }
  /**
     The callNumber method will attemt to call an external number.
     @param number The number to be called.
  */
  public void callNumber(String number) {
      System.out.println("Calling number " + number);
  }
}