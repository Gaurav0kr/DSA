package A2ZDSA.BinarySearch.BsOnArray;

public class SearchInsertPosition {
    /*Input: nums = [1,3,5,6], target = 5
    Output: 2*/
    public static int searchInsert(int[] nums, int target)
    {
        int n = nums.length;
        int low =0, high = n-1;
        int ans= 0;
        while(low<=high)
        {
            int mid = (low +high)/2;
            if(nums[mid]>=target)
            {
                ans=mid;
                high = mid-1;
            }
            else
                low = mid+1;
        }
        return ans;
    }
}
