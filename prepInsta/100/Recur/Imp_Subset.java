import java.util.*;

public class Imp_Subset {
  public static void main(String[] args) {
    List<List<Integer>> subset = new ArrayList<>();
    ArrayList<Integer> input = new ArrayList<>();
    input.add(1);
    input.add(2);
    input.add(3);

    // Call the correct method to find subsets
    findSubset(subset, input, new ArrayList<>(), 0);

    // Sort subsets lexicographically
    Collections.sort(subset, (o1, o2) -> {
      int n = Math.min(o1.size(), o2.size());
      for (int i = 0; i < n; i++) {
        if (o1.get(i) == o2.get(i)) {
          continue;
        } else {
          return o1.get(i) - o2.get(i);
        }
      }
      return Integer.compare(o1.size(), o2.size());  // To ensure proper comparison when sizes are different
    });

    // Print the subsets
    for (List<Integer> s : subset) {
      for (Integer num : s) {
        System.out.print(num + " ");
      }
      System.out.println();
    }
  }

  static void findSubset(List<List<Integer>> subset, ArrayList<Integer> nums, ArrayList<Integer> output, int index) {
    if (index == nums.size()) {
      subset.add(new ArrayList<>(output));
      return;
    }

    // Exclude the current element
    findSubset(subset, nums, new ArrayList<>(output), index + 1);

    // Include the current element
    output.add(nums.get(index));
    findSubset(subset, nums, new ArrayList<>(output), index + 1);
  }
}
