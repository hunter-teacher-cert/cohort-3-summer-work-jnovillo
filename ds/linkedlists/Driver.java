import java.io.*;
import java.util.*;

public class Driver{
  public static void main(String[] args) {
    
    LinkedList l = new LinkedList();

    // Testing for size zero
    System.out.println("\nThe size of the list is: " +  l.size() );

    // Adding to the list
    System.out.println("\nAdding 4 names to the LinkedList:");
    l.add("Jessica");
    l.add("Amanda");
    l.add("Sophie");
    l.add("Anais");
    System.out.println(l);

    System.out.println("\nThe Node at index 1 is: " +  l.get(1) );
    System.out.println("The Node at index 10 is: " + l.get(10) );

    System.out.println("\nThe size of the list is: " +  l.size() );

    System.out.println("\nSophie is at index: " +  l.indexOf("Sophie") );

    l.add(2, "Simon");
    System.out.println("\nAdding Simon at index 2:");
    System.out.println(l);

    l.add(0, "Maria");
    System.out.println("\nAdding Maria at index 0:");
    System.out.println(l);

    // Testing LinkedList to Array
    System.out.println("\nLinkedList to Array : ");
    String[] array = l.toArray();
     
    for (int i=0; i<array.length; i++){
      System.out.print(array[i] + " ");
    }

    // Testing remove
    System.out.println("\n\nOriginal LinkedList");
    System.out.println(l);

    // Test remove invalid index
    l.remove(-1);
    System.out.println("\nLinkedList after trying to remove node at index -1: ");
    System.out.println(l);

    l.remove(100);
    System.out.println("\nLinkedList after trying to remove node at index 100: ");
    System.out.println(l);

    // Test remove index 0
    l.remove(0);
    System.out.println("\nLinkedList after removing node at index 0: ");
    System.out.println(l);

    // Test remove index > 0
    l.remove(2);
    System.out.println("\nLinkedList after removing node at index 2: ");
    System.out.println(l);
    
  }
}