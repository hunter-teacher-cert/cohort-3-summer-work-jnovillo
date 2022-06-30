import java.io.*;
import java.util.*;
import java.lang.Math;
/*
group project by: Greg Sciame, Maxwell Yearwood, Sam Lojacono, Jessica Novillo Argudo, & Alana Robinson
*/


public class Nim 
{
    public static void main(String[] args) {
      int stones = 12;
      int stonesTaken;
      String player = "user";

      Scanner input = new Scanner(System.in);
      //loop until game ends
      while(stones > 0){
        if(player == "user"){
          // prompt user for input (user turn)
          System.out.println("How many stones would you like to remove from the bag? (1, 2, or 3)");
          stonesTaken = input.nextInt();
          //calculate the number of stones remaining, print
          while (stonesTaken > 3 || stonesTaken < 1){
            System.out.println("Try again, you should enter 1, 2 or 3: ");
            stonesTaken = input.nextInt();
          }
          while (stonesTaken > stones){
            System.out.println("There are only " + stones + " in the bag.");
            System.out.println("Try again, you should enter a number <= to " + stones);
            stonesTaken = input.nextInt();
          }   
          
          stones = stones - stonesTaken;
          System.out.println("There are now " 
                             + stones  
                             + " stones remaining.");
          if(stones < 1){
            break;
          }
          player = "computer"; 
        } else if(player == "computer"){
          //check for win
          
          stonesTaken = ((int)(Math.random()*3)+1);

          if (stonesTaken > stones){
            stonesTaken = stones;
          }

          System.out.println("Now the computer selects " 
                             + stonesTaken );
          //machine turn
          stones = stones - stonesTaken;
          
          System.out.println("There are now " 
                             + stones  
                             + " stones remaining.");
          
          //check win
          if(stones < 1){
            break;
          }
          player = "user";
        }
      }
      System.out.println("You win, " + player);
    }
}