public class SymmetricElement {
  public static void main(String[] args) {
      int[][] arr = { {10, 20}, {30, 40}, {50, 60}, {20, 10}, {40, 30} };

      // Loop through each pair
      for (int i = 0; i < arr.length; i++) {
          int first = arr[i][0];
          int second = arr[i][1];

          // Compare with all subsequent elements
          for (int j = i + 1; j < arr.length; j++) {
              // Check if the pair (first, second) has a symmetric counterpart (second, first)
              if (first == arr[j][1] && second == arr[j][0]) {
                  System.out.println("Symmetric pair found: (" + first + ", " + second + ")");
              }
          }
      }
  }
}
