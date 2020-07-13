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
    return null;
  }

  private static String[] stateList(String filename){
    String states = "";
    try {
      File awardFile = new File(filename);
      Scanner sc = new Scanner(awardFile);      
      sc.nextLine();
      while (sc.hasNextLine()) {
        String[] award = sc.nextLine().split("\",\"");
        if (!states.contains(award[7])){
          states += award[7] + " ";
        }
      }
      return states.split(" ");
    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
  }

  public static void main(String[] args) {
    String[] fundedStates = stateList("Awards_CISE_2019.csv");
    for (int i = 0; i < fundedStates.length; i++) {
      System.out.println(fundedStates[i]);
    }
  }
}