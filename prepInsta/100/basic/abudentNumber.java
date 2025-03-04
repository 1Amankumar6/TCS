// Number = 18
// Output : Yes, It's an Abundant Number
// Explanation : The Factors for the number 18 are, 1, 2, 3, 6 and 9. We don't want to include the number itself.
// Now the sum of the factors except the number itself is :
// 1 + 2 + 3 + 6 + 9 = 21
public class abudentNumber {
  public static void main(String[] args) {
    int n = 18;
    int sum = factorNumber(n);
    System.out.println("\n" + sum);
  }

  static int factorNumber(int n) {
    int sum = 0;
    for (int i = 1; i <= n / 2; i++) {
      if (n % i == 0) {
        sum += i;
      }
    }
    return sum;
  }

}
