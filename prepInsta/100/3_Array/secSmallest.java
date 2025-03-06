public class secSmallest {
  public static void main(String[] args) {
    int arr[] = { 12, 56, 45, 34, 30 };
    int small = Integer.MAX_VALUE, secondSmall = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (small > arr[i]) {
        secondSmall = small;
        small = arr[i];
      }
      if (secondSmall > arr[i] && small != arr[i]) {
        secondSmall = arr[i];
      }
    }
    System.out.println(small);
    System.out.println(secondSmall);
  }
}
