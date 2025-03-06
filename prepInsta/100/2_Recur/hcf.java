public class hcf {
  public static void main(String[] args) {
    int a = 132, b = 42;
    System.out.println(gcd(a, b));
  }

  private static int gcd(int a, int b) {
      if(b == 0) return a ;
      return gcd(b, a%b);
  }
}
