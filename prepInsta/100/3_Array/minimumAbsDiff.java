public class minimumAbsDiff {
  public static void main(String args[])
  {
      int arr[] = {2, 4, 5, 3};
      int n = arr.length;
       
      System.out.println( "Required Minimum Sum is " + sumOfMinAbsDifferences(arr, n));
  }
  static int sumOfMinAbsDifferences(int[] arr, int n){
    int result = Integer.MAX_VALUE;
    for(int i=0; i<n ; i++){
      int sum = 0;
      for(int j=0 ; j<n ; j++){
        sum += Math.abs(arr[i]-arr[j]);
      }
      result = Math.min(sum,result);
    }
    return result;
  }
}
