import java.util.Scanner;

class hcf {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int a = s.nextInt(), b = s.nextInt();
    System.out.println(gcd(a, b));
  }

  static int gcd(int a, int b) {
    if (b == 0)
      return a;
    return gcd(b, a % b);
  }
}