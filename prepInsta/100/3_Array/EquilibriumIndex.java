public class EquilibriumIndex {
  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5, 1, 3, 2, 4 };
    int arr_size = arr.length;
    System.out.print("Equilibrium Index : ");
    System.out.println(equilibrium_index(arr, arr_size));
  }

  private static int equilibrium_index(int[] arr, int arr_size) {
    int total_Sum = 0;
    for (int i : arr)
      total_Sum += i;
    int leftSum = 0, rightSum = total_Sum;
    for (int i = 0; i < arr.length; i++) {
      rightSum -= arr[i];
      if (leftSum == rightSum) {
        return i;
      }
      leftSum += arr[i];
    }
    return -1;
  }
}
