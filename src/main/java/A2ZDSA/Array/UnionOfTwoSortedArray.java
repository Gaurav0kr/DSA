package A2ZDSA.Array;

import java.util.*;

public class UnionOfTwoSortedArray {

    public static ArrayList<Integer> unionOfTwo(int[] arr1, int[] arr2)
    {
        Set<Integer> set = new HashSet<>();
        int n1= arr1.length, n2 = arr2.length;
        for(int i=0;i<n1;i++)
            set.add(arr1[i]);
        for(int i=0;i<n2;i++)
            set.add(arr2[i]);

        ArrayList<Integer> union = new ArrayList<>();
        for(int it: set)
            union.add(it);
        return union;
    }

    //use two pointer approach
    public static ArrayList<Integer> unionOfTwo_Optimal(int[] arr1, int[] arr2)
    {
        ArrayList<Integer > union=new ArrayList<>();
     int n1 = arr1.length, n2 = arr2.length;
     int i=0,j=0;
     while(i<n1 && j < n2)
     {
         if (arr1[i] <= arr2[j]) // Case 1 and 2
         {
             if (union.size() == 0 || union.get(union.size() - 1) != arr1[i])
                 union.add(arr1[i]);
             i++;
         }else
         {
             if (union.size() == 0 || union.get(union.size() - 1) != arr2[j])
                 union.add(arr2[j]);
             j++;
         }
     }
     while(i<n1)
     {
         if(union.get(union.size()-1) !=arr1[i])
             union.add(arr1[i]);
         i++;
     }
     while(j<n2)
     {
         if(union.get(union.size()-1) !=arr2[j])
             union.add(arr2[j]);
         j++;
     }
     return union;
    }
    public static void main(String args[]) {
        int n = 10, m = 7;
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arr2[] = {2, 3, 4, 4, 5, 11, 12};
      //  ArrayList<Integer> Union =    unionOfTwo(arr1, arr2);
        ArrayList<Integer> Union =       unionOfTwo_Optimal(arr1,arr2);
        System.out.println("Union of arr1 and arr2 is ");
        for (int val: Union)
            System.out.print(val+" ");
    }
}
