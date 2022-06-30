import java.io.*;
import java.util.*;

public class Max{
  
  public static void main(String[] args){
    // Excercise 4: indexOfMax
    int[] a = {3, 5, 6, 1, 8, 2, 0};
    int idxMax = indexOfMax(a);
    System.out.println("The index of the largest element is: " + idxMax);
  }

  // Excercise 4: indexOfMax
  // Question: Can you write this method using an enhanced for loop?
  // Why or why not
  // Answer: It is not possible to write this method using a enhanced 
  // for loop because they are not helpful to work with indexes.
  public static int indexOfMax(int[] a){
    int idxMax = 0;
    for (int i = 0; i < a.length; i++) {
      if (a[i] > a[idxMax]){
        idxMax = i;
      }
    }
    return idxMax;
  }
}
