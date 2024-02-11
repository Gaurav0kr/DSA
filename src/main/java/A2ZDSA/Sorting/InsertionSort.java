package A2ZDSA.Sorting;

public class InsertionSort {

    public static void main(String[] args)
    {
        int[] arr = {2,1,3,9,5,10,8,6};
        InsertionSort ss = new InsertionSort();
        ss.insertion(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+",");
        }
    }
    public void insertion(int[] arr)
    {
        int n = arr.length;
        for(int i=0;i<=n-1;i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
                System.out.println("runs");
            }
        }
    }
}
