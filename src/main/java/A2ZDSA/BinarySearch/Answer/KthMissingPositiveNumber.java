package A2ZDSA.BinarySearch.Answer;

public class KthMissingPositiveNumber {

    public int findKthPositive_Brute(int[] arr, int k) {
        int n = arr.length;
        int ans =0;

        for(int i=0;i<n;i++)
        {
            if(arr[i]<=k)
                k++;
            else
                break;
        }
        return k;
    }
    public static int findKthPositive_Optimal(int[] arr, int k) {
        int n = arr.length;
        int low = 0, high = n-1;
        while(low<=high)
        {
            int mid = (low + high)/2;
            int missing = arr[mid]-(mid+1);
            int more = k-missing;
            if(missing<k)
                low = mid+1;
            else
                high = mid-1;
        }
        return high +k+1;
    }
    public static void main(String[] args) {
        int[] vec = {4, 7, 9, 10};
        int n = 4, k = 4;
        int ans = findKthPositive_Optimal(vec,  k);
        System.out.println("The missing number is: " + ans);
    }
}
