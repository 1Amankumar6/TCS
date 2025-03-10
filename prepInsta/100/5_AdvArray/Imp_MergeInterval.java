import java.util.*;

public class Imp_MergeInterval {
  public static void main(String[] args) {
    int[][] intervals = { { 1, 3 }, { 2, 2 }, { 2, 4 }, { 5, 7 }, { 6, 8 } };

    int[][] mergedIntervals = mergeInter(intervals);

    System.out.println("Merged Intervals:");
    for (int[] interval : mergedIntervals) {
      System.out.println(Arrays.toString(interval));
    }
  }

  static int[][] mergeInter(int[][] arr) {
    if (arr == null || arr.length == 0) {
      return new int[0][0];
    }
    Arrays.sort(arr, (a, b) -> (a[0] - b[0]));
    List<int[]> merged = new ArrayList<>();
    for (int[] interval : arr) {
      if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
        merged.add(interval);
      } else {
        int[] lastMerged = merged.get(merged.size() - 1);
        lastMerged[1] = Math.max(lastMerged[1], interval[1]);
      }
    }
    // System.out.println(Arrays.deepToString(arr));
    return merged.toArray(new int[merged.size()][]);
  }
}
