package TCS.Recursion;
import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        recurPermute(0, nums, ans); // Start recursion from index 0
        return ans;
    }

    private void recurPermute(int index, int[] nums, List<List<Integer>> ans) {
        if(index == nums.length){
            List<Integer> ds = new ArrayList<>();
            for(int i : nums){
                ds.add(i);
            }
            ans.add(new ArrayList<>(ds));
            return ;
        }

        for (int i = index; i < nums.length; i++) {
            swap(i, index, nums);
            recurPermute(index+1, nums, ans);
            swap(i, index, nums);
        }
    }

    private void swap(int i, int j, int[] nums) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }

    public static void main(String[] args) {
        Permutation solution = new Permutation();
        int[] nums = { 1, 2, 3 }; // Example input
        List<List<Integer>> result = solution.permute(nums);

        // Print all permutations
        for (List<Integer> perm : result) {
            System.out.println(perm);
        }
    }
}
