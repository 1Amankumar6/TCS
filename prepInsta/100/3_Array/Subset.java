import java.util.HashSet;

public class Subset {
  public static void main(String args[]) {
    int arr1[] = { 11, 10, 13, 21, 30, 70 };
    int arr2[] = { 11, 30, 70, 10 };

    int m = arr1.length;
    int n = arr2.length;

    if (isSubset(arr1, arr2, m, n))
      System.out.print("arr2[] is subset of arr1[] ");
    else
      System.out.print("arr2[] is not subset of arr1[] ");

  }

  private static boolean isSubset(int[] arr1, int[] arr2, int m, int n) {
    HashSet<Integer> set = new HashSet<>();
    for (int num : arr1) {
      set.add(num);
    }
    for (int num : arr2) {
      if (!set.contains(num)) {
        return false;
      }
    }
    return true;
  }
}
