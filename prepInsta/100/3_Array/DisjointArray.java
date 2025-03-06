import java.util.*;
import java.util.HashSet;

public class DisjointArray {
    public static void main(String[] args) {
        int arr1[] = {10, 51, 3, 43, 6};
        int arr2[] = {80, 71, 29, 3};

        if (Disjoint(arr1, arr2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    private static boolean Disjoint(int[] arr1, int[] arr2) {
      Set<Integer> set = new HashSet<>();
        
        // Add elements of arr1 into the set
        for (int num : arr1) {
            set.add(num);
        }

        // Check if any element of arr2 exists in the set
        for (int num : arr2) {
            if (set.contains(num)) {
                // If a common element is found, return false immediately
                return false;
            }
        }

        // No common elements found, so the arrays are disjoint
        return true;
    }
}
