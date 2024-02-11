package A2ZDSA.Array;

import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args)
    {
        int[] arr = {2,10,0,1,3,9};
    //    System.out.print("Brute 2nd Largest Element = "+secondLargest_brute(arr));
    //    System.out.print("Better 2nd Largest Element = "+secondLargest_better(arr));
        System.out.print("Optimal 2nd Largest Element* = "+secondLargest_Optimal(arr));
    }
    //Brute
    public static int secondLargest_brute(int[] arr)
    {
        Arrays.sort(arr);
       int n = arr.length;
       int secondLargest=-1;
        for(int i=n-1;i>0;i--)
        {
            if(arr[i]>arr[i-1]) {
                secondLargest = arr[i-1];
                break;
            }
        }
        return secondLargest;
    }
    //Better
    public static int secondLargest_better(int[] arr)
    {
        int max = arr[0];
        int sLargest= -1;
        int n = arr.length;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
                max=arr[i];
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]>sLargest && arr[i] !=max)
                sLargest= arr[i];
        }
        return sLargest;
    }
    //Optimal
    public static int secondLargest_Optimal(int[] arr) {
        int largest = arr[0];
        int sLargest = -1;  //2,10,0,1,3,9
        int n = arr.length;
        for(int i = 1; i < n; i++) {
            if(arr[i]>largest) {
                sLargest = largest;
                largest = arr[i];
            }
           else if(arr[i] < largest && arr[i] > sLargest)
               sLargest= arr[i];
        }
        return sLargest;
    }
}
