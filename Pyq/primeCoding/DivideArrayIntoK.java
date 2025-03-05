// Input: nums = [3,2,1,2,3,4,3,4,5,9,10,11], k = 3
// Output: true
// Explanation: Array can be divided into [1,2,3] , [2,3,4] , [3,4,5] and [9,10,11].

import java.util.Arrays;
import java.util.HashMap;

public class DivideArrayIntoK {

  public static void main(String[] args) {
    int[] nums = { 3, 2, 1, 2, 3, 4, 3, 4, 5, 9, 10, 11 };
    int k = 3;
    System.out.println(DivideTheArraysInSet(nums, k));
  }

  private static boolean DivideTheArraysInSet(int[] nums, int k) {
    if (k == 1)
      return true;
    if (nums.length % k != 0)
      return false;
    Arrays.sort(nums);
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
    }
    for (int num : nums) {
      if (map.get(num) > 0) {
      for (int i = 0; i < k; i++) {
          int updateVal = num + i;
          if (!map.containsKey(updateVal) || map.get(updateVal) <= 0) {
            return false;
          }
          map.put(updateVal, map.get(updateVal) - 1);
        }
      }
    }
    return true;
  }
}