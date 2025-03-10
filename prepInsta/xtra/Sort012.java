public class Sort012 {
  public static void main(String[] args) {
    int arr[] = { 1, 0, 2, 0, 1, 0, 2 };
    sort(arr);

    for (int i : arr) {
      System.out.print(i + " ");
    }
  }

  static void sort(int[] arr) {
    int low = 0, mid = 0, high = arr.length - 1;
    while (mid <= high) {
      if (arr[mid] == 0) {
        swap(arr, low, mid);
        low++;
        mid++;
      } else if (arr[mid] == 1) {
        mid++;
      } else {
        swap(arr, mid, high);
        high--;
      }
    }
  }

  static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
