// O(n * m)
public class WildcardMatch {

  public static boolean solve(String a, String b) {
      int n = a.length();
      int m = b.length();
      
      // If both pattern and string are empty, it's a match
      if (n == 0 && m == 0) {
          return true;
      }
      
      // If pattern is empty and string is not, it's not a match
      if (n == 0) {
          return false;
      }
      
      // If string is empty and pattern starts with '*', it can match empty string
      if (m == 0 && a.charAt(0) == '*') {
          return solve(a.substring(1), b);
      }
      
      // If current character in pattern is '?' or matches current character in string
      if (n > 0 && (a.charAt(0) == '?' || a.charAt(0) == b.charAt(0))) {
          return solve(a.substring(1), b.substring(1));
      }
      
      // If current character in pattern is '*' (match any sequence of characters)
      if (a.charAt(0) == '*') {
          return solve(a.substring(1), b) || solve(a, b.substring(1));
      }
      
      // If none of the conditions match, return false
      return false;
  }

  public static void main(String[] args) {
      String str1 = "Prepins*a";
      String str2 = "Prepinsta";
      
      System.out.println("First string with wild characters: " + str1);
      System.out.println("Second string without wild characters: " + str2);
      
      System.out.println(solve(str1, str2));  // Expected output: true
  }
}
