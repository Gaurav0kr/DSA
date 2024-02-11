package A2ZDSA.BinarySearch.Answer;

public class SplitArrayLargest_Sum {

    public static int splitArray(int[] nums, int k) {

        int n = nums.length;
        int low = nums[0];
        int high = 0;
        for(int i =0;i<n;i++)
        {
            low = Math.max(low, nums[i]);
            high += nums[i];
        }
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(partition(nums,mid)>k)
                low = mid+1;
            else
                high = mid-1;
        }
        return low;
    }
    public static int partition(int[] arr, int maxSum)
    {
        int n = arr.length;
        int partitionCount =1;
        int subArray=0;
        for(int i=0;i<n;i++)
        {
            if(subArray + arr[i] <= maxSum)
                subArray += arr[i];
            else
            {
                partitionCount++;
                subArray = arr[i];
            }
        }
        return partitionCount;
    }
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40};
        int k = 2;
        int ans = splitArray(a, k);
        System.out.println("The answer is: " + ans);
    }
}
