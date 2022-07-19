import java.io.*;
import java.util.*;


/**
 * Driver class for Time class  by Team LucidThinkeren
 * Jessica Novillo Argudo
 * collaborators: Saranii Muller, Joel Bianchi, Kirk Martin
 */

/**
   INSTRUCTIONS:

   This file contains the Driver starter code for our Time class.
   
   Add code in main to test all your methods
   
   Place this file in a folder named programming/5/Driver.java

*/


public class Driver {

  public static void main(String[] args) {

	  Time t;

    t = new Time();
    
    // Testing toString
    System.out.println("The default time is: " + t);
    
    t = new Time(8, 30, 0);
    
    // Testing toString
    System.out.println("The time is: " + t);

    // Set a new time
    t.set(10, 30, 10);
    System.out.println("The time after setting is: " + t);

    // Add time
    Time t2 = new Time(2, 30, 50);
    t.add(t2);
    System.out.println("The time after adding another time is: " + t);
      
    // Equals
    t = new Time(1, 10, 30);
    if (t.equals(t2)){
      System.out.println("The times are equal.");
    }else{
      System.out.println("The times are not equal.");
    }

    // Compare
    System.out.println("The result of comparing the two Time objects is: " + t.compareTo(t2));
    
  }//end main()
// offshoot task for further exploration:
// comment out your toString() method and recompile, re-run, to watch output of printing a Time object
// (Make a prediction before you run it!)

  //cast in programming
}//end class