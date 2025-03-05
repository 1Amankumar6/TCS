import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class majorityElementIII {
  public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    String input = scanner.nextLine();
    Scanner ss = new Scanner(input);

    while (ss.hasNextInt()) {
      arr.add(ss.nextInt());
    }

    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < arr.size(); i++) {
      map.put(arr.get(i), map.getOrDefault(arr.get(i), 0)+1);
    }
    int n = arr.size();
    int threshold = n/3 ;
    for(Map.Entry<Integer,Integer> entry : map.entrySet()){
      int freq = entry.getValue();
      if(freq > threshold){
        System.out.println(entry.getKey());
      }
    }
  }
}
