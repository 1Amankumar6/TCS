import java.util.Arrays;

public class SemiSort {
  public static void main(String[] args) {
    int[] arr = { 3, 2, 4, 1, 10, 30, 40, 20 };
    int n = arr.length;
    printOrder(arr, n);
  }

  private static void printOrder(int[] arr, int n) {
    Arrays.sort(arr);
    int len = arr.length / 2;
    for (int i = len, j = n - 1; i < j; i++, j--) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    }
    System.out.println(Arrays.toString(arr));
  }
}
