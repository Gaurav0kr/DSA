package A2ZDSA.Array;

public class SortArrayOf0s1s2s {

    public static int[] sortArray_Better(int[] arr) {
        int count0 = 0, count1 = 0, count2 = 0;
        int n = arr.length;
        for (int i = 0; i < n;i++)
        {
            if(arr[i]==0) count0++;
            else if(arr[i]==1) count1++;
            else if(arr[i]==2) count2++;
        }
        for(int i=0;i<count0;i++)
            arr[i]=0;
        for(int i=count0;i<count0+count1;i++)
            arr[i]=1;
        for(int i=count0+count1;i<n;i++)
            arr[i]=2;
        return arr;
    }
    public static int[] sortArray_optimal(int[] arr)
    {
        int n = arr.length;
        int low=0, mid =0, high = n-1;
        while(mid<=high)
        {
            if(arr[mid]==0) {
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                low++;
                mid++;
            }
            else if(arr[mid]==1)
                mid++;
            else
            {
                int temp= arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] a = {0, 2, 1, 2, 0, 1};
    //    sortArray_Better(a); // O(2N)
        sortArray_optimal(a);
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+",");
    }
}
