import java.util.Arrays;

public class Imp_MinimizeMaxDiffe {
  public static void main(String[] args) {
    int[] arr = { 7, 4, 8, 8, 8, 9 };
    int k = 6;
    int ans = getMinDiff(arr, arr.length, k);
    System.out.println(ans);// 5
  }
  // Take the size of the array from the user and store it in a variable called n,
  // and the value of K in another variable called k.
  // Declare an array of size n and take n array elements from the user.
  // Create a function to carry out the required operation.
  // First, we attempt to sort the array and maximize the height of each tower.
  // We accomplish this by decreasing the height of all towers to the right by k
  // and increasing the height of all towers to the left by k. (by k).
  // It’s also possible that the tower you’re attempting to raise doesn’t have the
  // maximum height.
  // After modification array become , arr[] = {4, 8, 12, 7} and maximum height –
  // minimum height (12-4) = 8.
  public static int getMinDiff(int[] arr, int n, int k){
    Arrays.sort(arr);
    int ans = (arr[n-1]+k)-(arr[0]+k); //Maximum possible height difference
    int tempmax = arr[n-1]-k;
    int tempmin = arr[0]+k;
    int min, max;
    for(int i=0; i<n-1; i++){
      if(tempmax > (arr[i]+k)){
        max = tempmax;
      }else{
        max = arr[i]+k;
      }
      if(tempmin < (arr[i+1]-k)){
        min = tempmin;
      }else{
        min = arr[i+1]-k;
      }
      if(ans>(max-min)){
        ans = max-min;
      }
    }
    return ans ;
  }
}
