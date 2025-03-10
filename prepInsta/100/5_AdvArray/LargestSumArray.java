public class LargestSumArray {
  public static void main(String[] args) {
    int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
    int res = Integer.MIN_VALUE;
    int n = arr.length, sum = 0;
    for (int i = 0; i < n; i++) {
      sum += arr[i];
      if (sum < 0) {
        sum = 0;
      }
      res = Math.max(res, sum);
    }
    System.out.println(res);
  }
}

// int res = arr[0];  // Initialize the result with the first element
// int n = arr.length, sum = 0;

// for (int i = 0; i < n; i++) {
//   sum += arr[i];  // Add the current element to sum
