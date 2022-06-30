import java.io.*;
import java.util.*;

public class Beer{
  public static void main(String[] args){
    writeVerse(99);
  }

  public static void writeVerse(int num){
    System.out.println(num + " bottles of beer on the wall,");
    System.out.println(num + " bottles of beer,");
    System.out.println("ya’ take one down, ya’ pass it around,");
    System.out.println(num - 1 + " bottles of beer on the wall.");
    if (num > 1){
      writeVerse(num -1);
    }
    else{
        System.out.println("No bottles of beer on the wall,");
        System.out.println("no bottles of beer,");
        System.out.println("ya’ can’t take one down, ya’ can’t pass it around,");
        System.out.println("’cause there are no more bottles of beer on the wall!");
    }
  }
}