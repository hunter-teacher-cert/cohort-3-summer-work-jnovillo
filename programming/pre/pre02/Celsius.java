import java.util.Scanner;

public class Celsius {
    public static void main(String[] args) {
        // Chapter 3 - Exercise 2
        Double c;
        Scanner in = new Scanner(System.in);

        System.out.print("Insert temperature in celsius: ");
        c = in.nextDouble();
        in.nextLine();
          
        double f = (c * 9 / 5) + 32;
          
        System.out.println(String.format("%.1f", c) + " C = " 
                           + String.format("%.1f", f) + " F");
    }
}