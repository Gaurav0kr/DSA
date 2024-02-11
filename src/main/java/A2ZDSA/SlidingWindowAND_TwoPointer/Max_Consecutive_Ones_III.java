package A2ZDSA.SlidingWindowAND_TwoPointer;

public class Max_Consecutive_Ones_III {

    public static int maxConsOne(int[] nums, int k){

        int n = nums.length, maxLen =0;
        int left =0, zeroCount =0;
        for(int right=0;right<n;right++){
            if(nums[right]==0)
                zeroCount++;

            while(zeroCount>k){
                if(nums[left]==0)
                    zeroCount--;
                left++;
            }
            maxLen = Math.max(maxLen, right-left +1);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 1, 0, 1, 0, 1};
        int k = 2;

        int result = maxConsOne(nums, k);

        System.out.println("Maximum number of consecutive 1's after flipping at most " + k + " 0's: " + result);
    }
}
