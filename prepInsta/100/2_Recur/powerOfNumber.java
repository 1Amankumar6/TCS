public class powerOfNumber {
  public static void main(String[] args) {
    int n = 5, p = 13;
    System.out.println(power(n, p));
  }

  static int power(int n, int p) {
    if (p == 0)
      return 1;
    if (p == 1)
      return n;
    if (p % 2 == 0) {
      int halfPower = power(n, p / 2);
      return halfPower * halfPower;
    }
    return n * power(n, p - 1);
  }
}
