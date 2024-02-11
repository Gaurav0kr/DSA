package A2ZDSA.RecursionPatterwise;

import java.util.ArrayList;
import java.util.List;

public class SubSet_II {

    public static List<List<Integer>> subsetsWithDup(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        findSubSet(0,nums,ans,new ArrayList<>());
        return ans;
    }
    public static void findSubSet(int ind, int[] nums,List<List<Integer>> ans, List<Integer> ds){

        ans.add(new ArrayList<>(ds));

        for(int i=ind;i<nums.length;i++){
            if(i !=ind && nums[i]==nums[i-1]) continue;
            ds.add(nums[i]);
            findSubSet(i+1,nums,ans,ds);
            ds.remove(ds.size()-1);
        }
    }
    public static void main(String[] args){
        int arr[] ={1,2,2};
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(subsetsWithDup(arr));
    }
}
