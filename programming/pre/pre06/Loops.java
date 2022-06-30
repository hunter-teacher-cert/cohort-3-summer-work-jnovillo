import java.io.*;
import java.util.*;

public class Loops{
  public static void main(String[] args){
    double x;
    int n;
    
    // Excercise 2: Square Root
    double a = 9.0;
    x = a/2;
    double x0;
    double diff = Math.abs(x - a);
    while (diff > 0.0001){
      x0 = x;
      x = squareRoot(a, x);
      diff = Math.abs(x - x0);
    }
    System.out.println("Excercise 2: Square Root");
    System.out.println("The square root of " + a + " is " + x);
      
    // Excercise 3: Power
    x = 3.0;
    n = 4;
    double result = power(x, n);
    System.out.println("Excercise 3: Power");
    System.out.println(x + " to the power of " + n + " is " + result);

     // Excercise 4: Factorial
    n = 5;
    int result_fact = factorial(n);
    System.out.println("Excercise 4: Factorial");
    System.out.println(n + " factorial is " + result_fact);
  }

  // Excercise 2: Square Root
  public static double squareRoot(double a, double x){
    return (x + a/x) / 2;
  }

  // Excercise 3: Power
  public static double power(double x, int n){
    double result = x;
    for (int i = 0; i < n - 1; i++){
      result = result * x;
    }
    return result;
  }

  // Excercise 4: Factorial
  public static int factorial(int n) {
    int result = 1;
    for (int i = 1; i <= n; i++) {
      result = result * i;
    }
    return result;
  }
}