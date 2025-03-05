package TCS.Recursion;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CombinationS {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int target = scanner.nextInt();
    int n = scanner.nextInt();

    int[] candidates = new int[n];
    for (int i = 0; i < n; i++) {
      candidates[i] = scanner.nextInt();
    }

    List<List<Integer>> result = combinationSum(candidates, target);

    System.out.println(result);

    scanner.close();
  }

  private static List<List<Integer>> combinationSum(int[] candidates, int target) {
    List<List<Integer>> result = new ArrayList<>();
    findCombinations(candidates, target, 0, new ArrayList<>(), result);
    return result;
  }

  private static void findCombinations(int[] candidates, int target, int index, List<Integer> ds,
      List<List<Integer>> ans) {
    if (target == 0) {
      ans.add(new ArrayList<>(ds));
      return;
    }
    if (target < 0)
      return;

    if (index < candidates.length) {
      ds.add(candidates[index]);
      findCombinations(candidates, target - candidates[index], 0, ds, ans);
      ds.remove(ds.size() - 1);
      findCombinations(candidates, target, index+1, ds, ans);
    }
    // 7 3 2 3 6
  }
}
