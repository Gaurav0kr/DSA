package A2ZDSA.Array;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSequence {


    public static boolean linearSearch(int[] arr,int num)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==num)
                return true;
        }
        return false;
    }
    public static int findLongesConSeq_Brute(int[] arr)
    {
        int n = arr.length;
        int longest =1;
        for(int i=0;i<n;i++)
        {
            int x= arr[i];
            int count =1;

            // do the leaner search for next element ie, arr[i+1)
            while(linearSearch(arr, x+1)==true)
            {
                x +=1;
                count += 1;
            }
            longest = Math.max(count,longest);
        }
        return longest;
    }
    public static int findLongesConSeq_Optimal(int[] arr)
    {
        HashSet<Integer> set = new HashSet<>();
        int longest =1;
        int n = arr.length;

        for(int i=0;i<n;i++)
        {
           set.add(arr[i]);
        }
        // Find the longest sequence
        for(int it : set)
        {
            // if 'it' is a starting number
            if(!set.contains(it-1))
            { // find consecutive numbers
                int count =1;
                int x=it;
                while(set.contains(x+1))
                {
                    x=x+1;
                    count = count+1;
                }
                longest = Math.max(longest,count);
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        int[] a = {100, 200, 1, 2, 5,6, 4};
     //   int ans = findLongesConSeq_Brute(a); // O(N2), O(1)
    //    int ans = findLongesConSeq_Better(a);  // O(NlogN), O(1)
      int ans = findLongesConSeq_Optimal(a);    // O(3N), O(N)

        System.out.println("The longest consecutive sequence is " + ans);
    }
}
