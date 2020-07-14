import java.util.*;
import java.io.*;

public class DynamicStateAwards {
  private static ArrayList<DynamicState> stateList(String filename){
    try {
      File awardFile = new File(filename);
      Scanner sc = new Scanner(awardFile);      
      sc.nextLine();
      ArrayList<DynamicState> awardedStates = new ArrayList<DynamicState>();
      String[] award;

      if (sc.hasNextLine()) {
        award = sc.nextLine().split("\",\"");
        awardedStates.add(new DynamicState(award[7]));
        awardedStates.get(0).addAward(award[1],Double.parseDouble(award[12].substring(1).replaceAll(",", "")));
      }

      while (sc.hasNextLine()) {
        award = sc.nextLine().split("\",\"");
        DynamicState tmpState = null;
        for (int i = 0; i < awardedStates.size(); i++) {
          if (awardedStates.get(i).getName().compareTo(award[7]) == 0) {
            tmpState = awardedStates.get(i);
            tmpState.addAward(award[1],Double.parseDouble(award[12].substring(1).replaceAll(",", "")));
            break;
          }
        }
        if (tmpState == null) {
          tmpState = new DynamicState(award[7]);
          tmpState.addAward(award[1],Double.parseDouble(award[12].substring(1).replaceAll(",", "")));
          awardedStates.add(tmpState);
        }
      }
      return awardedStates;
    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
  }

  public static void main(String[] args) {
    ArrayList<DynamicState> fundedStates = stateList("Awards_CISE_2019.csv");
    for (int i = 0; i < fundedStates.size(); i++) {
      System.out.printf("%s: %08.02f\n", fundedStates.get(i).getName(), fundedStates.get(i).getSum());
    }
  }
}