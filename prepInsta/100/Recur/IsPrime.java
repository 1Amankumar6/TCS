public class IsPrime{
  public static void main(String[] args) {
      int n = 11;  // Example number to check
      if (isPrime(n, 2)) {
          System.out.println(n + " is prime.");
      } else {
          System.out.println(n + " is not prime.");
      }
  }

  static boolean isPrime(int n, int i) {
      if (n <= 1) return false;  
      if (n == 2) return true;
      if (n % i == 0) return false;
      if (i * i > n) return true; 
      return isPrime(n, i + 1);
  }
}
