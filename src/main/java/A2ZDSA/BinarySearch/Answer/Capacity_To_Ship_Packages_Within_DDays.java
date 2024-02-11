package A2ZDSA.BinarySearch.Answer;

public class Capacity_To_Ship_Packages_Within_DDays {

    public static int findDays(int[] nums, int cap)
    {
        int n = nums.length;
        int load =0;
        int days =1;
        for(int i=0;i<n;i++)
        {
            if (load + nums[i] >cap) {
                days = days +1;
                load = nums[i];
            }
            else
                load += nums[i];
        }
        return days;
    }
    public static int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        // find max Capacity
        int low = Integer.MIN_VALUE;
        int high =0;
        for(int i=0;i<n;i++) {
            high += weights[i];
            low = Math.max(low, weights[i]);
        }

        while(low<=high)
        {
            int mid = (low + high)/2;
            int totadays = findDays(weights,mid);
            if(totadays<=days)
                high = mid-1;
            else
                low = mid +1;
        }
        return low;
    }
    public static void main(String[] args) {
        int[] weights = {5, 4, 5, 2, 3, 4, 5, 6};
        int d = 5;
        int ans = shipWithinDays(weights, d);
        System.out.println("The minimum capacity should be: " + ans);
    }
}
