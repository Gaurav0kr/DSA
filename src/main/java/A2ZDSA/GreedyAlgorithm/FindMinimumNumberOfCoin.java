package A2ZDSA.GreedyAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;

public class FindMinimumNumberOfCoin {

    // it can't be solved via greedy algo
    public static int findCoinCount(int[] coins, int v ){

        if(v==0)
            return 0;
        Arrays.sort(coins);

        int n = coins.length; int res = Integer.MAX_VALUE;
        for(int i=n-1;i>=0;i--){

            if(coins[i]<=v){
                int sub_res = findCoinCount(coins, v-coins[i]);
                if(sub_res != Integer.MAX_VALUE && sub_res +1<res)
                    res = sub_res +1;
            }
        }
        return res;
    }


    public static void main(String[] args){
        int[] arr ={1,5,6,9};
        int v =11;
        System.out.println("Number of coin is = "+findCoinCount(arr,v));
    }
}
