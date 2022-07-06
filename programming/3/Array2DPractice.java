import java.io.*;
import java.util.*;

/**
 * Array2DPractice by Team LucidThinkeren
 * Jessica Novillo Argudo
 * collaborators: Saranii Muller, Jerusha Theobald, Patti Elfers
 */

/**
   INSTRUCTIONS:

   Place this file in a folder named programming/3/.

   This file contains the following completed method. Use it as a model
   to help you with the other methods:

   - buildBoard

   This file also contains stubs (empty methods) for the following
   methods (split into 3 levels):

   Basic level (complete all):
   - printBoard *
   - copyBoard *

   Intermediate level (complete Basic methods plus this method):
   - explodeSquare *

   Advanced level (complete Basic + Intermediate + these two methods):
   - explodeAllChar *
   - downString

   The routines with the * will be particularly helpful for the
   Conway's Game of Life project that you'll work on after this one.
*/


/**
   creates and returns a 2D array of size rowsxcols chars. All elements
   in the 2D array will be set to the char value.

   Ex: buildBoard(3,4,'x') will return this 2D array:

   xxxx
   xxxx
   xxxx
   xxxx

   Use this completed method as an example to help you with some of the
   other methods.
*/

public class Array2DPractice
{
  public static char[][] buildBoard( int rows, int cols, char value )
  {
    char[][] board = new char[rows][cols];
    //Creating variable board  of 2 D rows is how many rows and columns is how many columns
    //following line creates a loop to iterate through the rows i = 0 so we start at 0, then I will go up one by one until it is less the number of rows
    for (int i = 0; i < rows; i++) {
      //following loop iterates through columns doing the same
      for (int j = 0; j < cols; j++) {
    //next line assign the value that comes as the parameter to the position as defined in the main
        board[i][j]=value;
      }
    }
    //next line returns what is built on prior line
    return board;
  }

  /**
     pretty prints a 2D array of characters

     This should print the array as a grid
  */
  //parameter of 2D array called board
  public static void printBoard( char[][] board )
  {
    //iterate through rows - i is index for row like above in board creation
    for (int i = 0; i < board.length; i++) {
      //iterate through columns - j is index for column board [i] means column at row position. board[i].length is the "width" of the row
      for (int j = 0; j < board[i].length; j++) {
        //first time run prints 0 0 , then position 0 1 etc until entire board is print -contents not indices " " means space after each char
        System.out.print(board[i][j] + " ");
      }
      //When the loop for the column ends, then it prints a new line for the next row of contents
      System.out.println();
    }
  }

  /**
     Parameters:
     board - a 2D array of char
     row - the row you want to set
     value - the value to set all the elements in row

     Returns:
     Nothing

     Change the 2D array board so that all the elements in the
     specified row are set to value.

     Ex: Given array:
     xxxx
     xxxx
     xxxx
     xxxx

     setRow(board,2,'@') will change board to
     xxxx
     xxxx
     @@@@
     xxxx
  */
  public static void setRow( char[][] board, int row, char value )
  {
    //iterate rows
    for (int i = 0; i < board.length; i++) {
//want to change the values parameter when i becoimes it
      if (i == row){
        //when codition met then all columns for that row wiull be that parameter
        for (int j = 0; j < board[i].length; j++) {
         //asign to that row and columns that predefined value from main method called value as pre defined in publuc static void set row line
          board[i][j] = value;
        }
      }
    }
    printBoard(board);
  }


  /**
     creates and returns a new 2D array of char the same size as
     original and copies all the elements
  */
  public static char[][] copyBoard( char[][] original )
  {
    char[][] board = new char[original.length][original[0].length];
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[i].length; j++) {
        board[i][j] = original[i][j];
      }
    }
    return board;
  }


  /**
     Parameters:
     board - a 2D array of char
     row,col - ints specifying a location in board

     Returns:
     nothing

     A location in a 2D array can be though of as having 6
     neighbors.  In the below 2D array, the neighbors of the element
     marked Q are the numbered elements.

     oooooo
     o123oo
     o4Q5oo
     o678oo
     oooooo

     This method should change all the neighbor cells (elements) to an X
     but not change the element at row,col

     Ex:
     Given the 2D array
     QQQQQ
     QQQQQ
     QQQQQ
     QQQQQ

     explodeSquare(board,1,1) will change the array to
     XXXQQ
     XQXQQ
     XXXQQ
     QQQQQ

     Note: Make sure to correctly handle the cases when you try
     to explode an element on the edges.
  */
  public static void explodeSquare( char[][] board, int row, int col )
  {
    //first loop: start in row -1 (inital value - the start) keep going to i is less tha or equal to row +1 - this is the stop point , then increment value until stop point is reached 
    for(int i = row-1; i <= row+1; i++){ 
      //copntinue the code if i is greater than or equal to zero AND if i less than the length of the board. Prevents from going out of bounds
      if(i >= 0 && i < board.length){ 
        // this loop is the same as for the rows but for the columns
        for(int j = col-1; j <= col+1; j++){ 
          //out of bounds loop for the columns
          if(j >= 0 && j < board[row].length){
            //following states that if i and j are as indicated in the main call the char in i and j will be same unless meeting conditions above. If not given chars from main then will change chars to x from original
            if (i == row && j == col)
              continue;
            else{
              board[i][j] = 'X';
            }
          }
        } 
      }
    } 
  }

  /**
     This method will search through the 2D array board and it will
     explode each square that contains the char c (using the above
     definition of exploding).


     Example:
     Given the array
     qqzqq
     qqqqq
     qqqqq
     qqqqq
     qzqqq
     qqqqq
     qqqqz
     ...
     explodeAllchar(board,'z')
     will change board to
     qXzXq
     qXXXq
     qqqqq
     XXXqq
     XzXqq
     XXXXX
     qqqXz


     explodeAllchar(board,'z') will change board to:
  */
  //                 name of method  characters in the positions on the board as defined by variable char c (c is whatever is named in this case z) so we are doing multiple boxes instead of just one  
  public static void explodeAllChar(char[][] board, char c)
  {
   //first loop: starts at 0 0 go until end of board llength increment up by one
    for(int i = 0; i < board.length; i++){ 
        // this loop is the same as for the rows but for the columns
      for(int j = 0; j < board[i].length; j++){ 
        if (board[i][j] == c){
          explodeSquare(board, i, j);
        }
      } 
      } 
  }
  


  /**
     Parameters:
     board - a 2D array of char
     row,col - ints specifying a location in board
     word - a String that you want to insert into the board.

     This will insert the parameter word into board in the downward
     direction. See examples below

     Example:

     Given this array
     xxxxxx
     xxxxxx
     xxxxxx
     xxxxxx
     xxxxxx
     xxxxxx
     xxxxxx

     downString(board,1,1,"Hello") will change board to:

     xxxxxx
     xHxxxx
     xExxxx
     xLxxxx
     xLxxxx
     xOxxxx
     xxxxxx

     Given the above array, downString(board,4,3,"World") will
     change board to:

     xxxxxx
     xHxxxx
     xExxxx
     xLxxxx
     xLxWxx
     xOxOxx
     xxxRxx

     Note that the method has to stop at the bottom of the array.
  */
  public static void downString( char[][] board, int row, int col, String word )
  {
    int pos;
    int wordLength = word.length();
    for(int i = 0; i < board.length; i++){
      if (i >= row && col < board[i].length && col >= 0){
        pos = i - row;
        if (pos < wordLength){
          board[i][col] = word.charAt(pos);
        }
      }
    }
  }


  public static void main( String[] args )
  {
    //following line creates board w/variable b of 5 rows, 10 columns and each array position contains the character z
    char[][] b = buildBoard(5,10,'z');
    
    //next line should print out the contents of array b
    System.out.println("*** 2D Array ***");
    printBoard(b);
    System.out.println();

    // Executing copyBoard
    char[][] bCopy = copyBoard(b);
    System.out.println("*** Result of copyBoard ***");
    printBoard(bCopy);
    System.out.println();

    // Executing setRow
    System.out.println("*** Set row board ***");
    setRow(b, 2, '@');
    System.out.println();

    // Executing explodeSquare
    System.out.println("*** Explode square ***");
    b = buildBoard(4,5,'Q');
    explodeSquare(b, 1, 1);
    printBoard(b);
    System.out.println();

    // Executing explodeAllChar
    System.out.println("*** Explode all ***");
    System.out.println("Initial array:");
    b = buildBoard(7, 5,'Q');
    b[1][1] = 'z';
    b[3][3] = 'z';
    printBoard(b);
    System.out.println("After exploding all characters 'z':");
    explodeAllChar(b, 'z');
    printBoard(b);
    System.out.println();

    // Executing downString
    System.out.println("*** Down String ***");
    b = buildBoard(7, 6, 'x');
    System.out.println("Initial array:");
    printBoard(b);
    downString(b, 1, 1, "HELLO");
    System.out.println("Print HELLO:");
    printBoard(b);
    downString(b, 4, 3, "WORLD");
    System.out.println("Print WORLD:");
    printBoard(b);

  }
}