import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Imp_sortingFrequency {
  public static void main(String[] args) {
    int[] arr = {30, 20, 30, 10, 20, 20};
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i=0 ; i<arr.length; i++){
      map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
    }
    List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
    list.sort((entry1, entry2)-> entry2.getValue() - entry1.getValue());

    for(Map.Entry<Integer,Integer> entry : list){
      System.out.print(entry.getKey()+": "+entry.getValue()+", ");
    }
  }
}
