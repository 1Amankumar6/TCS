public class GCD {
  private static int isGcd(int n, int m) {
    while (n != 0 && m != 0) {
      if (n > m) {
        n = n % m;
      } else {
        m = m % n;
      }
    }
    return (n == 0) ? m : n;
  }

  public static void main(String[] args) {
    int n = 33;
    int m = 234;
    System.out.println(isGcd(n, m)); // Output should be 3
  }
}
