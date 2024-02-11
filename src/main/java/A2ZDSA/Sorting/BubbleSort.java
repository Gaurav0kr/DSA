package A2ZDSA.Sorting;

public class BubbleSort {
    public void bubble_1(int[] arr)
    {
        int n = arr.length;
        for(int i=n-1;i>=1;i--)
        {
            int didSwap=0;
            for(int j = 0;j<=i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                    didSwap=1;
                }
            }
            if(didSwap==0)
                break;
            System.out.println("runs");
        }
    }
    public static void main(String[] args)
    {
      //  int[] arr = {15,2,1,3,9,5,10,8,6,0};
        int[] arr = {1,2,3,4,5,6};
        BubbleSort bs = new BubbleSort();
        bs.bubble_1(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+",");
        }
    }
}
