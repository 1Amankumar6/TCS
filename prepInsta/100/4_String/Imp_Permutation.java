import java.util.*;
public class Permutation {
  static List<String> ans = new ArrayList<>();
  public static void main(String[] args) {
    String str = "ABC";
    char[] a = str.toCharArray();
    int n = a.length;
    permute(a,0,n);
    Collections.sort(ans);
    for(String perm : ans){
      System.out.print(perm+" ");
    }
  }
  public static void permute(char[] a, int l, int r){
    if(l == r){
      ans.add(new String(a));
    }else{
      for(int i=l ; i<r; i++){
        swap(a,l,i);
        permute(a,l+1,r);
        swap(a,l,i);
      }
    }
  }
  public static void swap(char[] a, int i, int j){
    char temp = a[i];
    a[i] = a[j];
    a[j] = temp;
  }
}
