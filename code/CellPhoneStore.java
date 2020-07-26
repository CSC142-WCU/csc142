public class CellPhoneStore {
  public static void main (String[] args) {
    Android aPhone;
    double[] dims = new double[2];
    dims[0] = 5;
    dims[1] = 3;
    aPhone = new Android("PX4",500.00, dims, "Red");
    System.out.println("The phone's dimensions are: " + aPhone.getDims()[0] + "x" + aPhone.getDims()[1]);
    System.out.println("The phone's color is: " + aPhone.getColor());
    System.out.println("The phone's brand: " + aPhone.getMake());    
    aPhone.callNumber("123-456-7890");   
  }
}
