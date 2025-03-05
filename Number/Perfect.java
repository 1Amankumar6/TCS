import java.util.Scanner;

public class Perfect {
  public static boolean isPerfect(int n) {
    int sum = 0;
    for (int i = 1; i <= n / 2; i++) {
      if (n % 2 == 0) {
        sum += i;
        // sum += (n / i);
      }
    }
    System.out.println(sum);
    return n == sum;
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    System.out.println(isPerfect(n));
  }
}
