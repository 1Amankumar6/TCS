import java.util.HashMap;

public class firstOddCount {
  public static void main(String[] args) {
    char[] ch = { 'r', 'g', 'b', 'b', 'b', 'g', 'y', 'y' };
    HashMap<Character, Integer> map = new HashMap<>();
    for (char c : ch) {
      map.put(c, map.getOrDefault(c, 0) + 1);
    }
    char res = '\0';
    for (int i = 0; i < ch.length; i++) {
      if (map.get(ch[i]) % 2 == 1) {
        res = ch[i];
        break;
      }
    }
    System.out.println(res);
  }
}
