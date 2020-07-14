import java.util.*;

public class DynamicState {
  private String name;
  private ArrayList<String> titles;
  private ArrayList<Double> amounts;
  private double sum;
   
  public DynamicState(String stateName) {
    name = stateName;
    titles = new ArrayList<String>();
    amounts = new ArrayList<Double>();
    sum = 0.0;
  }    

  public String getName() {
    return name;
  }

  public void addAward(String nsfTitle, double nsfAwardAmount) {
    titles.add(nsfTitle);
    amounts.add(nsfAwardAmount);
    sum += nsfAwardAmount;
  }
  
  public ArrayList<String> getTitles() {
    return titles;
  }

  public ArrayList<Double> getAmounts() {
    return amounts;
  }

  public int getCount() {
    return titles.size();
  }

  public double getSum() {
    return sum;
  }

}