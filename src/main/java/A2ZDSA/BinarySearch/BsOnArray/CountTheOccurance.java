package A2ZDSA.BinarySearch.BsOnArray;

public class CountTheOccurance {
    public static int count(int arr[], int n, int x) {
        //Your code goes here
        int firstPosition = first(arr, n,x);
        if(firstPosition==-1)
            return 0;
        int lastPosition = last(arr, n,x);
        int totalcount = (lastPosition - firstPosition) +1;
        return totalcount;
    }
    public static int first(int[] nums, int n, int x)
    {
        int low =0, high = n-1;
        int ans =-1;
        while(low<=high)
        {
            int mid = (low + high)/2;
            if(nums[mid]==x)
            {
                ans = mid;
                high = mid-1;
            }
            else if(nums[mid]<x)
                low = mid+1;
            else
                high = mid-1;
        }
        return ans;
    }
    public static int last(int[] nums, int n, int x)
    {
        int low =0, high = n-1;
        int ans =-1;
        while(low<=high)
        {
            int mid = (low + high)/2;
            if(nums[mid]==x)
            {
                ans = mid;
                low = mid+1;
            }
            else if(nums[mid]<x)
                low = mid+1;
            else
                high = mid-1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr =  {2, 4, 6, 8, 8, 8, 11, 13};
        int n = 8, x = 7;
        int ans = count(arr, n, x);
        System.out.println("The number of occurrences is: " + ans);
    }
}
