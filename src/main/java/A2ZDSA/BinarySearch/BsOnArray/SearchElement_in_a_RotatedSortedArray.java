package A2ZDSA.BinarySearch.BsOnArray;

public class SearchElement_in_a_RotatedSortedArray {

    public static int findposition(int[] arr, int target)
    {
        int n = arr.length;
        int low = 0, high = n-1;

        while(low <= high)
        {
            int mid = (low+high)/2;
            // if mid point to the target
            if (arr[mid] == target)
                return mid;

            // if left half is sorted
            if(arr[low]<=arr[mid])
            {
                // if target is present in first half
                if(arr[low]<=target && target<= arr[mid])
                    high = mid-1;
                else
                    low = mid+1;
            }
            else
            {
                if(arr[mid]<=target && target<= arr[high])
                    low = mid+1;
                else
                    high = mid-1;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {7, 8, 9, 1, 2, 3, 4, 5, 6};
        int n = 9, k = 8;
        int ans = findposition(arr,  k);
        if (ans == -1)
            System.out.println("Target is not present.");
        else
            System.out.println("The index is: " + ans);
    }
}
