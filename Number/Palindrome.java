import java.util.Scanner;

public class Palindrome {
  public static boolean isPalindrome(int n) {
    int store = n, digit = 0;
    while (n > 0) {
      int back = n % 10;
      digit = digit * 10 + back;
      n = n / 10;
    }
    return digit == store;
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int min = s.nextInt(), max = s.nextInt();
    boolean first = true;
    for (int i = min; i < max; i++) {
      if (isPalindrome(i)) {
        if (first) {
          System.out.print(i); // Print without space for the first palindrome
          first = false; // After the first palindrome, set flag to false
        } else {
          System.out.print(" " + i); // Print with space for subsequent palindromes
        }
      }
    }
    s.close();
  }
}
