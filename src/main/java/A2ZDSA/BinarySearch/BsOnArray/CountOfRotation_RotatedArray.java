package A2ZDSA.BinarySearch.BsOnArray;

public class CountOfRotation_RotatedArray {
    public static int countRotation(int[] nums)
    {
        int n = nums.length;
        int low = 0, high = n-1;
        int index =-1;
        int min = Integer.MAX_VALUE;
        while(low<=high)
        {
            int mid = (low+high)/2;

            if(nums[low]<= nums[high])
            {
                if(nums[low]< min)
                {
                    index = low;
                    min = nums[low];
                }
            }

            if(nums[low]<= nums[mid])
            {
                if(nums[low]<min) {
                    index = low;
                    min = nums[low];
                }
            }
            else
            {
                if(nums[mid]<min)
                {
                    index = mid;
                    min = nums[mid];
                }
            }
        }
        return index;
    }
}
