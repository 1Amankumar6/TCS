public class MoveNegToSide {
  public static void main(String[] args) throws Exception {
    int[] arr = new int[] { -1, 2, 2, -2, 4 };
    shift(arr);
  }

  private static void shift(int[] arr) {
    int left = 0;
    for (int right = 0; right < arr.length; right++) {
      if (arr[right] < 0) {
        if (right != left) {
          swap(arr, right, left);
        }
        left++;
      }
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
