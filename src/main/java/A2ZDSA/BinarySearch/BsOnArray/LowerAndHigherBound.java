package A2ZDSA.BinarySearch.BsOnArray;

public class LowerAndHigherBound {
    // LowerBound
    public static int lowerBound(int[] arr, int n, int target)
    {
        int low =0, high = n-1;
        int ans =n;
        while(low<=high)
        {
            int mid = (low+high)/2;
            // may be my answer
            if(arr[mid]>=target) {
                ans = mid;
                // look for smaller index on left
                high = mid -1;
            }
            else
                low = mid+1; // look for right
        }
        return ans;
    }
    public static int upperBound(int[] arr, int n, int target)
    {
        int low =0, high = n-1;
        int ans =n;
        while(low<=high)
        {
            int mid = (low+high)/2;
            // may be my answer
            if(arr[mid]>target) {
                ans = mid;
                // look for smaller index on left
                high = mid -1;
            }
            else
                low = mid+1; // look for right
        }
        return ans;
    }

}
