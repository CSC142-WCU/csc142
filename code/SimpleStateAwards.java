import java.util.Scanner;
import java.io.*;

public class SimpleStateAwards {
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

  private static double[][] stateList(String filename){
    int[] countPerState = new int[allStates.length];
    int stateCount = 0;
    Scanner sc;
    try {
      File awardFile = new File(filename);
      sc = new Scanner(awardFile);      
      sc.nextLine();
      while (sc.hasNextLine()) {
        String[] award = sc.nextLine().split("\",\"");
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

    double[][] statesReport = new double[stateCount][3];
    int index = 0;
    for (int i = 0; i < allStates.length; i++){
      if (countPerState[i] > 0) {
        statesReport[index][0] = i;
        try {
          File awardFile = new File(filename);
          sc = new Scanner(awardFile);      
          sc.nextLine();
          while (sc.hasNextLine()) {
            String[] award = sc.nextLine().split("\",\"");
            if (allStates[i].compareTo(award[7]) == 0) {
              statesReport[index][1] += 1;
              statesReport[index][2] += Double.parseDouble(award[12].substring(1).replaceAll(",", ""));
            }
          }
        } catch (IOException e) {
          e.printStackTrace();
        }
        index++;
      }
    }
    return statesReport;
  }

  public static void main(String[] args) {
    double[][] fundedStates = stateList("Awards_CISE_2019.csv");
    for (int i = 0; i < fundedStates.length; i++) {
      System.out.printf("%s: %08.02f\n", allStates[(int)fundedStates[i][0]], fundedStates[i][2]);
    }
  }
}