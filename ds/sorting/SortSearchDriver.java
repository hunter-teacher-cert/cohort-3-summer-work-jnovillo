import java.io.*;
import java.util.*;

public class SortSearchDriver {
    public static void main(String[] args) {


	// Part 1
	
	SortSearch ss = new SortSearch(10); // TODO: set this to 20
	System.out.println("New Array: \n" + ss);
		
	// Part 2

	 int i;
	 i = ss.findSmallestIndex(0);
	 System.out.println("Starting my search at 0");
	 System.out.println("ss["+ i +"] = "+ss.get(i)+" : " + ss);
   System.out.println("Starting my search at 3");
	 i = ss.findSmallestIndex(3);
	 System.out.println("ss["+ i + "] = "+ss.get(i)+" : " + ss);

    // Test for invalid index
    System.out.println("Starting my search at 10"); // TODO: set this to 20
	  i = ss.findSmallestIndex(10);
    System.out.println("Starting my search at -2");
	  i = ss.findSmallestIndex(10);
	
	// Uncomment these to test part 3

	// System.out.println(ss);
	// ss.sort();
	// System.out.println(ss);
	


	      

    }
}