import java.util.Scanner;

public class Prime {
  public static boolean isPrime(int n) {
    if (n < 2)
      return false;
    if (n == 2)
      return true;
    if (n % 2 == 0)
      return false;
    for (int i = 3; i * i <= n; i += 2) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int min = s.nextInt(), max = s.nextInt();
    boolean first = true;
    for (int i = min; i < max; i++) {
      if (isPrime(i)) {
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
