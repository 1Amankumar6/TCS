import java.util.*;

public class factorPrime {
  public static void main(String[] args) {
    int n = 143;
    for (int i = 1; i < Math.sqrt(n); i++) {
      if (n % i == 0) {
        System.out.print(i +" "+ n/i+" ");
      }
    }
  }
}
