import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class replaceElementRank {
  public static void main(String[] args) {
    int[] arr = { 1, 5, 8, 15, 8, 25, 9 };
    // Output: 1 2 3 5 3 6 4
    rankBy(arr);
  }

  private static void rankBy(int[] arr) {
    SortedSet<Integer> set = new TreeSet<>();
    for (int i : arr) {
      set.add(i);
    }
    int rank = 1;
    HashMap<Integer, Integer> hm = new HashMap<>();
    for (int i : set) {
      hm.put(i, rank++);
    }
    int[] rankArr = new int[arr.length];
    for(int i=0 ; i<arr.length ; i++){
      if(hm.containsKey(arr[i])) {
        rankArr[i] = hm.get(arr[i]);
      }
    }
    System.out.println(Arrays.toString(rankArr));
  }
}
