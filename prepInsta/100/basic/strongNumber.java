public class strongNumber {
  public static void main(String[] args) {
    int n = 145 ;
    int temp = n ;
    int digit =0 ;
    int sum = 0 ;
    while(temp!=0){
      digit = temp%10;
      sum += factorial(digit);
      temp/= 10;
    }
    System.out.println(sum);
  }
  public static int factorial(int n){
    int product = 1 ; 
    for(int i=1 ; i<=n ; i++){
      product*=i ;
    }
    return product;
  }
}
