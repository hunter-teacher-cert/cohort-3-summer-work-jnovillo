import java.io.*;
import java.util.*;

public class Array{
  public static void main(String[] args){

    // Exercise 8.1: powArray
    int power = 2;
    double[] a = {1, 2, 3, 4, 5};
    double[] result = powArray(a, power);
    System.out.println("Exercise 8.1: powArray");
    for (int i = 0; i < result.length; i++) {
      System.out.println(result[i]);
    }

    // Exercise 8.2: histogram
    int count = 5;
    int[] arrayHist = {1, 2, 2, 3, 3, 4};    
    int[] resultHist = histogram(arrayHist, count);
    System.out.println("Exercise 8.2: histogram");
    for (int i = 0; i < resultHist.length; i++) {
      System.out.println(resultHist[i]);
    }    
  }

  // Exercise 8.1: powArray
  public static double[] powArray(double[] a, int power) {
    double[] result = new double[a.length];
    for (int i = 0; i < a.length; i++) {
      result[i] = Math.pow(a[i], power);
    }
    return result;
  }
  
  // Exercise 8.2: histogram
  public static int[] histogram(int[] a, int counters){
      int[] result = new int[counters];
      for(int i = 0; i < a.length; i++){
          result[a[i]]++;
      }
      return result;
  }
}