package A2ZDSA.RecursionPatterwise;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumOnArray {

    public static List<List<Integer>> combinationSum(int[] arr, int target ){
        List<List<Integer>> ans = new ArrayList<>();
        findCombination(arr,target,ans,new ArrayList<>(),0);
        return ans;
    }
    public static void findCombination(int[] arr,int target,List<List<Integer>> ans,List<Integer> ds, int ind){

        if(ind == arr.length){ // Base condition
            if(target==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        // Take
        if(arr[ind] <=target){//condition statisfied so add
            ds.add(arr[ind]);
            findCombination(arr,target - arr[ind],ans,ds,ind);
            ds.remove(ds.size()-1);
        }
        findCombination(arr,target,ans,ds,ind+1); // Not Take
    }
    public static void main(String[] args) {
        int arr[] = {2,8,3,7};
        int target = 7;
        System.out.println(combinationSum(arr,target));

    }
}
