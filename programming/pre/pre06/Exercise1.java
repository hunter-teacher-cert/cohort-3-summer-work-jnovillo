public class Exercise1{
  
  public static void main(String[] args) {
      loop(10);
  }
  
  public static void loop(int n) {
      int i = n;
      while (i > 1) {
          System.out.println(i + "and" + n);
          if (i % 2 == 0) {
              i = i / 2;
          } else {
              i = i + 1;
          }
          System.out.println(i);
      }
  }

}