import java.io.*;
import java.util.*;

public class Craps{
  
  public static void main(String[] args){
    System.out.println("\n\n*** CRAPS GAME ***");
    Scanner in = new Scanner(System.in);
    System.out.println("\nNumber of rounds: ");
    int numRounds = in.nextInt();

    for(int i = 0; i < numRounds; i++){
        System.out.println("\nRound # " + (i+1));
        System.out.println("\n* YOU " + round() + "!!! *\n");
    }
  }
  
  public static int roll(int num){
    Random random = new Random();
    return random.nextInt(num) + 1;
  }

  public static int shoot(int numDice, int maxValue){
    int total = 0;
    for (int i=0; i < numDice; i++){
      total += roll(maxValue);
    }
    return total;
  }
  
  public static String round() {
    int shootValue = shoot(2, 6);
    System.out.println("You rolled " + shootValue);
    if(shootValue == 2 || shootValue == 3 || shootValue == 12){
      System.out.println("Craps! Rolled value " + shootValue);
      return "LOSE";
      }
    else if(shootValue == 7 || shootValue == 11){
      System.out.println("Natural! Rolled value " + shootValue);
      return "WIN";
      }
    else{
      System.out.println("Point! Rolled value " + shootValue);
      int point = shootValue;
      do {
          shootValue = shoot(2, 6);
          System.out.println("You rolled " + shootValue);
          if(shootValue == point){
              System.out.println("Point! Rolled value " + shootValue);
              return "WIN";
          }
          else if(shootValue == 7){
              System.out.println("Craps! Rolled value " + shootValue);
              return "LOSE";
          } 
      } while(shootValue != point || shootValue != 7);
    }
    return "";
  }
  
}