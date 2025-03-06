import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindRepeating {
    public static void main(String[] args) {
        int arr[] = new int[] { 10, 30, 40, 20, 10, 20, 50, 10 };
        int n = arr.length;
        System.out.println(Arrays.toString(repeatingElement(arr, n)));
    }

    private static int[] repeatingElement(int[] arr, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Count the occurrences of each element in the array
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        
        // Collect elements that are repeated
        ArrayList<Integer> ans = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                ans.add(entry.getKey());
            }
        }
        
        // Convert the ArrayList to an array
        int[] res = ans.stream().mapToInt(i -> i).toArray();
        return res;
    }
}
