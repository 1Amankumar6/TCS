
// Program 1:
// Given a 2D array, print it in spiral form. Take input from STDIN.
// Examples:
// Input:
// 1 2 3 4
// 5 6 7 8
// 9 10 11 12
// 13 14 15 16
// Output:
// 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
import java.util.ArrayList;
import java.util.Scanner;

public class Q1 {
  public static void main(String[] args) {
    // Take input for the 2D matrix size
    Scanner s = new Scanner(System.in);
    int n = s.nextInt(); // Matrix size (n x n)

    // Initialize the matrix and take input for matrix elements
    int[][] matrix = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        matrix[i][j] = s.nextInt();
      }
    }

    // Call the function to print the matrix in spiral form
    printSpiral(matrix, n);
  }

  // Function to print the matrix in spiral form
  static void printSpiral(int[][] matrix, int n) {
    ArrayList<Integer> list = new ArrayList<>();
    int top = 0, left = 0, bottom = n - 1, right = n - 1;

    // While there are still elements to process
    while (top <= bottom && left <= right) {
      // Traverse from left to right along the top row
      for (int i = left; i <= right; i++) {
        list.add(matrix[top][i]);
      }
      top++;

      // Traverse from top to bottom along the right column
      for (int i = top; i <= bottom; i++) {
        list.add(matrix[i][right]);
      }
      right--;

      // Traverse from right to left along the bottom row
      if (top <= bottom) {
        for (int i = right; i >= left; i--) {
          list.add(matrix[bottom][i]);
        }
        bottom--;
      }

      // Traverse from bottom to top along the left column
      if (left <= right) {
        for (int i = bottom; i >= top; i--) {
          list.add(matrix[i][left]);
        }
        left++;
      }
    }

    // Print the result in spiral order
    for (int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i) + " ");
    }
  }
}