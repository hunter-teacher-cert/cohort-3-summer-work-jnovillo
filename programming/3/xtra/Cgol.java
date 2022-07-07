import java.io.*;
import java.util.*;

/**
 * Conway's Game of Life Team AreWeSentientYet?
 * Jessica Novillo Argudo
 * collaborators: David Moste, Taylor Grant-Knight
 */

/**
   The Rules of Life:

   Survivals:
   * A living cell with 2 or 3 living neighbours will survive for the next generation.

   Deaths:
   * Each cell with >3 neighbours will die from overpopulation.
   * Every cell with <2 neighbours will die from isolation.

   Births:
   * Each dead cell adjacent to exactly 3 living neighbours is a birth cell. It will come alive next generation.

   NOTA BENE:  All births and deaths occur simultaneously. Together, they constitute a single generation.
*/

public class Cgol
{

  //create, initialize, and return  empty board (all cells dead)
  public static char[][] createNewBoard( int rows, int cols )
  {
    char[][] board = new char[rows][cols];  
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        board[i][j] = '-';
      }
    }
    return board;
  }


  //print the board to the terminal
  public static void printBoard( char[][] board )
  {
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[i].length; j++) {
        System.out.print(board[i][j] + " ");
      }
      System.out.println();
    }
  }


  //set cell (r,c) to val
  public static void setCell( char[][] board, int r, int c, char val )
  {
    board[r][c] = val;
  }


  //return number of living neigbours of board[r][c]
  public static int countNeighbours( char[][] board, int r, int c )
  { 
    int livingNeighbors = 0;
    for(int i = r-1; i <= r+1; i++){ 
      if(i >= 0 && i < board.length){ 
        for(int j = c-1; j <= c+1; j++){ 
          if(j >= 0 && j < board[r].length){
            if (i==r && j==c){
              continue;
            }
            else if (board[i][j] == 'X'){
              livingNeighbors++;
            }
          }
        } 
      }
    }
    return livingNeighbors;
  }


  /**
     precond: given a board and a cell
     postcond: return next generation cell state based on CGOL rules
     (alive 'X', dead ' ')
  */
  public static char getNextGenCell(char[][] board,int r, int c) {
    char nextGenCell = '-'; 
    int neighbours = countNeighbours(board, r, c);
    if(board[r][c] == 'X'){
      if(neighbours < 2 || neighbours > 3){
        nextGenCell = '-'; 
      } else {
        nextGenCell = 'X'; 
      }
    } else if (neighbours == 3) {
        nextGenCell = 'X';
    }
    return nextGenCell;
  }


  //generate and return a new board representing next generation
  public static char[][] generateNextBoard( char[][] board ){
    char[][] newBoard = new char[board.length][board[0].length];
    for (int i=0; i<board.length; i++){
      for (int j=0; j<board.length; j++){
        newBoard[i][j] = getNextGenCell(board, i, j);
      }
    }
    return newBoard;
  }

  
  // David Moste's idea: Randomically sets cells alive.
  public static void setAliveCells(char[][] board) {
    for (int i = 0; i < board.length; i++){
      for (int j = 0; j < board[i].length; j++){
        if (0.5 > Math.random()){
          setCell(board, i, j, 'X');
        } else {
          setCell(board, i, j, '-');
        }
      }
    }    
  }


  // pause for n milliseconds
  public static void delay(int n)
  {
    try {
      Thread.sleep(n);
    }
    catch(InterruptedException e) {}
  }

  // Set alive celss for a block
  public static void block(char[][] board, int x, int y, char value){
    setCell(board, x, y, value);
    setCell(board, x, x+1, value);
    setCell(board, x+1, y, value);
    setCell(board, x+1, y+1, value);
  }

  // Set alive cells for a light-weight spaceship
  public static void lwss(char[][] board, int x, int y, char value){
    setCell(board, x, y, value);
    setCell(board, x, y+1, value);
    setCell(board, x+1, y-1, value);
    setCell(board, x+1, y, value);
    setCell(board, x+1, y+1, value);
    setCell(board, x+1, y+2, value);
    setCell(board, x+2, y-1, value);
    setCell(board, x+2, y, value);
    setCell(board, x+2, y+2, value);
    setCell(board, x+2, y+3, value);
    setCell(board, x+3, y+1, value);
    setCell(board, x+3, y+2, value);
  }
  
  public static void main( String[] args )
  {
    char[][] board;
    board = createNewBoard(26, 26);

    // block sets a block of alive cells
    // block(board, 1, 1, 'X');
    // block(board, 1, 10, 'X');
    // block(board, 10, 1, 'X');
    // block(board, 10, 10, 'X');

    // lwss sets alive cells for a light-weight spaceship
    lwss(board, 1, 3, 'X');

    // print generation boards with animation
    System.out.print("\033[2J");
    for (int i=0; i <= 100; i++){
      System.out.print("[0;0H\n");
      System.out.println("Gen " + i + ":");
      printBoard(board);
      board = generateNextBoard(board);
      delay(100);
    }
    
  }//end main()

}//end class