import java.util.Arrays;
import java.util.Scanner;

public class Three {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String input = s.nextLine();
    
    // Print the length of the input string
    System.out.println(input.length());
    
    // Split the input string by spaces
    String[] parts = input.split(" ");
    
    // Convert the string parts into integers and store them in an array
    int[] arr = new int[parts.length];
    for (int i = 0; i < parts.length; i++) {
      arr[i] = Integer.parseInt(parts[i]);
    }
    
    // Print the array as a string
    System.out.println(Arrays.toString(arr));
  }
}
