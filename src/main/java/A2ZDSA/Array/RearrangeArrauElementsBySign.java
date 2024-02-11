package A2ZDSA.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public class RearrangeArrauElementsBySign {

    public static int[] rearrange_Brute(int[] arr)
    {
        int n = arr.length;
        // Define 2 vectors, one for storing positive
        // and other for negative elements of the array.
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            if(arr[i]>0)
                pos.add(arr[i]);
            else
                neg.add(arr[i]);
        }
        for(int i=0;i<n;i++)
        {
            arr[2*i] = pos.get(i);
            arr[(2*i) +(1)]= neg.get(i);
        }
        return arr;
    }
    public static ArrayList<Integer> rearrange_Optimal(int[] arr)
    {
        int n = arr.length;

        ArrayList<Integer> ans =new ArrayList<>(Collections.nCopies(n,0));

        int posIndex = 0, negIndex = 1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>0) {
                ans.set(posIndex,arr[i]);
                posIndex = posIndex+2;
            }
            else
            {
                ans.set(negIndex,arr[i]);
                negIndex = negIndex+2;
            }
        }

        return ans;
    }

    //Variety Two when positive and negatives are not equal
    public static int[] rearrange_Brute_Variety2(int[] arr)
    {
        int n = arr.length;
        // Define 2 Arrays, one for storing positive
        // and other for negative elements of the array.
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            if(arr[i]>0)
                pos.add(arr[i]);
            else
                neg.add(arr[i]);
        }
        if(pos.size()> neg.size())
        {
            for(int i=0;i<neg.size();i++)
            {
                arr[2*i] = pos.get(i);
                arr[(2*i) +(1)]= neg.get(i);
            }
            int index = neg.size()*2;
            for(int i=neg.size();i<pos.size();i++)
            {
                arr[index]=pos.get(i);
                index++;
            }
        }
        else
        {
            for(int i=0;i<pos.size();i++)
            {
                arr[2*i] = pos.get(i);
                arr[(2*i) +(1)]= neg.get(i);
            }
            int index = pos.size()*2;
            for(int i=pos.size();i<neg.size();i++)
            {
                arr[index]=neg.get(i);
                index++;
            }
        }

        return arr;
    }
    public static void main(String args[])
    {
    //    int A[]= {1,2,-4,-5};
        int A[] ={1,-2,-4,-5,-6,7,8};
        int[]ans =  rearrange_Brute_Variety2(A);
    //    int[]ans= rearrange_Brute(A);
          for (int i = 0; i < A.length; i++) {
            System.out.print(ans[i]+" ");
        }
       /* ArrayList<Integer> ans = rearrange_Optimal(A);
          for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i)+" ");
        }*/
    }
}
