package A2ZDSA.BinarySearch.BsOnArray;

public class SingleElementInSortedArray {

    public static int findSingle(int[] nums)
    {
        int n = nums.length;
        if(nums.length==1)
            return 0;
        for(int i=0;i<n;i++)
        {
            if(i==0 )
            {
                if(nums[i] !=nums[i+1])
                    return i;
            }
            else if(i==n-1)
            {
                if(nums[i] != nums[i-1])
                    return i;
            }
            else {
                if(nums[i] != nums[i+1] && nums[i] != nums[i-1])
                    return i;
            }
        }
        return -1;
    }
    public static int singleNonDuplicate(int nums[]) {
        int n = nums.length; // Size of the array.

        // Edge cases:
        if (n == 1)
            return nums[0];
        if (nums[0]!= nums[1])
            return nums[0];

        if (nums[n - 1]!=nums[n - 2])
            return nums[n - 1];

        int low = 1, high = n - 2;
        while (low <= high) {
            int mid = (low + high) / 2;

            // If arr[mid] is the single element:
            if (nums[mid]!=nums[mid + 1] && nums[mid] !=nums[mid - 1]) {
                return nums[mid];
            }

            // We are in the left:
            if ((mid % 2 == 1 && nums[mid]==nums[mid - 1])
                    || (mid % 2 == 0 && nums[mid]==nums[mid + 1])) {
                // Eliminate the left half:
                low = mid + 1;
            }
            // We are in the right:
            else {
                // Eliminate the right half:
                high = mid - 1;
            }
        }

        // Dummy return statement:
        return -1;
    }
}
