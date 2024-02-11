package A2ZDSA.BinarySearch.Answer;

public class SquareRoot {

    public static int findsquareRoot(long N)
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
}
