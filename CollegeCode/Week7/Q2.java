// Display Pascal Triangle pattern. Pascal’s triangle is a triangular array of the binomial coefficients.
// Write a function that takes an integer value n as input from command line argument and prints first n
// lines of the Pascal’s triangle. Optimize the time and space complexity.
// Test Cases:
// -----------
// 1. VALID INPUT:
// a) Only one argument will be given as input.
// 2. INVALID inputs:
// a) Two or more than two arguments.
// b) Characters other than digits.
// 3. You should generate output as follows:
// a) Display pattern to the STDOUT without any additional text.
// b) If error print 'ERROR' to the STDOUT without any additional text

import java.util.Scanner;

public class Q2 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    PascalsTriangle(n);
  }

  private static void PascalsTriangle(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print(binomialCofficient(i, j) + " ");
      }
      System.out.println();
    }
  }

  private static int binomialCofficient(int n, int k) {
    int res = 1;
    for (int i = 0; i < k; ++i) {
      res *= (n - i);
      res /= (i + 1);
    }
    return res;
  }
}
