// Write a C program that, given an array A[] of n numbers and another number K, find the pair of all elements in A whose sum is exactly K. Take input from STDIN.
// Example:
// Input:
// A[]={1, 4, 15, 6, 10, 2}, K=16
// Output:
// (1, 15)
// (6, 10)

import java.util.ArrayList;
import java.util.HashMap;

class Pair {
    int first, second;

    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}

public class Q3 {
    public static void main(String[] args) {
        int arr[] = {1, 4, 15, 6, 10, 2};
        int k = 16;
        ArrayList<Pair> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : arr) {
            int complement = k - i;
            if (map.containsKey(complement)) {
                // Add pair (complement, current number) to the list
                list.add(new Pair(complement, i));
            }
            // Add current number to the map
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        // Print the pairs
        for (Pair pair : list) {
            System.out.println(pair);
        }
    }
}
