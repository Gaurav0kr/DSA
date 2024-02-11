package A2ZDSA.Array;

import java.util.Arrays;

public class SecondSmallestElement {
    public static void main(String[] args)
    {
        int[] arr = {2,0,10};

        System.out.print("Optimal 2nd Largest Element* = "+secondSmallest_Optimal(arr));
    }

    //Optimal
    public static int secondSmallest_Optimal(int[] arr) {
        int min = arr[0];
        int smin = -1;  //2,10,0,1,3,9
        int n = arr.length;
        for(int i = 1; i < n; i++) {
            if(arr[i]<min) {
                smin = min;
                min = arr[i];
            }
           else if(arr[i] < smin && arr[i] != min)
               smin= arr[i];
        }
        return smin;
    }
}
