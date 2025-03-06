public class Imp_MaximumProduct {
  public static void main(String[] args) {
      int arr[] = {10, -20, -30, 0, 70, -80, -20};
      System.out.println("Maximum Subarray product is " + maxSubarrayProduct(arr));
  }

  private static int maxSubarrayProduct(int[] arr) {
      // Initialize max and min products for the first element
      int maxPro = arr[0], minPro = arr[0], result = arr[0];
      
      // Iterate through the array starting from the second element
      for (int i = 1; i < arr.length; i++) {
          // If current number is negative, swap maxPro and minPro
          if (arr[i] < 0) {
              int temp = maxPro;
              maxPro = minPro;
              minPro = temp;
          }
          
          // Calculate maxPro and minPro for the current element
          maxPro = Math.max(arr[i], maxPro * arr[i]);
          minPro = Math.min(arr[i], minPro * arr[i]);
          
          // Update the result to keep track of the maximum product
          result = Math.max(result, maxPro);
      }
      
      return result;
  }
}
