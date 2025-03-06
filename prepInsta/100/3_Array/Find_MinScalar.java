import java.util.Arrays;

public class Find_MinScalar {
    public static void main(String[] args) {
        int[] arr1 = {10, 30, 40, 20};
        int[] arr2 = {2, 4, 5, 1};
        
        // Sort arr1 in ascending order
        Arrays.sort(arr1);

        // Sort arr2 in ascending order
        Arrays.sort(arr2);

        // Reverse arr2 to get it in descending order manually
        reverse(arr2);

        // Calculate the scalar product
        int product = 0;
        for (int i = 0; i < arr1.length; i++) {
            product += arr1[i] * arr2[i];
        }

        System.out.println("Minimum Scalar Product: " + product);
    }

    // Helper method to reverse an array
    private static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
