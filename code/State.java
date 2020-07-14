public class State {
  private String name;
  private String[] titles;
  private double[] amounts;
  private double sum;
   
  public State(String stateName, int awardCount) {
    name = stateName;
    titles = new String[awardCount];
    amounts = new double[awardCount];
    sum = 0.0;
  }    

  public String getName() {
    return name;
  }

  public void setTitle(String nsfTitle, int index) {
    titles[index] = nsfTitle;
  }

  public void setAmount(double nsfAwardAmount, int index) {
    amounts[index] = nsfAwardAmount;
    sum += nsfAwardAmount;
  }
  
  public String[] getTitles() {
    return titles;
  }

  public double[] getAmounts() {
    return amounts;
  }

  public int getCount() {
    return titles.length;
  }

  public double getSum() {
    return sum;
  }

}