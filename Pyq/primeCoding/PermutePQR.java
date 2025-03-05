import java.util.ArrayList;
import java.util.Scanner;

public class PermutePQR {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int p = s.nextInt();
    int q = s.nextInt();
    int r = s.nextInt();

    StringBuilder sb = new StringBuilder();
    if (p > 0) {
      while (p > 0) {
        sb.append('p');
        p--;
      }
    }
    if (q > 0) {
      while (q > 0) {
        sb.append('q');
        q--;
      }
    }
    if (r > 0) {
      while (r > 0) {
        sb.append('r');
        r--;
      }
    }
    System.out.println(sb);
    ArrayList<String> ans = new ArrayList<>();
    // Start the permutation process
    isPermute(0, ans, sb.toString());
    // System.out.println(ans.size());
    System.out.println(ans); // Print all permutations

  }

  private static void isPermute(int index, ArrayList<String> ans, String s) {
    if (index == s.length()) {
      ans.add(s);
      return;
    }
    for (int i = index; i < s.length(); i++) {
      swap(s, index, i);
      isPermute(index + 1, ans, s);
      swap(s, index, i);
    }
  }

  private static String swap(String s, int i, int j) {
    // Convert String to StringBuilder to modify characters
    StringBuilder sb = new StringBuilder(s);

    // Swap characters at positions i and j
    char temp = sb.charAt(i);
    sb.setCharAt(i, sb.charAt(j));
    sb.setCharAt(j, temp);

    // Return the modified string
    return sb.toString();
  }
}
