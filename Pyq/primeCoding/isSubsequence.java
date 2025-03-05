// Input: s1 = “AXY”, s2 = “ADXCPY”
// Output: True 
// All characters of s1 are in s2 in the same order

// Input: s1 = “AXY”, s2 = “YADXCP”
// Output: False 
// All characters are present, but order is not same.

// Input: s1 = “gksrek”, s2 = “geeksforgeeks”
// Output: True

import java.util.Scanner;

public class isSubsequence {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s1 = sc.next();
    sc.nextLine();
    sc.close();
    String s2 = sc.next();
    if (isSubsequenceCheck(s1, s2))
      System.out.println("True");
    else
      System.out.println("False");
  }

  private static boolean isSubsequenceCheck(String s1, String s2) {
    int i = 0, j = 0;
      while (i < s1.length() && j < s2.length()) {
        if (s1.charAt(i) == s2.charAt(j)) {
          i++;
        }
        j++;
      }
    return i == s1.length();
  }
}
