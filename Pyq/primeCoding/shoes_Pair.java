import java.util.*;

public class shoes_Pair {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    Map<String, Integer> store = new HashMap<>();
    for (int i = 0; i < n; i++) {
      String shoe = s.next();
      store.put(shoe, store.getOrDefault(shoe, 0) + 1);
    }
    int pairs = 0;
    for (Map.Entry<String, Integer> entry : store.entrySet()) {
      int val = entry.getValue();
      String curShoe = entry.getKey();
      String opposite;
      if (curShoe.charAt(curShoe.length() - 1) == 'L') {
        opposite = curShoe.substring(0, curShoe.length() - 1) + 'R';
      } else {
        opposite = curShoe.substring(0, curShoe.length() - 1) + 'L';
      }
      if (store.containsKey(opposite)) {
        pairs += Math.min(val, store.get(opposite));
      }
    }
    System.out.println(pairs / 2);
  }
}
