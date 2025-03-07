public class toggleCase {
  public static void main(String[] args) {
      String s = "PrePInsTa";
      StringBuilder s1 = new StringBuilder();
      
      // Iterate through each character in the string
      for (char ch : s.toCharArray()) {
          // Toggle case: if the character is uppercase, make it lowercase and vice versa
          if (Character.isUpperCase(ch)) {
              s1.append(Character.toLowerCase(ch));
          } else {
              s1.append(Character.toUpperCase(ch));
          }
      }
      
      // Output the result
      System.out.println(s1);
  }
}
