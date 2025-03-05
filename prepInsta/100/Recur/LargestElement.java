import java.lang.Math;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = new int[] { 13, 89, 76, 43, 127, 90 };
        int largest = recursiveLargest(arr, arr.length);
        System.out.println("The largest element is: " + largest);
    }

    private static int recursiveLargest(int[] arr, int n) {
        // Base case: when there's only one element, it's the largest
        if (n == 1)
            return arr[0];

        return Math.max(arr[n - 1], recursiveLargest(arr, n - 1));
    }
}
