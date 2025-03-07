public class Imp_leftRotateK {
  static void leftRotate(int arr[], int d, int n){
    d = d%n;
    reverse(arr,0,d-1);
    reverse(arr,d, n-1);
    reverse(arr,0,n-1);
  }
  static void reverse(int arr[], int start, int end){
    int temp ;
    while(start < end){
      temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++ ;
      end-- ;
    }
  }
  static void printArray(int arr[], int n){
    for(int i=0; i<n; i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }
  public static void main(String[] args) {
    int arr[] = {1,2,3,4,5};
    int d = 2; 
    int n = arr.length;
    System.out.println("Array before rotation: ");
    printArray(arr, n);
    leftRotate(arr, d, n);
    System.out.println("Arrays after "+d+" left rotation: ");
    printArray(arr, n);
  }
}
