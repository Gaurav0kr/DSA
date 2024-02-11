package A2ZDSA.Recursion;

import java.util.Collections;

public class ReverseArray {

    public void reverseArr(int arr[],int start, int end)
    {
        if(start>end )
            return;
        int temp= arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArr(arr,start+1,end-1);
    }
    public void printArray(int arr[], int size)
    {
        System.out.println("Printing reverseArray");
        for (int i=0; i < size; i++)
            System.out.print(arr[i] + " ");
    }
    public static void main(String[] args)
    {
        ReverseArray ra = new ReverseArray();
        int[] arr1 = {1,2,3,4,5};
        int n = 5;
        ra.reverseArr(arr1,0,n-1);
            ra.printArray(arr1,5);
    }
}
