package A2ZDSA.Array;

import java.util.HashMap;
import java.util.Map;

public class MajorityOfElements {

    public static int majority(int[] arr)
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=0;j<n;j++)
            {
                if(arr[j]==arr[i])
                    count++;
            }
            if(count>n/2)
                return arr[i];
        }
        return -1;
    }
    public static int majority_Better(int[] arr)
    {
        Map<Integer,Integer> map = new HashMap<>();
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
       map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet())
        {
            if(entry.getValue()> (n/2)) {
                return entry.getKey();
            }
        }
    return -1;
    }

    //Moore Voting Algo
    public static int majority_Optimal(int[] arr)
    {
        int n = arr.length;
        int count =0;
        int el = 0;
        //Apply algo
        for(int i=0;i<n;i++) {
            if(count==0) {
                count++;
                el = arr[i];
            }
            else if(arr[i]==el)
                count++;
            else
                count--;
        }
        //now check whether our picked element is major or not
        int count1=0;
        for(int i=0;i<n;i++)
        {
         if(arr[i]==el)
             count1++;
        }
        if(count1>n/2)
            return el;
        return -1;
    }
    public static void main(String args[]) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
    //    int ans = majority(arr);  // TS= O(N2)
    //    int ans = majority_Better(arr);  // TS= O(NlogN)  SC=O(N)
        int ans = majority_Optimal(arr);
        System.out.println("The majority element is: " + ans);

    }
}
