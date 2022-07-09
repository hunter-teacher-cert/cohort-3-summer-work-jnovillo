/**
 * class Driver
 * tester class for class Rational
 * Jessica Novillo Argudo
 * collaborators: Adam Prado, Qianhui Vanessa Zou, Maxwell Yearwood
 */

public class Driver
{
  public static void main( String[] args )
  {

      Rational r = new Rational( 3, 7 );
      Rational s = new Rational();
      Rational t = new Rational( 8, 5 );
      Rational u = new Rational( 1, 2 );
      Rational v = new Rational( 2, 3 );
      Rational w = new Rational( 8, 12 );
      Rational x = new Rational( 8, 12 );
      System.out.println("r: " + r );
      System.out.println("s: " +  s );
      System.out.println("t: " +  t );

      System.out.println( r + " as a floating pt approximation: "
      + r.floatValue() );
      System.out.println( s + " as a floating pt approximation: "
      + s.floatValue() );
      System.out.println( t + " as a floating pt approximation: "
      + t.floatValue() );

      System.out.print( r + " * " + t + " = ");  
      r.multiply(t);
      System.out.println(r);
      
      r = new Rational( 3, 7 );
      System.out.print( r + " / " + t + " = ");
      r.divide(t);
      System.out.println(r);
    
      // Testing when division by 0
      r = new Rational( 3, 7 );
      t = new Rational( 0, 7 );
      System.out.print( r + " / " + t + " = ");
      r.divide(t);
      System.out.println(r);

      // Reduce
      System.out.println("x starts as " + x);
      x.reduce();
      System.out.println("x reduced is: " +  x );

      x = new Rational( 42  , 36);
      System.out.println("x starts as " + x);
      x.reduce();
      System.out.println("x reduced is: " +  x );

      // Equals
      x = new Rational( 2, 4 );
      w = new Rational( 3, 6 );

      if (x.equals(w)) {
        System.out.println(x + " and " + w + " are equal");
      } else {
        System.out.println(x + " and " + w + " are not equal");
      }
      
  }

}//end class



  // public void reduce()

  // //calculates GCD/GCF of numerator and denominator
  // public int gcd()

  // //calculates GCD/GCF of two int inputs
  // public static int gcd( int n, int d )

  // public boolean equals( Rational other )

  // public int compareTo( Rational other )