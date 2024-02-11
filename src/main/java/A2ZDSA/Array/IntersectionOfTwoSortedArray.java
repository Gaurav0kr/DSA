package A2ZDSA.Array;

import java.util.ArrayList;

public class IntersectionOfTwoSortedArray {

    public static ArrayList<Integer> intersectionOfTwo(int[] arr1, int[] arr2)
    {
        ArrayList<Integer> intersection = new ArrayList<>();
        int n1 = arr1.length, n2 = arr2.length;
        int[] visited= new int[n2];
        for(int i=0;i<n1;i++)
        {
            for(int j=0;j<n2;j++)
            {
                if(arr1[i] ==arr2[j] && visited[j]==0)
                {
                    intersection.add(arr1[i]);
                    visited[j]=1;
                    break;
                }
                if(arr2[j] > arr1[i])
                    break;
            }
        }
        return intersection;
    }
    public static ArrayList<Integer> intersectionOfTwo_Optimal(int[] arr1, int[] arr2)
    {
        ArrayList<Integer> intersection = new ArrayList<>();
        int n1= arr1.length, n2 = arr2.length;
        int i=0,j=0;
        while(i<n1 && j <n2)
        {
            if(arr1[i]<arr2[j])
                i++;
            else if(arr2[j]<arr1[i])
                j++;
            else
            {
                intersection.add(arr1[i]);
                i++;
                j++;
            }
        }
        return intersection;
    }
    public static void main(String args[]) {
        int arr1[] = {1, 2, 3, 4, 4, 6, 7,7, 8, 9, 10};
        int arr2[] = {2, 3, 4, 4, 4, 7,11, 12};

//        ArrayList<Integer> intersection =       intersectionOfTwo(arr1,arr2);
        ArrayList<Integer> intersection =        intersectionOfTwo_Optimal(arr1,arr2);
        System.out.println("Intersection of arr1 and arr2 is ");
        for (int val: intersection)
            System.out.print(val+" ");
    }
}
