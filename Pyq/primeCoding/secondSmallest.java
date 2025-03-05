import java.util.*;

public class secondSmallest {
    public static void main(String[] args) {
        // Sample array (you can modify this array)
        int[] arr = {7, 2, 5, 10, 4, 8, 1};
        
        // Call method to find the second smallest element
        int secondSmallest = findSecondSmallest(arr);
        
        if (secondSmallest != Integer.MAX_VALUE) {
            System.out.println("The second smallest element is: " + secondSmallest);
        } else {
            System.out.println("No second smallest element found.");
        }

        // Call method to find the second largest element
        int secondLargest = findSecondLargest(arr); 
        if (secondLargest != Integer.MIN_VALUE) {
            System.out.println("The second largest element is: " + secondLargest);
        } else {
            System.out.println("No second largest element found.");
        }
    }
    
    public static int findSecondSmallest(int[] arr) {
        int n = arr.length, small = Integer.MAX_VALUE, secondSmall = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < small) {
                secondSmall = small;
                small = arr[i];
            } else if (arr[i] < secondSmall && small != arr[i]) {
                secondSmall = arr[i];
            }
        }
        return secondSmall;
    }
    
    public static int findSecondLargest(int[] arr) {
        int n = arr.length, large = Integer.MIN_VALUE, secondLarge = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > large) {
                secondLarge = large;
                large = arr[i];
            } else if (arr[i] > secondLarge && large != arr[i]) {
                secondLarge = arr[i];
            }
        }
        return secondLarge;
    }
}
