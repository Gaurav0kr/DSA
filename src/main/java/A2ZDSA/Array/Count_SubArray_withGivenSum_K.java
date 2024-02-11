package A2ZDSA.Array;

import java.util.HashMap;
import java.util.Map;

public class Count_SubArray_withGivenSum_K {

    public static int countSubArray_Brute(int[] arr, int p)
    {
        int n = arr.length, count =0;

        for(int i=0;i<n;i++)
        {
           for( int j =i;j<n;j++)
           {
               int sum =0;
               for(int k=i;k<=j;k++) {
                   sum += arr[k];
               }
                   if(sum == p)
                       count++;

           }
        }
        return count;
    }
    public static int countSubArray_Better(int[] arr, int p)
    {
        int n = arr.length, count =0;

        for(int i=0;i<n;i++)
        {
            int sum=0;
            for( int j =i;j<n;j++)
            {
                sum += arr[j];
                if(sum == p)
                    count++;
            }
        }
        return count;
    }
    public static int countSubArray_optimal(int[] arr, int k)
    {
        int n =arr.length;
        int preSum =0, count =0;

        Map<Integer,Integer> map = new HashMap<>();

        map.put(0,1); // Setting 0 in the map.
        for(int i=0;i<n;i++)
        {
            preSum += arr[i];  // add current element to prefix Sum
            int remove = preSum -k; // calculate x-k

            count += map.getOrDefault(remove,0); // Add the number of subarrays to be removed

            // Update the count of prefix sum in map
            map.put(preSum, map.getOrDefault(preSum,0)+1);

        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
        int k = 6;
//        int cnt = countSubArray_Brute(arr, k);
//        int cnt = countSubArray_Better(arr, k);
          int cnt = countSubArray_optimal(arr,k);
        System.out.println("The number of subarrays is: " + cnt);
    }
}

