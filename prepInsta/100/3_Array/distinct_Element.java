import java.util.HashSet;

public class distinct_Element {
  public static void main(String[] args) {
    int arr[] = new int[] { 10, 30, 40, 20, 10, 20, 50, 10 };
    int n = arr.length;
    System.out.println(countFreq(arr, n));
  }

  private static int countFreq(int[] arr, int n) {
    HashSet<Integer> set = new HashSet<>();
    for (int i : arr) {
      set.add(i);
    }
    return set.size();
  }
}
