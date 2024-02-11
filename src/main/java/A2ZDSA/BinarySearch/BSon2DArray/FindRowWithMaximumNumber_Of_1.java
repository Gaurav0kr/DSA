package A2ZDSA.BinarySearch.BSon2DArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class FindRowWithMaximumNumber_Of_1 {

    public static int countMaximum(ArrayList<ArrayList<Integer>> matrix, int n, int m)
    {
        int ctn_max = 0;
        int index = -1;

        for(int i=0;i<n;i++)
        {
            int ctn_Ones =0;
            for(int j =0;j<m;j++)
            {
                ctn_Ones += matrix.get(i).get(j);
            }
            if(ctn_Ones > ctn_max)
            {
                ctn_max = ctn_Ones;
                index =i;
            }
        }
        return index;
    }
    // Optimal solution using BS
    public static int countMaximum_Optimal(ArrayList<ArrayList<Integer>> matrix, int n, int m)
    {
        int ctn_max = 0;
        int index = -1;

        for(int i=0;i<n;i++)
        {
            int ctn_Ones =m-lowerBound(matrix.get(i),m,1);

            if(ctn_Ones > ctn_max)
            {
                ctn_max = ctn_Ones;
                index =i;
            }
        }
        return index;
    }
    public static int lowerBound(ArrayList<Integer> arr, int n, int x)
    {
        int low = 0, high = n - 1;
        int ans = n;
        while(low<=high)
        {
            int mid = (low + high) / 2;
            if(arr.get(mid)>=x) {
                ans = mid;
                // look for smaller index on the left
                high = mid - 1;
            }
            else
                low = mid+1;
        }
        return ans;
    }
    public static void main(String[] args){

        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(0, 1, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(0, 0, 0)));
        matrix.add(new ArrayList<>(Arrays.asList(0, 0, 0)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));

        int n = 4, m = 3;
        /*System.out.println("The row with the maximum number of 1's is: " +
                countMaximum(matrix, n, m));*/
        System.out.println("The row with the maximum number of 1's is : " +
                countMaximum_Optimal(matrix, n, m));
    }
}
