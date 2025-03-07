public class isPalindrome {
  public static void main(String[] args) {
      String str = "level";
      int start = 0, end = str.length() - 1;

      while (start < end) {
          if (str.charAt(start++) != str.charAt(end--)) {
              System.out.println("False");
              return;
          }
      }
      System.out.println("True"); // If no mismatch is found, it's a palindrome
  }
}
