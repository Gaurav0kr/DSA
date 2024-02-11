package A2ZDSA.Array;

import java.util.HashMap;
import java.util.Map;

public class SubArrayWithGivenXOR_k {

    public static int countSubArray(int[] arr, int k)
    {
        int n = arr.length;
        int XR =0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(XR,1);//setting the value of 0.
        int count =0;
        for(int i=0;i<n;i++)
        {
            XR = XR^arr[i]; // prefix XOR till index i:
            int x = XR^k;  // By formula x = XR^k
            // add the occurance of XR^k to the count
            if(map.containsKey(x))
                count += map.get(x);
        //    insert the prefix XR till i into map
            if(map.containsKey(XR))
                map.put(XR,map.get(XR)+1);
            else
                map.put(XR,1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] a = {4, 2, 2, 6, 4};
        int k = 6;
        int ans = countSubArray(a, k);
        System.out.println("The number of subarrays with XOR k is: " + ans);
    }
}
