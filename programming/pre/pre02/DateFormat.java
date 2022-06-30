import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;

public class DateFormat {
  public static void main(String[] args){
    // Chapter 2 - Exercise 2
    Date today = new Date();
    SimpleDateFormat formatter_ame = new SimpleDateFormat(
      "EEEE, MMMM dd, yyyy");
    SimpleDateFormat formatter_eu = new SimpleDateFormat(
      "EEEE dd MMMM yyyy");
    
    System.out.println("American format:");
    System.out.println(formatter_ame.format(today));
    System.out.println("European format:");
    System.out.println(formatter_eu.format(today));
  }
}