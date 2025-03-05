import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MajorityElement {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int N = s.nextInt();
    int[] array = new int[N];
    for (int i = 0; i < N; ++i) {
      array[i] = s.nextInt();
    }
    findMajority(array, N);
  }
  private static void findMajority(int[] array, int n) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int i : array){
      map.put(i, map.getOrDefault(i, 0)+1);
    }
    for(Map.Entry<Integer,Integer> maa : map.entrySet()){
      if (maa.getValue() > n/2) {
        System.out.println(maa.getKey());
      }
    }
  }
}
