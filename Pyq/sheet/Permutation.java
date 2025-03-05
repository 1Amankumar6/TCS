import java.util.Scanner;

public class Permutation {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int r = s.nextInt();
    int permute = factorial(n)/factorial(n-r);
    System.out.println( permute);
  }
  static int factorial(int n){
    int product = 1 ; 
    for(int i=1; i<=n ; i++){
      product *= i;
    }
    return product;
  }
}
