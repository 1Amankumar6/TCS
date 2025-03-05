// Program 2:
// Given three arrays sorted in non-decreasing order, print all common elements in these arrays.
// Take input from STDIN.
// Examples:
// Input:
// ar1[] = {1, 5, 10, 20, 40, 80}
// ar2[] = {6, 7, 20, 80, 100}
// ar3[] = {3, 4, 15, 20, 30, 70, 80, 120}
// Output: 20, 80

import java.util.ArrayList;

public class Q2 {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    int ar1[] = { 1, 5, 10, 20, 40, 80 };
    int ar2[] = { 6, 7, 20, 80, 100 };
    int ar3[] = { 3, 4, 15, 20, 30, 70, 80, 120 };
    // Initialize pointers for the three arrays
    int i = 0, j = 0, k = 0;
    // Traverse through the three arrays
    while (i < ar1.length && j < ar2.length && k < ar3.length) {
      // If all elements are the same, add to the result list
      if (ar1[i] == ar2[j] && ar2[j] == ar3[k]) {
        list.add(ar1[i]);
        i++;
        j++;
        k++;
      }
      // If ar1[i] is smaller, increment i
      else if (ar1[i] < ar2[j]) {
        i++;
      }
      // If ar2[j] is smaller, increment j
      else if (ar2[j] < ar3[k]) {
        j++;
      }
      // If ar3[k] is smaller, increment k
      else {
        k++;
      }
    }

    // Print the result
    System.out.println(list);
  }
}
