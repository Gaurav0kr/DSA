package A2ZDSA.RecursionPatterwise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum_II {

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
            findCombination(arr,target - arr[ind],ans,ds,ind+1);
            ds.remove(ds.size()-1);
        }
        findCombination(arr,target,ans,ds,ind+1); // Not Take
    }

// Another method
public static void findCombo(int[] arr, int target, List<List<Integer>> ans,List<Integer> ds,int ind ){
        if(target==0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=ind;i<arr.length;i++){
            if(i>ind && arr[i]==arr[i-1]) continue;
            if(arr[i]>target) break;
            ds.add(arr[i]);
            findCombo(arr,target-arr[i],ans,ds,i+1);
            ds.remove(ds.size()-1);
        }
}
    public static List<List<Integer>> combinationSum2(int[] arr, int target ){
        List<List<Integer>> ans = new ArrayList<>();
        findCombo(arr,target,ans,new ArrayList<>(),0);
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {10,1,2,7,6,1,5};
        int target = 8;
        Arrays.sort(arr);
        System.out.println(combinationSum2(arr,target));

    }
}
