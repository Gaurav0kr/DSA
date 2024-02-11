package A2ZDSA.BinarySearch.Answer;

import java.util.Arrays;

public class AggressiveCows {

    public static int aggressiveCow(int[] stall, int k)
    {
        int n = stall.length;
        Arrays.sort(stall);
        int limit = stall[n-1]-stall[0];

        for(int i=1;i<=limit;i++)
        {
            if(canWePlace(stall,i,k)==false)
                return i-1;
        }
        return limit;
    }
    public static boolean canWePlace(int[] stall, int distance, int NumberOfCows)
    {
        int n = stall.length;
        int countcows =1;
        int last = stall[0];
        for(int i=1;i<n;i++)
        {
            if(stall[i]-last >= distance)
            {
                countcows++;
                last = stall[i];
            }
            if(countcows>=NumberOfCows)
                return true;
        }
        return false;
    }
}
