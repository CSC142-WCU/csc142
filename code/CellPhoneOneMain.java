/**
   The CellPhoneOneMain class declares, instantiates, and manipulates CellPhoneOne variables.
*/
public class CellPhoneOneMain {
  public static void main (String[] args) {
    CellPhoneOne aPhone;
    aPhone = new CellPhoneOne();
    aPhone.dims = new double[2];
    aPhone.dims[0] = 5;
    aPhone.dims[1] = 3;
    aPhone.color = "Red";
    aPhone.callNumber("123-456-7890");   
  }
}