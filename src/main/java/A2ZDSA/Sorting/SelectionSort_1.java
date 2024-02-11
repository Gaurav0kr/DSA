package A2ZDSA.Sorting;

public class SelectionSort_1 {

    public void selection_1(int[] arr)
    {
        int n = arr.length;
        for(int i=0;i<=n-2;i++)
        {
            int min=i;
            for(int j =i;j<=n-1;j++)
            {
                if(arr[j]<arr[min])
                    min=j;
            }
            int temp= arr[min];
            arr[min]= arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args)
    {
        int[] arr = {2,1,3,9,5,10,8,6};
        SelectionSort_1 ss = new SelectionSort_1();
        ss.selection_1(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+",");
        }
    }
}
