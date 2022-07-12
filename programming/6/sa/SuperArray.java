/**
 * SuperArray by Team Room 8
 * Jessica Novillo Argudo
 * collaborators: Adam Prado, Qianhui Vanessa Zou, Maxwell Yearwood
 */


/**
   SKELETON
   SuperArray is a wrapper class for an array.

   Provides "pass-thru" accessibility to pre-existing array capabilities:
   - get/set by index
   - get length

   Adds functionality:
   - dynamic capacity
   - auto-grow capacity if necessary
*/

import java.io.*;
import java.util.*;

public class SuperArray
{
  /**
     SUBGOAL:
     declare instance vars
     ...and initialize?
  */


  //instance vars
  private int[] data;           // "interior"/"underlying" data container
  private int numberElements;   // number of "meaningful" elements


  // ~~~~~~~~~~~~~~~ CONSTRUCTORS ~~~~~~~~~~~~~~~
  //overloaded constructor -- allows specification of initial capacity
  public SuperArray( int size )
  {
    
    //init underlying/inner storage of specified capacity
    //init instance vars
    data = new int[ size ];
    numberElements = 0;

  }

  //default constructor -- initializes capacity to 10
  public SuperArray()
  {
    
    //init underlying/inner storage of capacity 10
    //init instance vars
    data = new int[ 10 ];
    numberElements = 0;
  
  }


  // ~~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~
  public void add( int value )
  {
    // test to see if we need to grow, then grow
    if (data.length == numberElements){ 
      grow();
    }
    /**
       IMPORTANT:
       This is the first code that should run in this method
       but the last code you should write.
       Implement the rest of this method first,
       then only write this section once the rest is tested and working.
    */

    /* YOUR SIMPLE+SMART CODE HERE */
    // add item
    data[numberElements] = value;

    // increment numberElements
    numberElements ++;

  }//end add()


  public boolean isEmpty()
  {
    
    //return whether this SuperArray instance is empty
    return numberElements == 0;
  }


  public int get(int index)
  {
    
    //return item at index
    return data[index];
    
  }


  public String toString()
  {
    //return stringified version of this Object
    String str = "";
    for (int i=0; i<numberElements; i++){
      str += data[i] + " ";
    }

    return str;
  }//end toString()


  //return Stringified version of this Object,
  // with extra debugging info
  //(helper method for debugging/development phase)
  public String debug()
  {
    
    String s = "";
    s = "Size: " + data.length;
    s = s + " LastItem: " + numberElements + "  Data: ";
    for (int i = 0; i < numberElements; i++) {
      s = s + data[i] + ", ";
    }
    s = s + "\n";
    return s;
    
  }//end debug()


  public void remove(int index)
  {
    
    // shift items down to remove the item at index
    for (int i=index; i<numberElements - 1; i++){
      data[i] = data[i + 1];
    }

    // set last element as 0
    // data[numberElements - 1] = 0; // after discussing in class we do not need this line, since numberElements is the indicator of meaningful elements
    
    // subtract from numElements;
    numberElements --;

  }

  
  public void add(int index, int value)
  {

    // check if index is not out of range. ex: large number like 2000 or negative numbers
    if(index <= numberElements && index >= 0){
      // if there is no more room in data
      // then we call function grow to make the array larger
      if (data.length == numberElements){
        grow();
      }
  
      // shift elements toward the end of the array
      for (int i=numberElements; i> index; i--){
        data[i] = data[i - 1];
      }
  
      // insert new element
      data[index] = value;
  
      // increment numElements
      numberElements ++;
    } else{
      System.out.println("Out of range! Index is too large or negative, did not add element to list");
    }
  }
  

  // make data grow if there is no more room
  private void grow()
  {
    // create a new array with 5 extra spaces
    int[] newData = new int[numberElements + 5];

    // Q: How did you decide how much to increase capacity by? 
    // Directions on GitHub ask to make the new array 5 units larger.
    // Also, it is more efficient to add 5 elements or more than do it 1 by 1

    // copy over all the elements from the old array to the new one
    for (int i=0; i<data.length; i++){
      newData[i] = data[i];
    }

    // point data to the new array
    data = newData;
    
    // Q: How does this look when illustrated using encapsulation diagram
    
  }//end grow()


  // set value to indicated index
  public void set(int index, int value){

    // check if index is not out of range. ex: large number like 2000 or negative numbers
    if(index <= numberElements && index >= 0){
      data[index] = value;
    }else{
      System.out.println("Out of range! Index is too large or negative, did not add element to list");
    }
    
  }
  
}//end class