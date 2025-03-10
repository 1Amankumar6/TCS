public class Imp_FindCommonElement {

  static void findCommon(int[] arr1, int[] arr2, int[] arr3) {
    int i = 0, j = 0, k = 0;
    while (i < arr1.length && j < arr2.length && k < arr3.length) {
      // If the current elements are the same in all three arrays
      if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
        System.out.print(arr1[i] + " "); // Print common element
        i++;
        j++;
        k++;
      }
      // If arr1[i] is less than arr2[j], move to the next element in arr1
      else if (arr1[i] < arr2[j]) {
        i++;
      }
      // If arr2[j] is less than arr3[k], move to the next element in arr2
      else if (arr2[j] < arr3[k]) {
        j++;
      }
      // If arr3[k] is less than arr1[i], move to the next element in arr3
      else {
        k++;
      }
    }
  }

  public static void main(String args[]) {
    int ar1[] = { 1, 5, 10, 20, 40, 80 };
    int ar2[] = { 6, 7, 20, 80, 100 };
    int ar3[] = { 3, 4, 15, 20, 30, 70, 80, 120 };

    System.out.print("Common elements are: ");
    findCommon(ar1, ar2, ar3);
  }
}
