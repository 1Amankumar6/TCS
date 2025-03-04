import java.util.*;
public class removeComma {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String input = s.nextLine();
    input = input.replaceAll("\\,+", " ");
    System.out.println(input);
  }  
}