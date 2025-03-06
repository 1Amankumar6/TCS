public class ArrayMadeEqual {
  // Start iterating over the array.
  // Run a loop till arr[i]%2=0, and inside that loop divide the arr[i] by 2.
  // Run a loop till arr[i]%3=0, and inside that loop divide the arr[i] by 3.
  // Check if arr[i] != arr[0], then return 0.
  // Otherwise, return 1.
  public static void main(String[] args) {
    int arr[] = { 50, 100, 75 };
    int m = arr.length;

    if (make_equal(arr, m))
      System.out.print("Yes");
    else
      System.out.print("No");
  }

  static boolean make_equal(int[] arr, int n) {
    for (int i = 0; i < n; i++) {
      while (arr[i] % 2 == 0)
        arr[i] /= 2;
      while (arr[i] % 3 == 0)
        arr[i] /= 3;
    }
    // Remaining numbers
    for (int i = 1; i < n; i++) {
      if (arr[i] != arr[0]) {
        return false;
      }
    }
    return true;
  }
}
