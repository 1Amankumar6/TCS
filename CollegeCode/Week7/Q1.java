// Given two arrays of n numbers each, form a pair of numbers taking one number from array1 and the
// other from array2 such that the sum of the pair of this numbers is the maximum possible for the given
// arrays. Take input from STDIN. Don’t use any sorting technique.
// Input:
// 2 1 5 7 10
// 3 6 8 1 2
// Output:
// 18

import java.util.ArrayList;
import java.util.Scanner;

public class Q1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String s1 = input.nextLine();
    String s2 = input.nextLine();
    Scanner arr1 = new Scanner(s1);
    Scanner arr2 = new Scanner(s2);
    ArrayList<Integer> list = new ArrayList<>();
    ArrayList<Integer> list1 = new ArrayList<>();
    while (arr1.hasNextInt()) {
      list.add(arr1.nextInt());
    }
    while (arr2.hasNextInt()) {
      list1.add(arr2.nextInt());
    }
    maximumSum(list, list1);
  }

  private static void maximumSum(ArrayList<Integer> list, ArrayList<Integer> list1) {
    int max1 = 0, max2 = 0;
    for (int i : list) {
      max1 = Math.max(i, max1);
    }
    for (int i : list1) {
      max2 = Math.max(i, max2);
    }
    System.out.println(max1+max2);
  }
}
