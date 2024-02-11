package A2ZDSA.BinarySearch.Answer;

public class Minimum_Number_of_Days_to_Make_mBouquets {

    public static boolean possible(int[] arr, int days, int m, int k)
    {
        int n = arr.length;
        int nOfBooke = 0;
        int count =0;

        for(int i =0;i<n;i++)
        {
            if(arr[i]<=days)
                count ++;
            else
            {
                nOfBooke += (count/k);
                count =0;
            }
        }
        nOfBooke += (count/k);
        return nOfBooke >=m;
    }
    public static int roseGarden(int[] arr, int k, int m)
    {
        int val = m*k;
        int n = arr.length;
        if(val >n)
            return -1;
        // Calculate maxi and min
        int mini = Integer.MAX_VALUE, maxi = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            maxi = Math.max(maxi,arr[i]);
            mini = Math.min(mini, arr[i]);
        }
        for(int i=mini;i<maxi;i++)
        {
            if(possible(arr,i,m,k))
                return i;
        }
        return -1;
    }
}
