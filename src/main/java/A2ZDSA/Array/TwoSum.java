package A2ZDSA.Array;

import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum_Brute(int[] arr, int target)
    {
        int[] ans = new int[2];
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                    continue;
                if(arr[i] + arr[j]==target)
                {
                    ans[0] =i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }
    public static int[] twoSum_Brute_2(int[] arr, int target)
    {
        int[] ans = new int[2];
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i] + arr[j]==target)
                {
                    ans[0] =i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }
    public static int[] twoSum_Better_1(int[] arr, int target)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] ans = new int[2];
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            map.put(arr[i],i);
            int a = arr[i];
            int more = target-a;
            if(!map.containsKey(more))
                continue;
            else {
                ans[1] = map.get(more);
                ans[0] = map.get(a);
            }

        }
        return ans;
    }
    public static void main(String[] args) {
        int[] a = {2,6,5,8,11};
        int k = 14;

     //   int[] ans = twoSum_Brute_1(a,k); //TC O(N2)  //SC O(2)
    //    int[] ans =  twoSum_Brute_2(a,k); //TC O(N2)  //SC O(2)
          int[] ans =  twoSum_Better_1(a,k); //TC O(NlogN)  //SC O(N)
        System.out.println("Indexes are : "+ans[0]+","+ans[1]);
    }
}
