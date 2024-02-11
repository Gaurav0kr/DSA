package A2ZDSA.Array;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayWithGivenSumK {

    public static int findLongestSubArray_Brute(int[] arr, long k)
    {
        int n = arr.length, len =0;

        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                // add all the elements of subarray = a[i...j]:
                long s=0;
                for(int p=i;p<=j;p++)
                    s += arr[p];

                if(s==k)
                    len = Math.max(len , j-i+1);
            }
        }
        return len;
    }
    public static int findLongestSubArray_Brute_2(int[] arr, long k)
    {
        int n = arr.length, len =0;

        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                // add all the elements of subarray = a[i...j]:
                long s=0;
                s += arr[j];
                if(s==k)
                    len = Math.max(len , j-i+1);
            }
        }
        return len;
    }
    public static int findLongestSubArray_Better(int[] arr, long k) //TS , SC
    {
        int n = arr.length;
        Map<Long,Integer> preSumMap= new HashMap<>();
        long sum= 0;
        int maxLen =0;
        for(int i=0;i<n;i++)
        {
            sum += arr[i];
            if(sum==k)
                maxLen = Math.max(maxLen, i+1);
            long rem = sum-k;
            if(preSumMap.containsKey(rem))
            {
                int len = i-preSumMap.get(rem);
                maxLen = Math.max(len, maxLen);
            }
            if(!preSumMap.containsKey(sum))
                preSumMap.put(sum,i);
        }
        return maxLen;
    }
    public static int findLongestSubArray_Optimal(int[] arr, long k)
    {
        int n = arr.length;
        long sum = arr[0];
        int left =0, right =0;
        int maxLen = 0;
        while(right <n)
        {
            //if sum is greater than k then reduce the sum from left side
            // untill it become k or less to k
            while(left<=right && sum >k) {
                sum -= arr[left];
                left++;
            }
            // if sum = k update the maxlen
            if(sum==k)
                maxLen = Math.max(maxLen, right-left+1);
            //move forward to right pointer
            right++;
            if(right<n)
                sum +=arr[right];
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] a = {2, 3, 5,1,1,1,1, 1, 9,2,2,2,4};
        long k = 10;
  //      int len = findLongestSubArray_Brute(a, k);  //TS O(n3), SC O(1)
  //      int len = findLongestSubArray_Brute_2(a,k);  //TS O(n2), SC O(1)
  //      int len = findLongestSubArray_Better(a,k); // TC O(nlogn)  // SC O(N)
        int len = findLongestSubArray_Optimal(a,k); //TC O(2N)  //SC O(1)
        System.out.println("The length of the longest subarray is: " + len);
    }
}
