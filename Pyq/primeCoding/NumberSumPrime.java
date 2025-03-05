import java.util.Scanner;

public class NumberSumPrime {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int m = s.nextInt();
    for (int i = n; i < m; i++) {
      if (isPrimeI(i) && calculateSum(i)) {
        System.out.print(i + "  ");
      }
    }
  }

  private static boolean calculateSum(int n) {
    int sum = 0;
    while (n > 0) {
      int rem = n % 10;
      sum += rem;
      n /= 10;
    }
    return isPrimeI(sum);
  }

  private static boolean isPrime(int num) {
    if (num <= 1)
      return false;
    if (num <= 3)
      return true;
    if (num % 2 == 0 || num % 3 == 0)
      return false;
    int i = 5;
    while (i * i <= num) {
      if (num % i == 0 || num % (i + 2) == 0) {
        return false;
      }
      i += 6;
    }
    return true;
  }

  private static boolean isPrimeI(int num) {
    if (num <= 1)
      return false; // Numbers less than or equal to 1 are not prime
    if (num == 2)
      return true; // 2 is prime
    if (num % 2 == 0)
      return false; // Even numbers greater than 2 are not prime

    // Check divisibility from 3 up to sqrt(num), only odd numbers
    for (int i = 3; i * i <= num; i += 2) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }

}
