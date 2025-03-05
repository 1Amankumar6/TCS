public class Armstrong {
  public static int isCounting(int n) {
    int count = 0;
    while (n > 0) {
      count++;
      n = n / 10;
    }
    return count;
  }

  private static int isArmstrong(int n, int count) {
    int arm = 0;
    while (n > 0) {
      int digit = n % 10;
      arm += (int) Math.pow(digit, count);
      n = n / 10;
    }
    return arm;
  }

  public static void main(String[] args) {
    int n = 153;
    System.out.println(isCounting(n));
    System.out.println(isArmstrong(n, isCounting(n)));
    System.out.println(n == isArmstrong(n, isCounting(n)));
  }
}
