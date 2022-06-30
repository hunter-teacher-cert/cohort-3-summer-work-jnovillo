import java.io.*;
import java.util.*;

public class Time {
  public static void main(String[] args){
    // // Chapter 2 - Exercise 3
    final int SEC_IN_HOUR = 3600;
    final int SEC_IN_MIN = 60;
    final int SEC_IN_DAY = SEC_IN_HOUR * 24;

    // initial time
    int hour = 23 * SEC_IN_HOUR;
    int minute = 30 * SEC_IN_MIN;
    int second = 0;
    
    int secSinceMidnight = hour + minute + second;
    int secRemaining = SEC_IN_DAY - secSinceMidnight;
    double percentage = (Double.valueOf(secSinceMidnight) / SEC_IN_DAY) * 100;

    // final time
    hour = 23 * SEC_IN_HOUR;
    minute = 45 * SEC_IN_MIN;
    second = 0;
    
    int secFinish = hour + minute + second;
    int elapsedTimeSec = secFinish - secSinceMidnight;
    int elapsedTimeMin = elapsedTimeSec / SEC_IN_MIN;

    System.out.println("The time is: 23:30:00");
    System.out.println("Seconds since midnight: " + 
                       secSinceMidnight);
    System.out.println("Remaining seconds: " + secRemaining);
    System.out.println("Percentage of the day: " + 
                       String.format("%.2f", percentage));
    System.out.println("Elapsed time: " + elapsedTimeSec + 
                       " seconds" + " or " + elapsedTimeMin + 
                       " minutes");
  }
}