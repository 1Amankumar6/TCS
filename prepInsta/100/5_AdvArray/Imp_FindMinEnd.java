public class Imp_FindMinEnd {
  // Input: arr[] = { 2, 1, 3, 2, 3, 4, 5, 1, 2, 8 }
  // Output: Minimum number of jumps to reach end is : 4

  public static void main(String[] args) {
    int arr[] = { 2, 1, 3, 2, 3, 4, 5, 1, 2, 8 };
    System.out.println("Minimum number of jumps to reach end is : " +
        minJumps(arr, arr.length));
  }

  static int minJumps(int[] arr, int n) {
    // If the array is empty or the first element is 0, return Integer.MAX_VALUE
    if (n == 0 || arr[0] == 0)
      return Integer.MAX_VALUE;

    int jumps[] = new int[n];
    jumps[0] = 0; // The first position requires 0 jumps.

    for (int i = 1; i < n; i++) {
      jumps[i] = Integer.MAX_VALUE;
    }

    for (int i = 1; i < n; i++) {
      for (int j = 0; j < i; j++) {
        if (i <= j + arr[j] && jumps[j] != Integer.MAX_VALUE) {
          jumps[i] = Math.min(jumps[i], jumps[j] + 1);
          break;
        }
      }
    }

    return jumps[n - 1];
  }
}

/*
 * static int minJumps(int[] arr) {
        int i = 0, jump = 0, n = arr.length;
        while (i < n - 1) {
            int val = arr[i];
            if (val == 0) {
                return -1;
            }
            int max = 0, maxInd = -1;
            if ((i + val) >= (n - 1)) {
                return jump + 1;
            }
            for (int j = i + 1; j < n && j <= (i + val); j++) {
                if ((j + arr[j]) > max) {
                    max = j + arr[j];
                    maxInd = j;
                }
            }
            i = maxInd;
            jump++;
        }
        return jump;
    }
 */
