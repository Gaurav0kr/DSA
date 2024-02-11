package A2ZDSA.BinarySearch.Answer;

public class Koko_Eating_Bananas {


    public static int findMax(int[] v)
    {
        int maxi = Integer.MAX_VALUE;
        for(int i=0;i<v.length;i++)
            maxi = Math.max(v[i],maxi);
        return maxi;
    }
    public static int minEatingSpeed(int[] piles, int h) {

        int low =1;
        int high = findMax(piles);

        while(low<=high)
        {
            int mid = (low+high)/2;
            int totalH = calculateTotalHours(piles,mid);
            if(totalH<=h)
                high = mid-1;
            else
                low=mid+1;
        }
        return low;
    }
    public static int calculateTotalHours(int[] piles, int hourly) {
        int n = piles.length;
        int totalH = 0;
        for (int i = 0; i < n; i++) {
            totalH += Math.ceil((double) (piles[i]) / (double) (hourly));
        }
        return totalH;
    }
}
