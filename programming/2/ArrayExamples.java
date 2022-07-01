/* THIS IS CODE DONE DURING LECTURE */

import java.util.*;
import java.io.*;

public class ArrayExamples {
  static int someData[] = new int[] {45, 23, 78, 67, 23};
  // static int someDataSize = someData.length;
  static int someDataSize = 3;
  
  public static void main(String[] args) {
    printArray(someData);
    printPartialArray(someData, someDataSize);
    int theIndex = find(67, someData);
    System.out.println("67 is in position " + theIndex);
    theIndex = find(20, someData);
    if (theIndex == someData.length){
      System.out.println("20 is not in someData");
    }
    System.out.println("20 is in position " + theIndex);
  }

  // precondition: Assumes array is filled
  public static void printArray(int[] data) {
    for (int i=0; i<data.length; i++){
      System.out.print(data[i] + " ");
    }  
    System.out.println("");
  }
  
  // precondition: Assumes array is partially filled
  public static void printPartialArray(int[] data, int currSize) {
    for (int i=0; i<currSize; i++){
      System.out.print(data[i] + " ");
    }  
    System.out.println("");
  }

  // return position of targetItem if found
  // If not found return the array size
  public static int find(int targetItem, int[] data){
    for (int i=0; i< data.length; i++){
      if (data[i] == targetItem) return i;
    }
    // post condition: loop ended
    return data.length;
  }


}