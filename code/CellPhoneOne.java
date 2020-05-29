/**
   The CellPhoneOne class describes the characteristics of a cell phone (first draft). 
*/
public class CellPhoneOne
{
   // Fields
  public double[] dims; // dimensions of the phone
  public String color;  // color of the phone   
  
  /**
     The callNumber method will attemt to call an external number.
     @param number The number to be called.
  */
  public void callNumber(String number)
   {
      System.out.println("Calling number " + number);
   }
}