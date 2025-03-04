import java.util.Scanner;

public class lcm {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    int b = s.nextInt();
    int hcf = gcd(a, b);
    int lcm = (a * b) / hcf;
    System.out.println(lcm);
    s.close();
  }

  // static int gcd(int a, int b){
  // if(a == 0) return b;
  // return gcd(b, a%b);
  // }
  static int gcd(int a, int b) {
    if (a == 0)
      return b;
    return gcd(b, a % b);
  }
}
