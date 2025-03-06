public class Imp_pascalTraingleRow {
  public static void main(String[] args) {
    int n = 5;
    for (int i = 0; i <= n; i++) {
      int bc = binomialCofficient(n, i);
      System.out.print(bc + " ");
    }
  }

  private static int binomialCofficient(int n, int k) {
    int res = 1;
    for (int i = 0; i < k; i++) {
      res *= (n - i);
      res /= (i + 1);
    }
    return res;
  }
}
