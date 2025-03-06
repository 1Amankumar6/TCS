public class Imp_sumSubset {
  public static void main(String[] args) {
    int[] arr = { 5, 4, 3 };
    int n = arr.length;

    subsetSums(arr, 0, n - 1, 0);
  }

  private static void subsetSums(int[] arr, int index, int len, int sum) {
    if (index > len) {
      System.out.print(sum + " ");
      return;
    }
    subsetSums(arr, index + 1, len, sum + arr[index]);
    subsetSums(arr, index + 1, len, sum);
  }
}
