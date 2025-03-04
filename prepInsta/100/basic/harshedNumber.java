public class harshedNumber {
  // 323/(3+2+3) =
  public static void main(String[] args) {
    int n = 3242;
    if (n % sumDigit(n) == 0)
      System.out.println("It's a harshed Number");
    else
      System.out.println("It's a not harshed Number");
  }

  static int sumDigit(int n) {
    int sum = 0;
    while (n != 0) {
      sum += n % 10;
      n /= 10;
    }
    return sum;
  }
}
