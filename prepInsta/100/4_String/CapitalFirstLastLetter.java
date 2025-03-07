import java.util.Scanner;

public class CapitalFirstLastLetter {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter String: ");
    String s = sc.nextLine();
    
    String newstr = "";
    String[] str = s.split("\\s+"); // Splitting by one or more spaces
    
    for (String string : str) {
      int length = string.length();
      
      if (length == 1) {
        // If the word has only one letter, capitalize it
        newstr += string.toUpperCase();
      } else {
        String firChar = string.substring(0, 1).toUpperCase();  // Capitalize the first character
        String restChar = string.substring(1, length - 1);      // Middle part of the word
        String lastChar = string.substring(length - 1).toUpperCase();  // Capitalize the last character
        
        newstr += firChar + restChar + lastChar + " ";  // Concatenate the modified word
      }
    }
    
    System.out.println("Modified String: " + newstr.trim());  // Remove the trailing space
  }
}
