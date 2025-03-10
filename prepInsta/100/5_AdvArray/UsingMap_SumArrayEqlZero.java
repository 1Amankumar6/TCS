import java.util.HashMap;

public class UsingMap_SumArrayEqlZero {
  public static void main(String[] args) {
    int arr[] = { -3, 3, 1, 6 };
    if (subArrayExists(arr))
      System.out.println("Found a subarray with 0 sum");
    else
      System.out.println("No Such Sub Array Exists!");
  }

  public static boolean subArrayExists(int arr[]) {
    // Create a HashMap to store the cumulative sum
    HashMap<Integer, Integer> map = new HashMap<>();
    int sum = 0;

    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];

      // If sum is 0 or the sum has been seen before, we have found a subarray with zero sum
      if (sum == 0 || map.containsKey(sum)) {
        return true;
      }

      // Store the cumulative sum in the map
      map.put(sum, 1);
    }

    return false; // No subarray with zero sum found
  }
}
