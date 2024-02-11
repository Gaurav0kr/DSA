package A2ZDSA.Hashing;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FrequencyArray {
    public static void main(String[] args)
    {   FrequencyArray fa = new FrequencyArray();
        int arr[] = {1,2,3,3,5};
      //  fa.freqArr(arr);
        fa.freqMap(arr);
    }
    int number[] = {12,5,2,3};

    public void freqArr(int[] arr)
    { // freq Array
        int[] hashh = new int[13];
        for(int i=0;i<arr.length;i++)
        {
            hashh[arr[i]]+=1;
        }
        // Print Array
        for(int i=0;i<number.length;i++)
        {
            System.out.println(number[i]+" = "+hashh[number[i]]);
        }
    }
    //UsingHashMap
    public void freqMap(int[] arr)
    {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        //Print
        for(Map.Entry m:map.entrySet())
        {
            System.out.println(m.getKey()+" == "+m.getValue());
        }
    }
}
