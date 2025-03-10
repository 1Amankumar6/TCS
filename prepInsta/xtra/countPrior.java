public class countPrior {
  public static void main(String[] args) {
    int[] nums = {7,4,8,2,9};
    int count = 1; 
    for(int i=0; i<nums.length-1; i++){
      if(nums[i] > nums[i+1]){
        count++;
      }
    }
    System.out.println(count);
  }
}
