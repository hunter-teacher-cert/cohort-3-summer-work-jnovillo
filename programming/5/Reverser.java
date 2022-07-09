/**
 * Recursive String Reverser by Team Palindromotosis
 * Jessica Novillo Argudo
 * collaborators: First Last, First Last
 */


public class Reverser
{
  /**
     String reverseF(String) -- recursive String reverser
     precond:  input String is non-empty
     postcond: returns input String with chars in reverse order
  */
  public static String reverseR( String s )
  {

    // BASE CASE: if the length of s is <= 0, then return ""
    if (s.length() <= 0){
      return "";
    }
    // RECURSIVE CASE: call reverseR with a substring of s (from first character to the penultimate) and concatenate it to the last character of s
    else{
      
      return s.charAt(s.length() - 1) +
        reverseR(s.substring(0, s.length()-1));
    }
    
  }


  public static void main( String[] args )
  {
    
    System.out.println( reverseR("odd") );
    System.out.println( reverseR("even") );
    System.out.println( reverseR("abcdefg") );
    System.out.println( reverseR("stressed") );
    System.out.println( reverseR("amanaplanacanalPanama") );
    
  }
}