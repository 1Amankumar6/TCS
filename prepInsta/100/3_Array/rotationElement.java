public class rotationElement {
  public static void main(String[] args) {
      // Given array arr[]
      int arr[] = { 10, 20, 30, 40, 50, 60, 70 };
      int n = arr.length;
      int k = 3; // Number of positions to rotate

      // Make sure k is within the range of the array length
      k = k % n;

      // Temporary array to store the rotated elements
      int[] temp = new int[n];

      // Step 1: Copy elements from k to the end of the array
      for (int i = k; i < n; i++) {
          temp[i - k] = arr[i];
      }

      // Step 2: Copy the first k elements of arr to the end of the temporary array
      for (int i = 0; i < k; i++) {
          temp[n - k + i] = arr[i];
      }

      // // Step 3: Copy the rotated elements from temp[] back to arr[]
      for (int i = 0; i < n; i++) {
          arr[i] = temp[i];
      }

      // Print the rotated array
      System.out.println("Array after rotation: ");
      for (int i = 0; i < n; i++) {
          System.out.print(arr[i] + " ");
      }
  }
}
