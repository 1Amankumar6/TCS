// Find the GCD and LCM of Two number. Take input from command line argument.
// Example:
// Input:
// 30
// 40
// Output:
// 10
// 120
// Test Cases:
// -----------
// 1. VALID INPUT:
// a) Only two arguments will be given as input.
// 2. INVALID inputs:
// a) No argument

// b) One argument
// c) More than two arguments.
// d) Characters other than digit
// 3. You should generate output as follows:
// a) Print to the STDOUT without any additional text.
// b) If error print 'ERROR' to the STDOUT without any additional text.

import java.util.Scanner;

public class Q5 {
  public static int LCM(int a, int b){
    int twoProduct = a*b ;
    return twoProduct/GCD(a,b);
  }
  public static int GCD(int a, int b){
    if(b==0){
      return a ;
    }
    return GCD(b, a%b);
  }
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    int b = s.nextInt();
    int gcd = GCD(a,b);
    int lcm = LCM(a, b);
    System.out.println("GCD: "+gcd+", LCM: "+lcm);
  }
}
