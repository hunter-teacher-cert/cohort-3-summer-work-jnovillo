import java.io.*;
import java.util.*;

public class Methods{
  public static void main(String[] args){
    int n;
    int m;
    boolean result;
    
    // Exercise 2: isDivisible
    System.out.println("Exercise 2: isDivisible");
    n = 10;
    m = 2;
    result = isDivisible(n, m);
    if (result){
      System.out.println(n + " is divisible by " + m);
    }
    else{
      System.out.println(n + " is not divisible by " + m);
    }

    // Exercise 3: isTriangle
    System.out.println("Exercise 3: isTriangle");
    int x = 7;
    int y = 3;
    int z = 5;
    result = isTriangle(x, y, z);
    if (result){
      System.out.println("Yes, a triangle can be formed using these sticks: " + x + ", " + y + ", " + z);
    }
    else{
      System.out.println("No, a triangle cannot be formed using these sticks: " + x + ", " + y + ", " + z);
    }

    // Exercise 8: Ackermann
    System.out.println("Exercise 8: Ackermann");
    m = 2;
    n = 3;
    System.out.println(ack(m, n));
  }
  
  // Exercise 2: isDivisible
  public static boolean isDivisible(int n, int m){
    if (n % m == 0){
      return true;
    }
    else{
      return false;
    }
  }

  // Exercise 3: isTriangle
  public static boolean isTriangle(int x, int y, int z){
		if (x > (y + z)) {
			return false;
		} else if (y > (x + z)) {
			return false;
		} else if (z > (x + y)) {
			return false;
		} else {
			return true;
		}
  }

  // Exercise 8: Ackermann
  public static int ack(int m, int n){
    if (m == 0){
      return n + 1;
    }
    else if (m > 0 && n == 0){
      return ack(m - 1, 1);
    }
    else{
      return ack(m - 1, ack(m, n - 1));
    }
  }
}