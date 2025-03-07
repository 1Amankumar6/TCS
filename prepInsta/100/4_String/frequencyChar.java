import java.util.Arrays;
import java.util.Scanner;

public class frequencyChar {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter String : ");
    String str = sc.nextLine();

    int[] freq = new int[26];
    str = str.toLowerCase();

    for(int i=0 ; i<str.length(); i++){
      char ch = str.charAt(i);
      if (ch >= 'a' && ch <= 'z') {
          freq[ch - 'a']++;  // Increment the frequency for the character
      }
    }

    System.out.println("Character frequencies: ");
    for(int i=0; i<26 ; i++){
      if(freq[i] > 0){
        char ch = (char)(i+'a');
        System.out.println(ch+": "+freq[i]);
      }
    }
    // System.out.println(Arrays.toString(freq));
  }
}
