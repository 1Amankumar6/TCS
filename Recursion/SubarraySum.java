package TCS.Recursion;
import java.util.*;

class SubarraySum {
    public static void main(String[] args) {
        int[] arr = {3, 4, -7, 1, 3, 3, 1, -4};
        int targetSum = 7;
        findSubarraysWithTargetSum(arr, targetSum);
    }

    // Function to find all subarrays with a sum equal to the target
    static void findSubarraysWithTargetSum(int[] arr, int targetSum) {
        // This map stores the cumulative sum at each index
        HashMap<Integer, Integer> cumulativeSumMap = new HashMap<>();
        
        int currentSum = 0;  // Variable to track the cumulative sum
        for (int i = 0; i < arr.length; i++) {
            // Update current cumulative sum
            currentSum += arr[i];

            // Check if the current sum itself is equal to targetSum
            if (currentSum == targetSum) {
                printSubarray(arr, 0, i);  // Subarray from index 0 to i
            }

            // Check if there is a previous cumulative sum that matches the required sum
            if (cumulativeSumMap.containsKey(currentSum - targetSum)) {
                // Get the index where the previous sum occurred
                int startIndex = cumulativeSumMap.get(currentSum - targetSum) + 1;
                printSubarray(arr, startIndex, i);  // Subarray from startIndex to i
            }

            // Store the current cumulative sum with its index
            cumulativeSumMap.put(currentSum, i);
        }
    }

    // Helper method to print a subarray
    static void printSubarray(int[] arr, int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
