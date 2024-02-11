package A2ZDSA.Array;

public class LeftRotateArray {
    public static void main(String[] args)
    {
        int[] arr = {1,15,2,9,3,4,4,5,6};
        int k=3;
    //    leftRotateByOne(arr);
    //    leftRotateByK(arr,k);
        leftRotateByK_Optimal(arr,k);
        for(int i=1;i<arr.length;i++)
        System.out.print(arr[i]+",");
    }
    public static int[] leftRotateByOne(int[] arr)
    {
        int temp = arr[0];
        int n = arr.length;
        for(int i=1;i<n;i++)
            arr[i-1] = arr[i];
        arr[n-1]=temp;
        return arr;
    }
    //Better ->>>left Rotate by k elements
    public static int[] leftRotateByK(int[] arr, int k)
    {
        int[] temp = new int[k];
        int n = arr.length;
        //Store first k elements into temp[]
        for(int i=0;i<k;i++)
            temp[i] = arr[i];
        //move element which are present after k places to begning
        for(int i=k;i<n;i++)
            arr[i-k] = arr[i];
        //place temp array element into arr[]
        for(int i= n-k;i<n;i++)
            arr[i] = temp[i-(n-k)];
        return arr;
    }
    //Optimal Approach ->>>left Rotate by k elements
    public static int[] leftRotateByK_Optimal(int[] arr, int k)
    {
        //reverse first k elements, reverse elements which are present after k position & now reverse both of them
        int n = arr.length;
        //reverse first k elements
        reverse(arr,0,k-1);
        //reverse elements after k position
        reverse(arr,k,n-1);
        //Now reverse complete array
        reverse(arr,0,n-1);
        return arr;
    }
    //function for reverse of an array
    public static void reverse(int[] arr, int start, int end)
    {
        while(start<=end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
