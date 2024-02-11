package A2ZDSA.Hashing;

import java.util.HashMap;
import java.util.Map;

public class HighestLowestFrequency {
    public static void main(String[] args) {


    HighestLowestFrequency hlf = new HighestLowestFrequency();
    int arr[] = {2, 3, 4, 2, 3, 4, 2, 6, 8, 9, 8};
    hlf.frequency(arr);
}
    public void frequency(int[] arr)
    {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int maxFreq=0, maxElement=0;
        int minFreq=0, minElement=0;
        for(Map.Entry<Integer,Integer> entry: map.entrySet())
        {
            int count = entry.getValue();
            int element = entry.getKey();
            if(count>maxFreq) {
                maxElement = element;
                maxFreq=count;
            }else
            {
                minElement=element;
                minFreq=count;
            }
        }
        System.out.println(maxElement +"="+maxFreq);
        System.out.println(minElement +"="+minFreq);
    }
}
