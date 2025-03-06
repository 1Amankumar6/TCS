import java.util.Arrays;

public class reverseArray {
  public static void main(String[] args) {
    int arr[] = { 12, 56, 45, 34, 30 };
    int n = arr.length;
    for(int i=0 ; i<n/2 ; i++){
        swap(arr, i, n-i-1);
    }
    System.out.println(Arrays.toString(arr));
  }
  static void swap(int arr[], int i, int j){
    int temp = arr[i] ;
    arr[i] = arr[j] ;
    arr[j] = temp ;
  }
}
