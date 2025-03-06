import java.util.*;

public class subSet {
    public static void main(String[] args) {
        String str = "321";
        List<String> ans = new ArrayList<>();
        backtrack(str, 0, ans, new StringBuilder());
        Collections.reverse(ans);  // Correct way to reverse the list
        System.out.println(ans);
    }

    private static void backtrack(String str, int index, List<String> ans, StringBuilder ds) {
        // Base case: if we've considered all characters, add the current subset (ds)
        if (index == str.length()) {
            ans.add(ds.toString());
            return;
        }
        
        // Include the current character in the subset
        ds.append(str.charAt(index));
        // Recur to form the next subset
        backtrack(str, index + 1, ans, ds);
        
        // Exclude the current character from the subset
        ds.deleteCharAt(ds.length() - 1);
        // Recur again to form the next subset without including the current character
        backtrack(str, index + 1, ans, ds);
    }
}
