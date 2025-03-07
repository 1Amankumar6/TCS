public class replaceSubstring {
  public static void main(String[] args) {
    String orgString = "Hello, World!";
    String subStringToReplace = "World";
    String replacement = "Java";

    String modiString = replaceSubstring(orgString, subStringToReplace, replacement);
    System.out.println("Original String: " + orgString);
    System.out.println("Modified String: " + modiString);
  }

  public static String replaceSubstring(String original, String toReplace, String replacement){
    if (!original.contains(toReplace)) {
      return original;  
    }
    
    String modified = original.replace(toReplace, replacement);
    return modified;
  }
}
