package A2ZDSA.RecursionPatterwise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrintCombination {

    public static List<List<Integer>> printCombo(int[] arr){

        List<List<Integer>> ans= new ArrayList<>();
        Map<Integer,Boolean> used = new HashMap<>();
        for(int i=0;i<arr.length;i++)
            used.put(i,false);
        generateCombo(arr,0,used,ans,new ArrayList<>());
        return ans;
    }
    public static void generateCombo(int[] arr,int index,Map<Integer,Boolean> used,List<List<Integer>> ans,List<Integer> ds){

        int n = arr.length;
        if(index == n){
            ans.add(new ArrayList<>(ds));
        return;
        }
        for(int i=0;i<n;i++){
            if(used.get(i)) continue;
            used.put(i,true);
            ds.add(arr[i]);
            generateCombo(arr,index+1,used,ans,ds);
            ds.remove(ds.size()-1);
            used.put(i,false);
        }
    }
    //******************************** ANOTHER Way
    public static List<List<Integer>> permute(int[] arr){
        List<List<Integer>> ans= new ArrayList<>();
        boolean[] used = new boolean[arr.length];
        generateCombo2(arr,ans,used,new ArrayList<>());
        return ans;
    }
    private static void generateCombo2(int[] arr, List<List<Integer>> ans, boolean[] used, List<Integer> ds){

        if(ds.size()==arr.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(!used[i]){
                ds.add(arr[i]);
                used[i]=true;
                generateCombo2(arr,ans,used,ds);
                ds.remove(ds.size()-1);
                used[i]=false;
            }
        }
    }
    //********************************
    public static void main(String[] args){
        int arr[] ={1,2,3};

        System.out.println("using second method"+permute(arr));
    }
    // WITHOUT USING EXTRA SPACE
    public static void findCombo(int[] nums, List<List<Integer>> ans, int ind){

        if(ind==nums.length){
            List<Integer> ds = new ArrayList<>();
            for(int i=0;i<nums.length;i++)
                ds.add(nums[i]);
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i=ind;i<nums.length;i++){
            swap(i,ind,nums);
            findCombo(nums,ans,ind+1);
            swap(i,ind,nums);
        }
    }
    public static void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static List<List<Integer>> printCombo2(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        findCombo(nums,ans,0);
        return ans;
    }
}
