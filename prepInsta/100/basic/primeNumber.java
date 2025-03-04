import java.util.ArrayList;
import java.util.Scanner;

public class primeNumber {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    IteratePrime(n);
  }

  public static void IteratePrime(int n) {
    ArrayList<Integer> prime = new ArrayList<>();
    for (int i = 2; i < n; i++) {
      if (isPrime(i))
        prime.add(i);
    }
    System.out.println(prime);
  }

  public static boolean isPrime(int n) {
    if (n == 2)
      return true;
    if (n % 2 == 0)
      return false;
    for (int i = 3; i < n / 2; i += 2) {
      if (n % i == 0)
        return false;
    }
    return true;
  }
}
