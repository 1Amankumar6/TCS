import java.util.Arrays;
import java.util.Scanner;

public class Arrange012 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    // Sample input: {1, 0, 0, 2, 1}
    int[] arr = new int[]{1, 0, 0, 2, 1};
    arrange0123(arr);
    System.out.println(Arrays.toString(arr));  // Output: [0, 0, 1, 1, 2]
  } 

  static void arrange0123(int arr[]) {
    int i = 0, j = 0, k = arr.length - 1;
    while (i <= k) {
      if (arr[i] == 0) {
        swap(arr, i, j);  // Swap 0 to the front
        i++;
        j++;
      } else if (arr[i] == 1) {
        i++;  // Move to the next element
      } else {
        swap(arr, i, k);  // Swap 2 to the back
        k--;
      }
    }
  }

  // Swap method to interchange values at indices i and j
  static void swap(int[] arr, int i, int j) {
    int temp = arr[i];  // Store arr[i] in temp
    arr[i] = arr[j];     // Assign arr[j] to arr[i]
    arr[j] = temp;       // Assign temp to arr[j]
  }
}
