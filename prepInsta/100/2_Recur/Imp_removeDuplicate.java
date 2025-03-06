public class Imp_removeDuplicate {
  public static String removeDuplicates(String s, char ch) {
      // Base condition
      if (s.length() <= 1) {
          return s;
      }

      int i = 0;
      while (i < s.length()) {
          // Check for adjacent duplicates
          if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
              int j = i;
              while (j + 1 < s.length() && s.charAt(j) == s.charAt(j + 1)) {
                  j++;
              }

              // Determine the last character
              char lastChar = (i > 0) ? s.charAt(i - 1) : ch;

              // Recursive call to remove duplicates from the remaining part
              String remStr = removeDuplicates(s.substring(j + 1), lastChar);

              // Build the final string
              s = s.substring(0, i);
              int k = s.length(), l = 0;

              // Removing matching characters from the end of s and the beginning of remStr
              while (remStr.length() > 0 && s.length() > 0 && remStr.charAt(0) == s.charAt(s.length() - 1)) {
                  while (remStr.length() > 0 && remStr.charAt(0) != ch && remStr.charAt(0) == s.charAt(s.length() - 1)) {
                      remStr = remStr.substring(1);
                  }
                  s = s.substring(0, s.length() - 1);
              }
              s = s + remStr;
              i = j;
          } else {
              i++;
          }
      }
      return s;
  }

  public static void main(String[] args) {
      String str1 = "abbaaacdffde";
      System.out.println(removeDuplicates(str1, ' '));
  }
}
