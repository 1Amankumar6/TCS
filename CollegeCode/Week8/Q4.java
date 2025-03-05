// Program 4:
// Given a string, find the second most frequent character in it. Take input from STDIN.
// Examples:
// Input: str = "aabababa";
// Output: Second most frequent character is 'b'

import java.util.HashMap;
import java.util.Scanner;

public class Q4 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String str = s.nextLine();
    HashMap<Character, Integer> map = new HashMap<>();
    for (char ch : str.toCharArray()) {
      map.put(ch, map.getOrDefault(ch, 0) + 1);
    }
    int max = 0, secMax = 0;
    char maxChar = ' ', secMaxChar = ' ';
    for (char ch : map.keySet()) {
      int freq = map.get(ch);
      if (freq > max) {
        secMax = max;
        secMaxChar = maxChar;
        max = freq ;
        maxChar = ch ;
      }
      if (freq > secMax && freq < max) {
        secMax = freq;
        secMaxChar = ch ;
      }
    }
    System.out.println(secMax);
  }
}


//  // Step 2: Create a list of Map entries (character and frequency) and sort by frequency
//  List<Map.Entry<Character, Integer>> frequencyList = new ArrayList<>(map.entrySet());
        
//  // Sort the list by frequency in descending order
//  frequencyList.sort((entry1, entry2) -> entry2.getValue() - entry1.getValue());

//  // Step 3: Find the second most frequent character
//  if (frequencyList.size() > 1 && frequencyList.get(1).getValue() < frequencyList.get(0).getValue()) {
//      System.out.println("Second most frequent character is '" + frequencyList.get(1).getKey() + "'");
//  } else {
//      System.out.println("No second most frequent character found.");
//  }

//  s.close();
// }
