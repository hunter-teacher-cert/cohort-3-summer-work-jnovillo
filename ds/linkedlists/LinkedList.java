/**
 * Driver - Node - LinkedList
 * collaborators: Rachel Kaufman, Joel Bianchi, Latoya B, Jessica N
 */

import java.io.*;
import java.util.*;

/**
Basic
-----
+ add(string value)
- get(int index);
- toString()

Intermediate 
------------
- size()
- add(int index,String value)
- indexOf(String value);
- toArray()

Challenge
--------
- remove(int index);
*/

public class LinkedList{

  private Node head;

  public LinkedList(){
    head = null;
  }

  // add() adds a new node that points to the head, and makes the new node the new head
  public void add(String value){

    //create a new node that points to the old head
    Node front = new Node(value, head);

    //make the new node the new head
    head = front;
  }

// get() returns the string at the node in the specified index
  public String get(int index){

    //create reference to help loop through list
    Node walker = head;
    int counter = 0;

    while (walker != null){
      if (counter == index){
        return walker.getData();
      }
      counter++;
      walker = walker.getNext();
    }
    return "The index " + index + " does not exist.";

  }

 // toString() returns a string version of the list
  public String toString(){
    
    //create a walker
    Node walker = head;

    //create a variable to store our String representation
    String nodeStr = "";

    //loop through the linkedlist until there are no nodes left
    while (walker != null) {

      //add the data from each node to the nodeString
      nodeStr += walker;

      //move walker on to the next node
      walker = walker.getNext();
      
      //System.out.println(walker.getData());
    } 
    
    return nodeStr;

  }

  

  /**
  returns the number of elements in the list
  */
  public int size(){
    
    //create reference to help loop through list
    Node walker = head;
    int counter = 0;

    while (walker != null){
      counter++;
      walker = walker.getNext();
    }
    return counter;
    
  }



  /**
  Parameters:
  index - an int with the location to add
  value - the new value

  Adds a new node with the String value to the list.
  The new node should be added at the location specified by the index.

  For example, given the list:
  "a" -> "b" -> "c" -> "d"

  add(1,"z") results in:
  "a"-> "z" -> "b" -> "c" -> "d"

  */
  public void add(int index, String value){

    // Special case when index is zero
    if (index == 0){
      // Call the method add we did it before
      add(value);
    } else { // Other cases != than zero
      int counter = 0;
      Node walker = head;
  
      while (walker != null){
        if (counter == index - 1){
          Node n = new Node(value, walker.getNext());
          walker.setNext(n);
          break;
        }
        counter++;
        walker = walker.getNext();
      }
    }
  
 }


  /**
  Returns the index (location) of the first node in the list
  that contains value.

  Example:
  Given the list:
  "a"->"b"->"c"->"d"->"e"
  indexOf("d") would return 3 since "d" is at location 3.

  */
  public int indexOf(String value){
    //create reference to help loop through list
    Node walker = head;
    int counter = 0;

    while (walker != null){
      if (walker.getData() == value){
        return counter;
      }
      counter++;
      walker = walker.getNext();
    }
    //return "The index " + index + " does not exist.";
    
    return counter;
  }


  /**
  This routine should create a new array that is the same
  size as the number of Nodes in the list.

  It should then copy all of the values to the array and return
  the array.

  */
  public String[] toArray(){

    int len = size();
    String[] array = new String[len];
    Node walker = head;
    
    for (int i=0; i<len; i++){
      array[i] = walker.getData();
      walker = walker.getNext(); 
    }
    
    return array;
    
  }



  /**
  Remove the Node at location index from the list.

  Ex:
  
  Given the list:
  "a"->"b"->"c"->"d"->"e"

  remove(2) results in:
  "a"->"b"->"d"->"e"
  */
  public void remove(int index){
    if (index == 0){
      head = head.getNext();
    } else if (index < 0 || index > size() -1){
      System.out.println("Invalid index to remove: " + index);
    }else {
      Node walker = head;
      int counter = 0;
      while (walker != null){
        if (counter == index - 1){
          walker.setNext(walker.getNext().getNext());
          break;
        }
        counter ++;
        walker = walker.getNext();
      }
    }
  }
  
}