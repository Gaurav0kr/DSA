package A2ZDSA.Array;

import java.util.ArrayList;
import java.util.List;

public class MoveAllZeroToEnd {

    public static int[] moveAllZero(int[] arr) {

        int n = arr.length;

        List<Integer> templist = new ArrayList<>();

        //first Copy all non-zero to in temp list
        for (int i = 0; i < n;i++) {
            if(arr[i] !=0)
                templist.add(arr[i]);
        }

        // then move all the elements from temp to arr[]
        int nz = templist.size();
        for(int i=0;i<nz;i++)
            arr[i] = templist.get(i);

        //fill the remaining last elements as zero
        for(int i=nz;i<n;i++) {
            arr[i] = 0;
        }
        return arr;
    }
    //Optimal
// first find first zero and assignt it to j and then just next non zero to i and then start swap
    public static int[] moveAllZero_Optimal(int[] arr)
    {
        int j=-1;
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            if(arr[i] ==0)
            {
                j=i;
                break;
            }
        }
        for(int i=j+1 ;i<n; i++)
        {
            if(arr[i] !=0) {
                int temp= arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return arr;
    }
    public static void main(String[] args)
    {
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int[] arr1 = {12,0,1,2,0,333,0,4,5,6};
    //    moveAllZero(arr);
        moveAllZero_Optimal(arr);
        System.out.println("Printing answer");
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+",");
    }
}
