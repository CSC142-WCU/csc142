import java.util.Scanner;
import java.io.*;

public class ParseAwards {
  public static void main(String[] args) {
    try {
      BufferedReader br = new BufferedReader(new FileReader("Awards_CISE_2019.csv"));      
      br.readLine();
      String current = null;
      while ((current = br.readLine()) != null) {
        String[] award = current.split("\",\"");
        System.out.println(award[7]);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}