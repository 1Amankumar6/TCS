import java.util.*;
import java.util.HashSet;

public class Remove_Duplicates {
    public static void main(String[] args) {
        int arr[] = {10, 20, 20, 30, 40, 40, 40, 50, 50};
        int n = arr.length;

        // Create a HashSet to store unique elements
        Set<Integer> set = new HashSet<>();

        // Add elements to the HashSet (duplicates will be automatically removed)
        for (int i : arr) {
            set.add(i);
        }

        // Print the unique elements
        System.out.println(set);
    }
}
