import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class replaceElementByRank {
  public static void main(String[] args) {
    // Given array arr[]
    int[] arr = { 100, 2, 70, 12, 90 };//[5, 1, 3, 2, 4]

    // Function Call
    changeArr(arr);

    // Print the array elements
    System.out.println(Arrays.toString(arr));
  }

  public static int[] changeArr(int[] arr) {
    SortedSet<Integer> set = new TreeSet<>();
    for(int num : arr){
      set.add(num);
    }
    int rank = 1;
    for(Integer num : set){
      for(int i=0; i<arr.length ; i++){
        if(arr[i] == num){
          arr[i] = rank;
        }
      }
      rank++;
    }
    return arr;
  }
}
