import java.util.ArrayList;

public class primeCount_100 {
  public static void main(String[] args) {
    int n = 100;
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      if (isPrime(i)) {
        list.add(i);
      }
    }
    System.out.println(list);
  }

  private static boolean isPrime(int n) {
    if (n <= 1) {
      return false;
    }
    if (n == 2) {
      return true;
    }
    if (n % 2 == 0) {
      return false;
    }
    for (int i = 3; i < Math.sqrt(n); i += 2) {
      if (n % i == 0)
        return false;
    }
    return true;
  }
}
