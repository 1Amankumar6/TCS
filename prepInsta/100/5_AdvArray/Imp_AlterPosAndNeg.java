import java.util.Arrays;

public class Imp_AlterPosAndNeg {

  // Function to rearrange negative and positive elements alternately
  static void rearrange(int a[], int n) {
    int[] neg = new int[n];
    int[] pos = new int[n];
    int negCount = 0, posCount = 0;

    // Split the array into negative and positive arrays
    for (int i = 0; i < n; i++) {
      if (a[i] < 0) {
        neg[negCount++] = a[i];
      } else {
        pos[posCount++] = a[i];
      }
    }

    // Merge back into the original array by alternating
    int i = 0, j = 0, k = 0;
    while (i < negCount && j < posCount) {
      a[k++] = neg[i++]; // Place a negative element
      a[k++] = pos[j++]; // Place a positive element
    }

    // If there are remaining negative elements, place them
    while (i < negCount) {
      a[k++] = neg[i++];
    }

    // If there are remaining positive elements, place them
    while (j < posCount) {
      a[k++] = pos[j++];
    }
  }

  // Function to print the array
  static void print(int a[], int n) {
    for (int i = 0; i < n; i++) {
      System.out.print(a[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int[] arr = { -1, -4, 6, 3, -2, 9, 10 };
    int n = arr.length;

    System.out.println("Given array is: ");
    print(arr, n);

    // Rearrange the array
    rearrange(arr, n);

    System.out.println("Rearranged array is: ");
    print(arr, n);
  }
}
