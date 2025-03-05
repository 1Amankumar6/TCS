public class pascalTraingle {
  public static void main(String[] args) {
    int n = 5;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print(binomialCofficient(i, j) + " ");
      }
      System.out.println();
    }
  }

  static int binomialCofficient(int n, int k) {
    int res = 1;
    for (int i = 0; i < k; i++) {
      res *= (n - i);
      res /= (i + 1);
    }
    return res;
  }
}
