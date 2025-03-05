package TCS.Recursion;
import java.util.*;

public class NQueen {
  public static List<List<String>> nQueens(int n) {
    List<List<String>> result = new ArrayList<>();
    char[][] board = new char[n][n];
    // Fill the board with '.'
    for (char[] row : board) {
      Arrays.fill(row, '.');
    }
    backTrack(result, board, 0);
    return result;
  }

  private static void backTrack(List<List<String>> result, char[][] board, int row) {
    // If we've placed queens in all rows, add the board to result
    if (row == board.length) {
      result.add(construct(board));
      return;
    }
    // Try placing queens in all columns of the current row
    for (int col = 0; col < board.length; col++) {
      // If it's valid to place the queen
      if (isValid(board, col, row)) {
        board[row][col] = 'Q';  // Place the queen
        backTrack(result, board, row + 1);  // Move to the next row
        board[row][col] = '.';  // Remove the queen and try next column
      }
    }
  }

  private static List<String> construct(char[][] board) {
    List<String> result = new ArrayList<>();
    for (char[] row : board) {
      result.add(new String(row));
    }
    return result;
  }

  public static boolean isValid(char[][] board, int col, int row) {
    // Check the column
    for (int i = 0; i < row; i++) {
      if (board[i][col] == 'Q') {
        return false;  // There is already a queen in the same column
      }
    }

    // Check the first diagonal (top-left to bottom-right)
    for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
      if (board[i][j] == 'Q') {
        return false;  // There is already a queen in the top-left diagonal
      }
    }

    // Check the second diagonal (top-right to bottom-left)
    for (int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
      if (board[i][j] == 'Q') {
        return false;  // There is already a queen in the top-right diagonal
      }
    }

    // If no conflict, return true
    return true;
  }

  public static void main(String[] args) {
    int n = 4;  // Example with 4 queens
    List<List<String>> solutions = nQueens(n);
    for (List<String> solution : solutions) {
      for (String row : solution) {
        System.out.println(row);
      }
      System.out.println();
    }
  }
}
