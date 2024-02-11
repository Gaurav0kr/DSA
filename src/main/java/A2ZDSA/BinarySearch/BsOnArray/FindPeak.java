package A2ZDSA.BinarySearch.BsOnArray;

public class FindPeak {
    public static int findPeak_Brute(int[] nums)
    {
        int n = nums.length;
        int ans =0;
        for(int i=0;i<n;i++)
        {
            if((i==0 || (nums[i]>nums[i-1]) ) && (i==n-1 || ( nums[i] >nums[i+1])))
                ans= nums[i];
        }
        return ans;
    }
    public static int findPeak_Optimal(int[] nums) {
        int n = nums.length;

        if(n==1)
            return nums[0];
        if(nums[0]>nums[1])
            return nums[0];
        if(nums[n-1]>nums[n-2])
            return nums[n-1];

        int low =1, high = n-2;
        while(low<=high)
        {
            int mid = (low + high)/2;
            if(nums[mid] >nums[mid-1] && nums[mid]>nums[mid+1])
                return nums[mid];
            else if (nums[mid]>nums[mid-1])
                low = mid+1;
            else
                high = mid-1;

        }
        return -1;
    }
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,6,7,8,5,1};
//        System.out.print(findPeak_Brute(arr));
        System.out.print(findPeak_Optimal(arr));
    }
}
