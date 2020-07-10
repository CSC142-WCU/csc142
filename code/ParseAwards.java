import java.util.Scanner;
import java.io.*;

public class ParseAwards {
  public static void main(String[] args) {
    try {
      File awardFile = new File("Awards_CISE_2019.csv");
      Scanner sc = new Scanner(awardFile);      
      while (sc.hasNextLine()) {
        String[] award = sc.nextLine().split("\",\"");
        System.out.println(award[7]);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}