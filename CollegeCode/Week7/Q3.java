// Given an array of elements of length N, ranging from 1 to N. All elements may not be present in the
// array. If element is not present then there will be -1 present in the array. Rearrange the array such that
// A[i] = i and if i is not present, display -1 at that place. Take input from STDIN.
// Examples:
// Input : arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1}
// Output : [-1, 1, 2, 3, 4, -1, 6, -1, -1, 9]
// Input : arr = {19, 7, 0, 3, 18, 15, 12, 6, 1, 8, 11, 10, 9, 5, 13, 16, 2, 14, 17, 4}
// Output : [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]

import java.util.Scanner;
import java.util.Arrays;

public class Q3 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String input = s.nextLine();
    input = input.replaceAll("[{}]", "");
    String[] elements = input.split(",");
    int N = elements.length ;
    int[] arr = new int[N];

    for(int i=0 ; i<N ; i++){
      arr[i] = Integer.parseInt(elements[i].trim());
    }

    int[] result = new int[N];
    Arrays.fill(result, -1);
    for(int num : arr){
      if(num != -1 && num < N){
        result[num] = num ;
      }
    }
    System.out.println(Arrays.toString(result));
  }
}
