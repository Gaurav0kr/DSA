package A2ZDSA.Array;

import java.util.ArrayList;

public class CountInversion {

    public static int countInversion_Brute(int[] arr)
    {
        int n = arr.length;
        int count =0;
        for(int i=0;i<n;i++)
        {
            for(int j = 1;j<n;j++)
            {
                if(arr[i]>arr[j])
                    count++;
            }
        }
        return count;
    }

    // Using MERGE sort

    public static int merge(int[] arr, int low, int mid, int high)
    {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;

        int count =0;  // Modification 1

        //Sorting elements in temp array in sorted manner
        while(left<=mid && right <= high)
        {
            if(arr[left] <= arr[right])
            {
                temp.add(arr[left]);
                left++;
            }
            else {
                temp.add(arr[right]);
                count += (mid-left +1); // Modification 2
                right++;
            }
        }
        // if elements in left half are still left
        while(left<=mid)
        {
            temp.add(arr[left]);
            left++;
        }
        // if elements in right half are still left
        while(right <=high)
        {
            temp.add(arr[right]);
            right++;
        }
        // transfering all elements from temporary to arr //
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
        return count;
    }
    public static int mergeSort(int[] arr, int low, int high) {
        int cnt = 0;
        if (low >= high) return cnt;
        int mid = (low + high) / 2 ;
        cnt += mergeSort(arr, low, mid);  // left half
        cnt += mergeSort(arr, mid + 1, high); // right half
        cnt += merge(arr, low, mid, high);  // merging sorted halves
        return cnt;
    }
    public static int countInversion_Optimal(int[] arr)
    {
        return mergeSort(arr, 0, arr.length-1);
    }
    public static void main(String[] args) {
        int[] a = {5, 4, 3, 2, 1};

    //    int cnt = countInversion_Brute(a);  // TC - O(N2) , SC- O(1)
      int cnt = countInversion_Optimal(a);
        System.out.println("The number of inversions is:: " + cnt);
    }
}
