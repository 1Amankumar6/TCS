import java.util.ArrayList;
import java.util.Scanner;

public class countPrime {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int count = s.nextInt(); // We want to find the first 5 prime numbers
    printFirstNPrimes(count);
  }

  public static void printFirstNPrimes(int count) {
    ArrayList<Integer> primes = new ArrayList<>();
    int num = 2; // Start checking from the first prime number

    while (primes.size() < count) {
      if (isPrime(num)) {
        primes.add(num);
      }
      num++;
    }
    System.out.println(primes); // Print the list of first 5 primes
  }

  public static boolean isPrime(int n) {
    if (n <= 1) {
      return false; // 1 is not prime
    }
    if (n == 2) {
      return true; // 2 is a prime number
    }
    if (n % 2 == 0) {
      return false; // Even numbers greater than 2 are not prime
    }

    // Check divisibility from 3 up to √n and only for odd numbers
    for (int i = 3; i * i <= n; i += 2) {
      if (n % i == 0) {
        return false; // n is divisible by i, hence not prime
      }
    }
    return true; // If no divisors were found, n is prime
  }
}
