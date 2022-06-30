import java.io.*;
import java.util.*;

public class Sieve{
  
  public static void main(String[] args){
    // Excercise 5: sieve
    int num = 10;
    boolean[] result = sieve(num);
    for (int i = 0; i < result.length; i++){
      System.out.println(i + " is prime: " + result[i]);
    }
  }

  // Excercise 5: sieve
  public static boolean[] sieve(int num){
    boolean[] result = new boolean[num];
    for (int i = 0; i < result.length; i++){
      result[i] = isPrime(i);
    }
    return result;
  }

  // Check if number num is prime
  public static boolean isPrime(int num){
    if (num <= 1){
      return false;
    }
    for (int i = 2; i < num; i++){
      if (num % i == 0){
        return false;
      }
    }
    return true;
  }
}