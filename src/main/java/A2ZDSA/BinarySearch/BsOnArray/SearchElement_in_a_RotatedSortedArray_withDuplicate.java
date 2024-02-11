package A2ZDSA.BinarySearch.BsOnArray;

public class SearchElement_in_a_RotatedSortedArray_withDuplicate {

    public static boolean findposition(int[] arr, int target)
    {
        int n = arr.length;
        int low = 0, high = n-1;

        while(low <= high)
        {
            int mid = (low+high)/2;
            // if mid point to the target
            if (arr[mid] == target)
                return true;
            //check if low = mid = high condition
            if(arr[low] == arr[mid] && arr[mid]== arr[high])
            {
                low++;
                high--;
                continue;
            }

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
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {7,7, 8, 9, 1, 2, 3, 4, 5, 7};
        int n = 9, k = 10;
        boolean ans = findposition(arr,  k);
        if (ans == false)
            System.out.println("Target is not present.");
        else
            System.out.println("The index is: " + ans);
    }
}
