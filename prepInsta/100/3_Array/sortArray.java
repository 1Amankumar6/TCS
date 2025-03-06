import java.util.Arrays;

public class sortArray {
  public static void main(String[] args) {
    int arr[] = { 12, 56, 45, 34, 30 };
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length; j++) {
        if (arr[i] < arr[j]) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    System.out.println(Arrays.toString(arr));
  }
}
