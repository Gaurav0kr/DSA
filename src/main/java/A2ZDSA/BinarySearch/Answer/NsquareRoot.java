package A2ZDSA.BinarySearch.Answer;

public class NsquareRoot {

    public static int findNsquareRoot(long N)
    {
        long low = 1, high = N;
        while(low<=high)
        {
            long mid = (low+high)/2;
            if(mid *mid<=N){
                low = (int)mid+1;
            }
            else
                high = (int)mid-1;
        }
        return (int)high;
    }
    // return 1 if == m;
    //return 0 if < m
    // return 2 if > m
    public static int func(int mid, int n , int m)
    {
        long ans =1;
        for(int i=1;i<=n;i++)
        {
            ans = ans *mid;
            if(ans >m)
                return 2;
        }
        if(ans ==m)
            return 1;
        else
            return 0;
    }
    // *************Another way **********
    public static int NthRoot(int n, int m) {
        // Write your code here.

        int low=0, high = m;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(Math.pow(mid, n)==m)
                return mid;
            else if(Math.pow(mid, n)<=m)
                low = mid+1;
            else
                high = mid-1;
        }
        return -1;
    }
}
