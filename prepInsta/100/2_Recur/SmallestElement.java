public class SmallestElement {
  public static void main(String[] args) {
    int[] arr = new int[] { 13, 89, 7, 43, 127, 90 };
    int largest = recursiveSmallest(arr, arr.length);
    System.out.println("The largest element is: " + largest);
  }

  private static int recursiveSmallest(int[] arr, int length) {
    if (length == 1)
      return arr[0];
    return Math.min(arr[length - 1], recursiveSmallest(arr, length - 1));
  }
}
