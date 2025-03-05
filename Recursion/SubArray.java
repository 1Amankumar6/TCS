package TCS.Recursion;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class SubArray {
    public int subarrayBitwiseORs(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        subArray(0, arr, new ArrayList<>(), ans);
        
        return ans.size() ;
    }
    public void subArray(int index, int[] arr, List<Integer> ds, List<List<Integer>> ans){
        if(index >= arr.length){
            ans.add(new ArrayList<Integer>(ds));
            return ;
        }
        Set<Integer> set = new HashSet<>();
        subArray(index+1, arr, ds, ans); 
        ds.add(arr[index]);
        subArray(index+1, arr, ds, ans);
        ds.remove(ds.size()-1);
    }
}
