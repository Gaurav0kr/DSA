package A2ZDSA.Array;

import A2ZDSA.Sorting.InsertionSort;

public class LargestElement {
    public static void main(String[] args)
    {
        int[] arr = {2,1,3,9,5,10,8,6};
        LargestElement se = new LargestElement();
            System.out.print("Largest Element = "+se.findLargest(arr));
    }
    public static int findLargest(int[] arr)
    {
        int max = arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
                max=arr[i];
        }
        return max;
    }
}
