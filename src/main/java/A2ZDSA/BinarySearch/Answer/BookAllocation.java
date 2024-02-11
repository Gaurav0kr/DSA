package A2ZDSA.BinarySearch.Answer;

import java.util.Collections;

public class BookAllocation {
    // arr = 25, 46,28,49,24
    // student = 4;
    public static int findPages(int[] arr, int student) {
        int n = arr.length;
        if (student > n)
            return -1;
        int low = Integer.MIN_VALUE;
        int high = 0;
        for (int i = 0; i < n; i++) {
            low = Math.max(low, arr[i]);
            high += arr[i];
        }
        
        for (int pages = low; pages <= high; pages++)
        {
            if(countStudent(arr,pages) ==student)
                return pages;
        }
        return low;
    }
    public static int countStudent(int[] arr, int pages)
    {
        int student =1, pageStudent =0;
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            if(pageStudent + arr[i] <= pages)
                pageStudent += arr[i];
            else
            {
                student++;
                pageStudent = arr[i];
            }
        }
        return student;
    }

    public static void main(String[] args) {
        int[] arr = {25, 46, 28, 49, 24};
        int student = 4;
    //    int ans = findPages(arr,student);
      int ans = findPages_Binary(arr,student);
        System.out.println("The answer is:: " + ans);
    }
    // using Binary Search
    public static int findPages_Binary(int[] arr, int student) {
        int n = arr.length;
        if (student > n)
            return -1;
        int low = Integer.MIN_VALUE;
        int high = 0;
        for (int i = 0; i < n; i++) {
            low = Math.max(low, arr[i]);
            high += arr[i];
        }
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(countStudent(arr,mid)>student)
                low = mid+1;
            else
                high = mid-1;
        }
        return low;
    }
}
