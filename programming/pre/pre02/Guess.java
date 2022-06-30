import java.util.*;
import java.lang.Math;

public class Guess {
    public static void main(String[] args) {
        // Chapter 3 - Exercise 4
        Random random = new Random();
        int number = random.nextInt(100) + 1;

        System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?");
        String line;
        Scanner in = new Scanner(System.in);
        System.out.print("Type a number: ");
        line = in.nextLine();
        int diff = Math.abs(number - Integer.parseInt(line));
          
        System.out.println("Your guess is: " + line);
        System.out.println("The number I was thinking of is: " + number);
        System.out.println("You were off by: " + diff);
    }
}