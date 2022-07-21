import java.io.*;
import java.util.*;

public class SortSearchDriver {
    public static void main(String[] args) {


	// Part 1
	
	SortSearch ss = new SortSearch(20);
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
    System.out.println("Starting my search at 20"); 
	  i = ss.findSmallestIndex(20);
    System.out.println("Starting my search at -2");
	  i = ss.findSmallestIndex(-2);
	
	// Part 3
  
  	System.out.println(ss);
  	ss.sort();
    System.out.println("Sorted array:");
  	System.out.println(ss);

//we added a constructor to make a static sorted array, since it was annoying to have a bunch of random arrays 
    SortSearch searchArray = new SortSearch();

    System.out.println("\nArray used by search methods:");
  	System.out.println(searchArray);
      
    // Test linearSearch
      
    System.out.println("\n*** LINEAR SEARCH ***");
    System.out.println("Element 5 is located at index (linearSearch): " + searchArray.linearSearch(5));
      
    // Test binarySearch

    System.out.println("\n*** BINARY SEARCH ***");
      
    System.out.println("Element 2 is located at index (binarySearch): " + searchArray.binarySearch(2));

    System.out.println("Element 10 is located at index (binarySearch): " + searchArray.binarySearch(10));
      
    System.out.println("Element 5 is located at index (binarySearch): " + searchArray.binarySearch(5));

    System.out.println("Element 0 is located at index (binarySearch): " + searchArray.binarySearch(0));

    System.out.println("Element 9 is located at index (binarySearch): " + searchArray.binarySearch(9));

    System.out.println("Element 11 is located at index (binarySearch): " + searchArray.binarySearch(11));

      // Test recursive method

      System.out.println("\n*** RECURSIVE BINARY SEARCH ***");
      int searchArraySize = searchArray.getSize();
      System.out.println("Element 5 is located at index (binarySearchR): " + searchArray.binarySearchRecursive(5, 0, searchArraySize - 1));
      System.out.println("Element 0 is located at index (binarySearchR): " + searchArray.binarySearchRecursive(0, 0, searchArraySize - 1));
      System.out.println("Element 10 is located at index (binarySearchR): " + searchArray.binarySearchRecursive(10, 0, searchArraySize - 1));
      System.out.println("Element 9 is located at index (binarySearchR): " + searchArray.binarySearchRecursive(9, 0, searchArraySize - 1));
      System.out.println("Element 15 is located at index (binarySearchR): " + searchArray.binarySearchRecursive(15, 0, searchArraySize - 1));
      
    }
}