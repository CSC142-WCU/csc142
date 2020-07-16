import java.util.Scanner;
import java.io.*;

public class ExtendedStateAwards {
  private static String[] allStates = new String[]{"AK", "AL", "AR", "AS", "AZ", "CA", 
                                                   "CO", "CT", "DC", "DE", "FL", "GA", 
                                                   "GU", "HI", "IA", "ID", "IL", "IN", 
                                                   "KS", "KY", "LA", "MA", "MD", "ME", 
                                                   "MI", "MN", "MO", "MP", "MS", "MT", 
                                                   "NC", "ND", "NE", "NH", "NJ", "NM", 
                                                   "NV", "NY", "OH", "OK", "OR", "PA", 
                                                   "PR", "RI", "SC", "SD", "TN", "TX", 
                                                   "UM", "UT", "VA", "VI", "VT", "WA", 
                                                   "WI", "WV", "WY"};

  private static int getStateIndex(String name) {
    for (int i = 0; i < allStates.length; i++) {
      if (allStates[i].compareTo(name) == 0) {
        return i;
      }
    }
    return -1;
  }

  private static State[] stateList(String filename){
    int[] countPerState = new int[allStates.length];
    int stateCount = 0;
    Scanner sc;
    try {
      BufferedReader br = new BufferedReader(new FileReader(filename));      
      br.readLine();
      String current = null;
      while ((current = br.readLine()) != null) {
        String[] award = current.split("\",\"");
        int currentIndex = getStateIndex(award[7]);
        if (currentIndex != -1) {
          if (countPerState[currentIndex] == 0) {
            stateCount += 1;
          }
          countPerState[currentIndex] += 1;
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

    State[] awardedStates = new State[stateCount];
    int index = 0;
    for (int i = 0; i < allStates.length; i++){
      if (countPerState[i] > 0) {
        awardedStates[index] = new State(allStates[i], countPerState[i]);
        int awardIndex = 0;
        try {
          BufferedReader br = new BufferedReader(new FileReader(filename));      
          br.readLine();
          String current = null;
          while ((current = br.readLine()) != null) {
            String[] award = current.split("\",\"");
            if (allStates[i].compareTo(award[7]) == 0) {
              awardedStates[index].setTitle(award[1],awardIndex);
              awardedStates[index].setAmount(Double.parseDouble(award[12].substring(1).replaceAll(",", "")),awardIndex);
              awardIndex++;
            }
          }
        } catch (IOException e) {
          e.printStackTrace();
        }
        index++;
      }
    }
    return awardedStates;
  }

  public static void main(String[] args) {
    State[] fundedStates = stateList("Awards_CISE_2019.csv");
    for (int i = 0; i < fundedStates.length; i++) {
      System.out.println(fundedStates[i].getName() + ": " + fundedStates[i].getSum());
    }
  }
}