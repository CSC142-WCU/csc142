/**
   The CellPhoneTwoMain class declares, instantiates, and manipulates CellPhoneTwo objects.
*/
public class CellPhoneTwoMainWrong {
  public static void main (String[] args) {
    CellPhoneTwo aPhone;
    double[] dims = new double[2];
    dims[0] = 5;
    dims[1] = 3;
    aPhone = new CellPhoneTwo(dims, "Red");
    System.out.println("The phone's current dimension is: " + aPhone.dims[0] + "x" + aPhone.dims[1]);
    System.out.println("The phone's color is: " + aPhone.getColor());
    System.out.println("The phone's current brightness is: " + aPhone.getBrightness());
    aPhone.setBrightness(70);
    System.out.println("The phone's current brightness is: " + aPhone.getBrightness());
    aPhone.callNumber("123-456-7890");   
  }
}
