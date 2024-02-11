package A2ZDSA.BinarySearch.BsOnArray;

public class FirstAndLastIndex {
    public static int[]firstAndLast(int[] arr, int x)
    {
        int[] ans = new int[2];
        int first =-1, last =-1;
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==x)
            {
                if(first==-1)
                    first =i;
                last =i;
            }
        }
        ans[0] = first;
        ans[1] = last;
        return ans;
    }
    public static int[] searchRange(int[] nums, int target) {

        int n = nums.length;

        int floor = first(nums,n,target);
        if( floor == n || nums[floor] !=target)
            return new int[] {-1,-1};
        int ceil = last(nums,n,target);

        return new int[] {floor,ceil-1};

    }

    public static int first(int[] a, int n, int x)
    {
        int low =0, high = n-1;
        int floor = n;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(a[mid]>=x)
            {
                floor = mid;
                high = mid-1;
            }
            else
                low = mid+1;
        }
        return floor;
    }
    public static int last(int[] a, int n, int x)
    {
        int low =0, high = n-1;
        int ceil = n;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(a[mid]>x)
            {
                ceil = mid;
                high = mid-1;
            }
            else
                low = mid+1;
        }
        return ceil;
    }

    // Using pure Binary search
    public static int[] searchRange1(int[] nums, int target) {

        int n = nums.length;
        int floor = first1(nums,n,target);
        if( floor == -1)
            return new int[] {-1,-1};
        int ceil = last1(nums,n,target);

        return new int[] {floor,ceil};

    }

    public static int first1(int[] a, int n, int x)
    {
        int low =0, high = n-1;
        int floor = -1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(a[mid]==x)
            {
                floor = mid;
                high = mid-1;
            }
            else if(a[mid]<x)
                low = mid+1;
            else
                high = mid-1;
        }
        return floor;
    }
    public static int last1(int[] a, int n, int x)
    {
        int low =0, high = n-1;
        int ceil = -1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(a[mid]==x)
            {
                ceil = mid;
                low = mid+1;
            }
            else if(a[mid]<x)
                low = mid+1;
            else
                high = mid-1;
        }
        return ceil;
    }
    public static void main(String[] args) {
        int[] arr =  {2, 4, 6, 8, 8, 8, 11, 13};
        int k = 8;
        int[] ans = firstAndLast(arr, k);
    //    int[] ans = searchRange(arr,k);
    //    int[] ans = searchRange1(arr,k);
        System.out.println("The first and last positions are:: "
                + ans[0] + " " + ans[1]);
    }
}
