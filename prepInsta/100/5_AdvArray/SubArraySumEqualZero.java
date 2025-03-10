import java.util.HashSet;
import java.util.Set;

public class SubArraySumEqualZero {
  public static void main(String[] args) {
    int arr[] = { -3, 3, 1, 6 };
    if (subArrayExists(arr))
      System.out.println(
          "Found a subarray with 0 sum");
    else
      System.out.println("No Such Sub Array Exists!");
  }

  public static boolean subArrayExists(int arr[]) {
    Set<Integer> set = new HashSet<>();
    int sum = 0;
    for(int i=0; i<arr.length; i++){
      sum += arr[i];
      if(arr[i] == 0 || sum == 0 || set.contains(sum)){
        return true;
      }
      set.add(sum);
    }
    return false;
  }
}
