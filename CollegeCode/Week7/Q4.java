// Write a program count the number of vowels from the string. Convert it from lower case to upper
// case and then reverse the string.

// Examples:
// Input:
// Information
// Output:
// 5
// INFORMATION
// NOITAMROFNI
// Test Cases:
// -----------
// 1. VALID INPUT:
// a) Only one argument will be given as input.
// 2. INVALID inputs:
// a) No argument
// b) Two or more than two arguments.
// c) Characters other than alphabet.
// 3. You should generate output as follows:
// a) Print to the STDOUT without any additional text.
// b) If error print 'ERROR' to the STDOUT without any additional text

import java.util.Scanner;

public class Q4 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String str = s.next();
    str = str.toLowerCase();
    int i=0, count = 0;
    StringBuilder sb = new StringBuilder();
    while (i < str.length()) {
      if (str.charAt(i)=='a' || str.charAt(i)=='e'|| str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
        count++ ;
      }
      i++ ;
    }
    System.out.println("Count: "+count);
  }
}
