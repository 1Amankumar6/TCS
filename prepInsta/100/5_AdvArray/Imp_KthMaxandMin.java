import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Imp_KthMaxandMin {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n, k, i;

    System.out.println("Enter the size of the array");
    n = sc.nextInt();  // Read the size of the array
    int[] arr = new int[n];

    System.out.println("Enter the elements for the array");
    for (i = 0; i < n; i++) {
      arr[i] = sc.nextInt();  // Read the elements into the array
    }

    System.out.println("Enter the value of k");
    k = sc.nextInt();  // Read the value of k

    // PriorityQueue to find kth smallest element (min-heap)
    PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
    for (i = 0; i < n; i++) {
      queue.add(arr[i]);
      if (queue.size() > k) {
        queue.poll();  // Remove the smallest element if size exceeds k
      }
    }
    System.out.println("Kth smallest element is: " + queue.peek());

    // PriorityQueue to find kth largest element (max-heap)
    PriorityQueue<Integer> queue1 = new PriorityQueue<>();
    for (i = 0; i < n; i++) {
      queue1.add(arr[i]);
      if (queue1.size() > k) {
        queue1.poll();  // Remove the largest element if size exceeds k
      }
    }
    System.out.println("Kth largest element is: " + queue1.peek());
  }
}
