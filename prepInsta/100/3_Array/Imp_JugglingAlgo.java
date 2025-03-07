public class Imp_JugglingAlgo {
  public static int hcf(int a, int c) {
    if (c == 0)
      return a;
    else
      return hcf(c, a % c);
  }

  public static void leftRotate(int arr[], int d, int n) {
    int i, l, m, temp;
    for (i = 0; i < hcf(d, n); i++) {
      temp = arr[i];
      l = i;
      while (true) {
        m = l + d;
        if (m >= n)
          m = m - n;
        if (m == i)
          break;
        arr[l] = arr[m];
        l = m;
      }
      arr[l] = temp;
    }
  }

  public static void main(String[] args) {
    int arr[] = { 10, 20, 30, 40, 50, 60, 70 }; // Fixed the missing comma
    int no_of_rotations = 3; // Corrected variable name
    int n = arr.length;

    // Display array elements before rotating
    System.out.println("Array Elements before rotating:");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println(); // New line for better readability

    // Perform left rotation
    leftRotate(arr, no_of_rotations, n);

    // Display array elements after rotating
    System.out.println("Array Elements after rotating:");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
