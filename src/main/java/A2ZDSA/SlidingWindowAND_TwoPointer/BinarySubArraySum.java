package A2ZDSA.SlidingWindowAND_TwoPointer;

import java.util.HashMap;
import java.util.Map;

public class BinarySubArraySum {

    public static int numSubarraysWithSum(int[] nums, int goal) {
        int res=0;
        int curr=0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);

        for(int i:nums){
            curr += i;
            res += map.getOrDefault(curr-goal,0);
            map.put(curr,map.getOrDefault(curr,0)+1);
        }

        return res;
    }

    // using Atmost K || Sliding window approach
    public static int numSubarraysWithSum_2(int[] nums, int goal) {

        return atMostK(nums,goal)-atMostK(nums,goal-1);
    }
    public static int atMostK(int[] nums, int k){
        if(k<0)
            return 0;
        int n = nums.length;
        int sum =0, ans=0;
        int left=0;
        for(int right=0;right<n;right++){
            sum += nums[right];
            while(sum>k && left<=right){
                sum -= nums[left];
                left++;
            }
            ans += (right-left +1);
        }
        return ans;
    }
    public static void main(String[] args){
        int[] nums = {0,0,0,0,0};
        int k = 0;

        System.out.println("answer is = "+numSubarraysWithSum_2(nums,k));
    }
}
