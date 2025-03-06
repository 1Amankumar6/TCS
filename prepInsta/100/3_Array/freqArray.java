import java.util.HashMap;
import java.util.Map;

public class freqArray {
  public static void main(String[] args) {
    int arr[] = { 12, 56, 45, 12, 56, 45, 34, 30 };
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
    }
    // for (int i : map.values()) {
    // if (i > 1) {
    // System.out.println(i);
    // }
    // }
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      if (entry.getValue() > 1) {
        System.out.println(entry.getKey());
      }
    }
  }
}
