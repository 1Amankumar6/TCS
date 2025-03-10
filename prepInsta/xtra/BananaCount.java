public class BananaCount {
  public static void main(String[] args) {
    int n = 10, k = 4, j = 3, m = 14, p = 9;
    int banana_eat = m / k;
    int rem_banana = m % k;

    int peanut_eat = n / k;
    int rem_peanut = n % k;

    int left = n - (banana_eat + peanut_eat);
    if (rem_banana != 0 || rem_peanut != 0)
      left--;

    System.out.println(left);
  }
}
