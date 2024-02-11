package A2ZDSA.Array;

public class StockBuyAndSell {

    public static int findMaxProfit_Brute(int[] arr)
    {
        int n = arr.length;
        int maxPro=0;
        for(int i =0;i<n;i++)
        {
            for(int j =i+1;j<n;j++)
            {
                if(arr[j]> arr[i])
                    maxPro = Math.max(maxPro, arr[j]-arr[i]);
            }
        }
        return maxPro;
    }
    public static int findMaxProfit_Optimal(int[] arr)
    {
        int n = arr.length;
        int maxPro=0;
        int minPrice = Integer.MAX_VALUE;
        for(int i =0;i<n;i++)
        {
            minPrice = Math.min(minPrice, arr[i]);
            maxPro = Math.max(maxPro, arr[i]-minPrice);
        }
        return maxPro;
    }
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};

    //    int maxPro = findMaxProfit_brute(arr);
        int maxPro =   findMaxProfit_Optimal(arr);
        System.out.println("Max profit is: " + maxPro);

    }
}
