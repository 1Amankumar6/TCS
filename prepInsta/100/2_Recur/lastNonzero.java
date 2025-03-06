public class lastNonzero {
  // Driver method
  public static void main(String[] args) {
    int num = 5 ; 
    int fact = fact(num);
    while (fact%10 == 0) {
      fact/= 10;
    }
    System.out.println(fact%10);
  }

  static int fact(int n) {
    if (n == 0 || n == 1)
      return 1;
    return n * fact(n - 1);
  }
}
