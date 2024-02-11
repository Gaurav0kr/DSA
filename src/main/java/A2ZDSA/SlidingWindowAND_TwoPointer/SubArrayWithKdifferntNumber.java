package A2ZDSA.SlidingWindowAND_TwoPointer;

import java.util.HashMap;
import java.util.Map;

public class SubArrayWithKdifferntNumber {
    public static int subarraysWithKDistinct(int[] nums, int k) {
        return findAtMostK(nums,k) - findAtMostK(nums,k-1);
    }
    public static int findAtMostK(int[] nums, int k){

        int n = nums.length, left =0, count =0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int right =0;right<n;right++){

            map.put(nums[right], map.getOrDefault(nums[right],0)+1);
            while(map.size()>k){
                if(map.get(nums[left])==1)
                    map.remove(nums[left]);
                else
                    map.put(nums[left], map.get(nums[left])-1);

                left++;
            }
            count += right-left+1;
        }
        return count;
    }

    public static void main(String[] args){
        int nums[] = {1,2,1,2,3};
        int k = 2;
        System.out.println(" SubArrayWithKdifferntNumber = "+subarraysWithKDistinct(nums,k));
    }
}
