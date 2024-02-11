package A2ZDSA.Array;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public static int nCr(int n, int r)
    {
        long res =1;
        for(int i =0;i<r;i++)
        {
            res = res * (n-i);
            res = res / (i +1);
        }
        return (int)res;
    }
    public static int calculateSingleElement(int row, int col)
    {
        int ans = (int) nCr(row-1,col-1);
        return ans;
    }

    public static void printPascalRow_naive(int row)
    {
        for(int c =1;c<=row;c++)
        {
            System.out.print(nCr(row-1,c-1)+" ");
        }
        System.out.println();
    }
    public static void printPascalRow_Optimal(int row)
    {
        long ans =1;
        System.out.print(ans + " "); // printing 1st element
        for(int i =1;i<row;i++)
        {
            ans = ans * (row -i);
            ans = ans /i;
            System.out.print(ans+" ");
        }
        System.out.println();
    }

    public static List<List<Integer>> printCompletePascal_Brute(int n)
    {
        List<List<Integer>> ans = new ArrayList<>(); // to store complete pascal Triangle

        for(int row =1;row <=n; row++)
        {
            List<Integer> tempList = new ArrayList<>();  // Temp List
            for(int col =1;col <= row; col++)
            {
                tempList.add(nCr(row-1,col-1));
            }
            ans.add(tempList);
        }
        return ans;
    }
    // Genrate Triangle in Optimal way

    public static List<Integer> generateRow(int row)
    {
        long ans =1;
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add(1); //inserting the 1st element
        for(int i=1;i<row;i++)
        {
            ans = ans * (row-i);
            ans = ans /i;
            ansRow.add((int)ans);
        }
        return ansRow;
    }
    // now generate this for entitre row and column
    public static List<List<Integer>> printPascal_Optimal(int row)
    {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=1;i<=row;i++)
            ans.add(generateRow(i));
        return ans;
    }

    public static void main(String[] args) {
        int r = 5; // row number
        int c = 3; // col number
    //    int element = calculateSingleElement(r, c);
        //    System.out.println("The element at position (r,c) is: " + element);
    //    printPascalRow_naive(5);
    //     printPascalRow_Optimal(6);


        int n = 5;
    //    List<List<Integer>> ans = printCompletePascal_Brute(5);
        List<List<Integer>> ans = printPascal_Optimal(n);
        System.out.println("Gaurav  *"+ans.size());
        for (List<Integer> it : ans) {
            for (int ele : it) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }

}
