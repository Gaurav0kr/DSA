package A2ZDSA.BinarySearch.BsOnArray;

public class FindMinimumInSortedArray {

    public static int findMin(int[] nums)
    {
        int n = nums.length;
        int low = 0, high = n-1;
        int min = Integer.MAX_VALUE;
        while(low<=high)
        {
            int mid = (low + high)/2;

            //check which one is sorted
            if(nums[low]<=nums[mid]) {
                min = Math.min(nums[low], min);
                // Eliminate left half
                low = mid+1;
            }
            else {
                min = Math.min(nums[mid], min);
                high = mid-1;
            }
        }
        return min;
    }
    public static int findMin_MoreOptimise(int[] nums)
    {
        int n = nums.length;
        int low = 0, high = n-1;
        int min = Integer.MAX_VALUE;
        while(low<=high)
        {
            int mid = (low + high)/2;

            //search space is already sorted
//then arr[low] will always be
//the minimum in that search space:
            if (nums[low] <= nums[high]) {
                min = Math.min(min, nums[low]);
                break;
            }

            //check which one is sorted
            if(nums[low]<=nums[mid]) {
                min = Math.min(nums[low], min);
                // Eliminate left half
                low = mid+1;
            }
            else {
                min = Math.min(nums[mid], min);
                high = mid-1;
            }
        }
        return min;
    }
}

/*
*/
