package A2ZDSA.Array;

import java.util.ArrayList;

public class MaxSubArraySumInArray {

    public static int maxSubArraySum_Brute(int[] arr)
    {
        int n= arr.length;
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int sum =0;
                for(int k=i;k<j;k++)
                {
                   sum +=arr[k];
                }
                maxi = Math.max(maxi,sum);
            }
        }
        return maxi;
    }
    public static int maxSubArraySum_Better(int[] arr) {
        int n = arr.length;
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int sum=0;
            for(int j=i;j<n;j++)
            {
                sum += arr[j];
                maxi= Math.max(maxi,sum);
            }
        }
        return maxi;
    }
    //Kadan's Algo
    public static int maxSubArraySum_Optimal(int[] arr) {
        int n = arr.length;
        int sum =0;
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if(sum>maxi)
                maxi=sum;
            if(sum<0)
                sum= 0;
        }
        // To consider the sum of the empty subarray
        // uncomment the following check:

        //if (maxi < 0) maxi = 0;
        return maxi;
    }
    public static int printMaxSubArraySum_Optimal(int[] arr) {
        int n = arr.length;
        int maxi = Integer.MIN_VALUE;
        int sum =0, start =0;

        int ansStart =-1, ansEnd =-1;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if(sum==0)
                start =i;

            if(sum>maxi) {
                maxi = sum;
                ansStart = start;
                ansEnd = i;
            }
            if(sum<0)
                sum= 0;
        }
        System.out.print("The subarray is: [");
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");
        System.out.println();
        // To consider the sum of the empty subarray
        // uncomment the following check:

        //if (maxi < 0) maxi = 0;
        return maxi;
    }

    public static void main(String args[]) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
    //    long maxSum = maxSubArraySum_Optimal(arr); // TS O(N), SC O(1)
        long maxSum =   printMaxSubArraySum_Optimal(arr);
        System.out.println("The maximum subarray sum is: " + maxSum);

    }
}
