public class Automorphic {
  public static void main(String[] args) {
    
  }
  public static boolean isAutomorphic(int n){
    int sq = n*n ;
    while(n > 0){
      if(n%10 != sq%10){
        return false ;
      }
      n/= 10;
      sq/= 10;
    }
    return true ;
  }
}
