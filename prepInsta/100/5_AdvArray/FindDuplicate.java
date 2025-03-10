import java.util.HashMap;
import java.util.Map;

public class FindDuplicate {
  public static void main(String args[]) {
    int[] arr = { 1, 2, 3, 4, 5, 6, 3 };
    int n = arr.length;
    System.out.print(finddup(arr, n));
  }
  static int finddup(int[] arr, int n) {
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i : arr){
      map.put(i, map.getOrDefault(i, 0)+1);
    }
    for(Map.Entry<Integer,Integer> entry : map.entrySet()){
      if(entry.getValue() > 1){
        return entry.getKey();
      }
    }
    return -1;
  }
}
