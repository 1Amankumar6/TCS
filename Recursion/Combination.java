package TCS.Recursion;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Combination {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        List<List<Integer>> ans = new ArrayList<>();
        helper(1, n, k, new ArrayList<>(), ans);
        System.out.println(ans);
        s.close();
    }

    private static void helper(int index, int n, int k, List<Integer> ds, List<List<Integer>> ans) {
        if (k == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i = index; i <= n-k+1; i++) {
            ds.add(i);
            helper(i + 1, n, k - 1, ds, ans);
            ds.remove(ds.size() - 1);
        }
    }
}
