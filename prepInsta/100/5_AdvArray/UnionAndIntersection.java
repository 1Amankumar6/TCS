import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class UnionAndIntersection {
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);

    int n1 = 4;
    System.out.println("The size of the array 1:- " + n1);
    int[] arr1 = new int[] { 1, 2, 3, 4 };
    System.out.println("The Elements of array 1");
    for (int i = 0; i < n1; i++) {
      System.out.print(arr1[i] + " ");
    }
    System.out.println();

    int n2 = 4;
    System.out.println("The size of the array 2:- " + n2);

    int[] arr2 = new int[] { 4, 5, 6, 7 };
    System.out.println("The Elements of array 2");

    for (int i = 0; i < n2; i++) {
      System.out.print(arr2[i] + " ");
    }
    System.out.println();
    System.out.println("The Union of the two array is ");
    Union(arr1, arr2);
    System.out.println("The Intersection of the two array is ");
    Intersection(arr1, arr2);
  }

  private static void Intersection(int[] arr1, int[] arr2) {
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    ArrayList<Integer> list = new ArrayList<>();
    int i = 0, j = 0;
    while (i < arr1.length && j < arr2.length) {
      if (arr1[i] == arr2[j]) {
        list.add(arr1[i]);
        i++;
        j++;
      }else if(arr1[i] < arr2[j]){
        i++;
      }else{
        j++;
      }
    }
    System.out.println(list);
  }

  private static void Union(int[] arr1, int[] arr2) {
    ArrayList<Integer> list = new ArrayList<>();
    int i = 0, j = 0;
    while (i < arr1.length && j < arr2.length) {
      if (arr1[i] < arr2[j]) {
        list.add(arr1[i]);
        i++;
      } else if (arr1[i] > arr2[j]) {
        list.add(arr2[j]);
        j++;
      } else {
        list.add(arr1[i]);
        i++;
        j++;
      }
    }
    while (i < arr1.length) {
      list.add(arr1[i]);
      i++;
    }

    // Add remaining elements from arr2 if any
    while (j < arr2.length) {
      list.add(arr2[j]);
      j++;
    }
    System.out.println(list);
  }
}
