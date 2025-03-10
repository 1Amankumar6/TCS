import java.util.*;

public class PairSum {
  public static void main(String[] args) {
    // Scanner s = new Scanner(System.in);
    int arr[] = new int[] { 1, 5, 7, -1, 5 };
    int sum = 6;
    System.out.println("Count of pairs is " + getPairsCount(arr, sum));
  }

  static int getPairsCount(int[] arr, int sum) {
    HashMap<Integer, Integer> map = new HashMap<>();
    int count = 0; // Initialize count to 0
    int n = arr.length;
    
    for (int i = 0; i < n; i++) {
      // Check if the complement (sum - arr[i]) exists in the map
      if (map.containsKey(sum - arr[i])) {
        count += map.get(sum - arr[i]); // Add the frequency of the complement
      }
      
      map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
    }
    
    return count;
  }
}
