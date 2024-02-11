package A2ZDSA.Array;

public class RemoveDuplicates {

    public static void main(String[] args)
    {
        int[] arr = {1,1,2,2,2,3,4,4,5,6};

        System.out.print("size of array after removing duplicates = "+removeDupli(arr));
    }
    public static int removeDupli(int[] arr) {
        int i=0;
        for(int j=1;j<arr.length;j++)
        {
            if(arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }
}
