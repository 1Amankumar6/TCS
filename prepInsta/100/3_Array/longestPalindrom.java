public class longestPalindrom {
  public static void main(String[] args) {
    int[] A = { 121, 2322, 54545, 999990 };
    int n = A.length;

    // print required answer
    System.out.println(largestPalindrome(A, n));
  }

  private static int largestPalindrome(int[] arr, int n) {
    int res = -1;
    for (int i = 0; i < n; i++) {
      if (arr[i] > res && isPalindrome(arr[i]))
        res = arr[i];
    }
    return res;
  }

  private static boolean isPalindrome1(int n) {
    String str = String.valueOf(n);
    int start = 0, end = str.length() - 1;
    while (start < end) {
      if (str.charAt(start++) != str.charAt(end--)) {
        return false;
      }
    }
    return true;
  }

  private static boolean isPalindrome(int n) {
    int original = n;
    int reversed = 0;

    // Reverse the number and check if it equals the original number
    while (n > 0) {
      int digit = n % 10;
      reversed = reversed * 10 + digit;
      n /= 10;
    }
    return original == reversed;
  }
}
