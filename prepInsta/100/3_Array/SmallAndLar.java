public class SmallAndLar {
  public static void main(String[] args) {
    int arr[] = { 12, 56, 45, 34, 30 };
    int lar = largest(arr, arr.length);
    int small = smallest(arr, arr.length);
    System.out.println("Largest: " + lar + ", Smallest: " + small);
}

  private static int smallest(int[] arr, int length) {
    if (length == 1) {
      return arr[0];
    }
    return Math.min(arr[length - 1], smallest(arr, length - 1));
  }

  private static int largest(int[] arr, int length) {
    if (length == 1) {
      return arr[0];
    }
    return Math.max(arr[length - 1], largest(arr, length - 1));
  }
}