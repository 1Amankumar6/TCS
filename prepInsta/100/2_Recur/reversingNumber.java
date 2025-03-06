public class reversingNumber {
  public static void Reverse(int num) {
    // base condition to end recursive calls
    if (num < 10) {
      System.out.println(num);
      return;
    } else {
      System.out.print(num % 10);
      Reverse(num / 10);
    }
  }

  // driver code
  public static void main(String args[]) {
    // number to be reversed
    int num = 1099;

    System.out.print("Reversed Number: ");
    Reverse(num);
  }
}
