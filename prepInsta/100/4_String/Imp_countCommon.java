public class Imp_countCommon {
  public static void main(String[] args) {
    String n = "ABC";
    String m = "AB";
    int l1 = n.length();
    int l2 = m.length();

    int[][] cnt = new int[l1+1][l2+1];

    for(int i=1; i<=l1 ; i++){
      for(int j=1; j<=l2 ; j++){
        if(n.charAt(i-1)==m.charAt(j-1)){
          cnt[i][j] = 1+cnt[i-1][j-1] +cnt[i][j-1]+cnt[i-1][j];
        }else{
          cnt[i][j] = cnt[i-1][j] +cnt[i][j-1]-cnt[i-1][j-1];
        }
      }
    }
    System.out.println(cnt[l1][l2]);
  }
}
