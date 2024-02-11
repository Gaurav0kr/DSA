package A2ZDSA.BinarySearch.Answer;

public class Find_theSmallest_Divisor_Given_aThreshold {

    public static int findMaxi(int[] nums)
    {
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
            maxi = Math.max(maxi,nums[i]);

        return maxi;
    }
    public static int findSum(int[] nums, int divisor)
    {
        int n = nums.length;
        int sum=0;
        for(int i =0;i<n;i++) {
            sum += Math.ceil((double) (nums[i]) / (double) (divisor));
        }
        return sum;
    }
    public static int smallestDivisor(int[] nums, int threshold )
    {
        int low = 1;
        int high = findMaxi(nums);

        while(low<=high)
        {
            int mid = (low+high)/2;
            int sum = findSum(nums,mid);

            if(sum<=threshold)
                high = mid-1;
            else
                low = mid+1;
        }
        return low;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int limit = 8;
        int ans = smallestDivisor(arr, limit);
        System.out.println("The minimum divisor is: " + ans);
    }
}
