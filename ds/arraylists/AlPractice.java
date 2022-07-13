import java.io.*;
import java.util.*;

/** Methods to write

Basic level: DONE
------------
public static ArrayList<Integer> buildRandomList(int size, int maxval)
public static int sumOfList(ArrayList<Integer> dataList)

Intermediate level: DONE
-------------------
public static void swapElements(ArrayList<Integer> dataList, int indexA,int indexB)
public static void removeValue(ArrayList<Integer> dataList, int valueToRemove)

Challenge level: DONE
-------------------
public static ArrayList<Integer> sumLists(ArrayList<Integer>ListA,ArrayList<Integer>ListB)
public static ArrayList<Integer> zipLists(ArrayList<Integer>ListA,ArrayList<Integer>ListB)
*/


public class AlPractice{

  /**
  Parameters:
  - size - an integer representing how many items to add to the list
  - maxval - the largest value to store in the list
  Preconditions:
  - size >= 0
  - maxVal > 0
  Returns:
  - A new ArrayList of Integers with each value being a random
    number between 0 and maxval (not including maxval).
  */
  public static ArrayList<Integer> buildRandomList(int size, int maxval){
    
    ArrayList<Integer> data = new ArrayList<Integer>();
    Random r = new Random();
    
    for(int i=0; i<size; i++){
      data.add(r.nextInt(maxval));
    }
    
    return data;
  }

  /**
  Parameters:
  - dataList - an ArrayList of integer values.
  Returns:
  - The sum of all of the elements of the ArrayList.
  */
  public static int sumOfList(ArrayList<Integer> dataList){

    int sum=0;

    for(int i=0; i<dataList.size(); i++){
      sum += dataList.get(i);
    }
    
    return sum;
  }

  /**
  Parameters:
  - dataList - an ArrayList of Integers
  - index1, index2 - the two locations to swap.
  Preconditions:
  - index1 and index2 are valid indecies of dataList
  Postconditions:
  - The ArrayList is modified such that
    The value that was in dataList[index1] is now in dataList[index2], and
    the value  that was in dataList[index2] is now in dataList[index1].
  - No other values should be modified.
  */
  public static void swapElements(ArrayList<Integer> dataList, int index1,int index2){
    
    // temporal variable that holds one of the elements
    int tmp = dataList.get(index1);

    dataList.set(index1, dataList.get(index2));
    dataList.set(index2, tmp);
    
  }

  /**
  Parameters:
  - dataList - an AraryList of Integers
  - valueToRemove - the value to remove
  Postconditions:
  - The dataList is modified such that all occurances of valueToRemove are removed.
  */
  public static void removeValue(ArrayList<Integer> dataList, int valueToRemove){
    
    for (int i=0; i<dataList.size(); i++){
      if (dataList.get(i) == valueToRemove){
        dataList.remove(i);
        i--;
      } 
    }

  }


  /**
  Parameters:
  - ListA,ListB - ArrayLists of integer values.
  Preconditions:
  - ListA and ListB have equal lengths.
  Returns:
  - A new ArrayList that contains the sum of the corresponding indecies of the two arraylists.
    e.g. sumLists( [1,2,3], [4,0,5]) would return: [5,2,8]
  Postconditions:
  - The parameter ArrayLists should not be modified.
  */
  public static ArrayList<Integer> sumLists(ArrayList<Integer>ListA,ArrayList<Integer>ListB){
    
    ArrayList<Integer> sumList = new ArrayList<Integer>();

    if (ListA.size() > ListB.size()){
      for (int i=0; i<ListA.size(); i++){
        if (i < ListB.size()){
          sumList.add(ListA.get(i) + ListB.get(i));
        }
        else{
          sumList.add(ListA.get(i));
        }
      }
    }else{
      for (int i=0; i<ListB.size(); i++){
        if (i < ListA.size()){
          sumList.add(ListA.get(i) + ListB.get(i));
        }
        else{
          sumList.add(ListB.get(i));
        }
      }     
    }
    
    return sumList;//placeholder to compile.
  }

  /** zipLists
  Parameters:
  - ListA,ListB - ArrayLists of integer values.
  Returns:
  - A new ArrayList that contains all of the elements from both ArrayLists in alternating order starting with ListA's first element.
    When one list has no more values to add, continue adding the remaining values of the longer list.
    e.g. zipLists( [1,2,3,4], [8,9]) would return: [1,8,2,9,3,4]
  Postconditions:
  - The parameter ArrayLists should not be modified.
  */
  public static ArrayList<Integer> zipLists(ArrayList<Integer>ListA,ArrayList<Integer>ListB){
    
    ArrayList<Integer> zipList = new ArrayList<Integer>();
    
    if (ListA.size() > ListB.size()){
      for (int i=0; i<ListA.size(); i++){
        if (i < ListB.size()){
          zipList.add(ListA.get(i));
          zipList.add(ListB.get(i));
        }else{
          zipList.add(ListA.get(i));
        }
      }
    }else{
      for (int i=0; i<ListB.size(); i++){
        if (i < ListA.size()){
          zipList.add(ListA.get(i));
          zipList.add(ListB.get(i));
        }else{
          zipList.add(ListB.get(i));
        }
      }    
    }
    return zipList;//placeholder to compile.
  }




public static void main(String[] args) {

    ArrayList<Integer> al;

    // Test swapElements
    al = buildRandomList(10,100);
    System.out.println("Random ArrayList: " + al + "\n");

    // Test swapElements
    int sum = sumOfList(al);
    System.out.println("The array sum is: " + sum + "\n");

    // Test swapElements
    swapElements(al,2,6);
    System.out.println("Array after swappping elements at 2 and 6:\n" 
                       + al + "\n");

    // Test removeValue
    al.add(5);
    al.add(10);
    al.add(5);
    al.add(13);
    al.set(2,5);
    al.set(3,5);
    System.out.println("ArrayList:" + al);
    removeValue(al,5);
    System.out.println("\nArrayList after remove all values equal to 5:\n" + al); 

    // Test sumLists: It also works when the arrays have different size
    ArrayList<Integer> al1 = new ArrayList<Integer>();
    ArrayList<Integer> al2 = new ArrayList<Integer>();

    al1.add(1);
    al1.add(2);
    al1.add(3);
    al1.add(4);
    al1.add(5);
  
    al2.add(10);
    al2.add(20);
    al2.add(30);
    al2.add(40);
    al2.add(50);

    System.out.println("\nTesting sumLists:");
    System.out.println("List 1:" + al1);
    System.out.println("List 2:" + al2);
    System.out.println("Sum of list 1 and list 2: " + sumLists(al1, al2));

    // Test zipLists: It also works when the arrays have different size
    System.out.println("\nZip list 1 and list 2: " + zipLists(al1, al2));
  }

}