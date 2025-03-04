import java.util.*;

public class moveZero {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String input = s.nextLine();
    Scanner ss = new Scanner(input);
    ArrayList<Integer> list = new ArrayList<>();
    while (ss.hasNextInt()) {
      list.add(ss.nextInt());
    }
    int arr[] = list.stream().mapToInt(i -> i).toArray();
    moveZero(arr, arr.length);
    System.out.println(Arrays.toString(arr));
  }

  // 1,2,0,3,4,0,5
  // 1,2,3,4,5,0,0
  public static void moveZero(int[] arr, int n) {
    int left = 0; // this will point to the position where the non-zero element should go
    for (int right = 0; right < n; right++) {
      // When we find a non-zero element, we swap it with arr[left]
      if (arr[right] != 0) {
        swap(arr, left, right);
        left++; // move the left pointer
      }
    }
  }

  public static void moveZero1(int[] arr, int n){
    int zeroCount = 0;
    for(int val : arr){
      zeroCount++ ;
    }
    int index = 0 ;
    for (int i : arr) {
      if(i != 0){
        arr[index++] = i ;
      }
    }
  }


  public static void swap(int arr[], int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
