package A2ZDSA.SlidingWindowAND_TwoPointer;

public class CountNumber_of_NiceSubarrays {

public static int niceArr(int[]nums, int k){
    return atmostK(nums,k) - atmostK(nums,k-1);
}
public static int atmostK(int[] nums, int k) {

    if(k<0)
        return 0;
    int n = nums.length;
    int left =0, count = 0,ans =0;
    for(int right =0;right <n;right++){

        if(nums[right] %2==1)
            count++;
        while(count >k && left<=right)
        {
            count --;
            left++;
        }
        ans += (right-left +1);
    }
    return ans;
}
// Using PreFixSum
public static int numberOfSubarrays(int[] nums, int k) {
    int n = nums.length;
    int[] prefixCount = new int[n + 1];
    prefixCount[0] = 1;
    int sum = 0;
    int count = 0;

    for (int num : nums) {
        sum += num % 2;
        if (sum >= k) {
            count += prefixCount[sum - k];
        }
        prefixCount[sum]++;
    }

    return count;
}
    public static void main(String[] args){
        int[] nums = {2,4,6};
        int k = 1;

        System.out.println("answer is = "+niceArr(nums,k));
    }
}
