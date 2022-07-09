/**
 * Recursion Practice with Strings by Team SweatEquity
 * Jessica Novillo Argudo
 * collaborators: Saranii Muller, Joel Bianchi, Kirk Martin
 */

public class Fence
{

  /**
     String fenceR(int) -- recursive fence generator
     precond:  input is a positive integer
     postcond: returns fence with n posts

     eg
     fenceR(1) -> "|"
     fenceR(2) -> "|--|"
  */
  
  public static String fenceR( int n ){

    // BASE CASE: if n is 0, then return ""
    if (n==0){
      return ""; 
    }
    // BASE CASE: if n is 1, then return "|"
    else if (n==1){
      return "|";
    }
    // RECURSIVE CASE: Call fenceR with n-1 and add it to "|--"
    else{
      return "|--" + fenceR(n-1);
    }
    
  }

  
  public static void main( String[] args )
  {

    for( int i = 0; i < 10; i++ ) {
      System.out.println( i + "-post fences: " );
      System.out.println( fenceR(i) );
    }
    
  }
}