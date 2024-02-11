package A2ZDSA.BinarySearch.Answer;

import java.util.ArrayList;
import java.util.List;

public class Median_of_TwoSortedArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2)
    {
        int n1 = nums1.length, n2 = nums2.length;
        int i=0,j=0;
        List<Integer> arr3 = new ArrayList();
        while(i<n1 && j<n2)
        {
            if(nums1[i]<nums2[j])
                arr3.add(nums1[i]++);
            else
                arr3.add(nums2[i]++);
        }
        // Copy the left-out elements
        while (i < n1)
            arr3.add(nums1[i++]);
        while (j < n2) {
            arr3.add(nums2[j++]);
        }
        // Find the median
        int n = n1 + n2;
        if (n % 2 == 1) {
            return (double) arr3.get(n / 2);
        }

        double median = ((double) arr3.get(n / 2) + (double) arr3.get((n / 2) - 1)) / 2.0;
        return median;
    }
    // better approach
    public static double findMedianSortedArrays_better(int[] nums1, int[] nums2)
    {
        int n1 = nums1.length, n2 = nums2.length, n = n1 +n2;
        int ind2 = n/2;
        int ind1 = ind2 -1;
        int count =0;
        int ind1el = -1, ind2el = -1;
// Apply indices
       int i =0, j =0;
        while(i <n1 && j <n2)
        {
            if(nums1[i]<nums2[j])
            {
                if(count == ind1)
                    ind1el = nums1[i];
                if(count == ind2)
                    ind2el = nums1[i];
                count++;
                i++;
            }
            else
            {
                if(count == ind1)
                    ind1el = nums2[j];
                if(count == ind2)
                    ind2el = nums2[j];
                count++;
                j++;
            }
        }
// copy the left out elements
        while(i<n1)
        {
            if(count==ind1) ind1el = nums1[i];
            if(count==ind2) ind2el = nums1[i];
            count++;
            i++;
        }
        while(j<n2)
        {
            if(count==ind1) ind1el = nums2[j];
            if(count==ind2) ind2el = nums2[j];
            count++;
            j++;
        }
        if(n%2==1)
            return (double) ind2el;
        return (double)((double)(ind1el + ind2el))/2.0;
    }
    // Optimal using binary search
    public static double findMedianSortedArrays_Optimal(int[] nums1, int[] nums2)
    {
        int n1 = nums1.length, n2 = nums2.length;
        if(n1>n2)
            return findMedianSortedArrays_Optimal(nums2, nums1);
        int n = n1 +n2;
        int left = (n1 + n2 +1)/2; // length of left half
        // apply binary search
        int low = 0, high = n1;

        while(low<=high)
        {
            int mid1 = (low +high)/2;
            int mid2 = left -mid1;

            int l1 = (mid1>0) ? nums1[mid1-1]: Integer.MIN_VALUE;
            int l2 = (mid2>0) ? nums2[mid2-1]: Integer.MIN_VALUE;
            int r1 = (mid1<n1)? nums1[mid1]: Integer.MAX_VALUE;
            int r2 = (mid2<n2) ? nums2[mid2]:Integer.MAX_VALUE;

            if(l1<=r2 && l2<=r1)
            {
                if(n%2==1)
                    return Math.max(l1,l2);
                else
                    return ((double)(Math.max(l1,l2)+ Math.min(r1,r2)))/2.0;
            }
            else if(l1 >r2)
                high = mid1-1;
            else
                low = mid1+1;
        }
        return 0.0;
    }
    public static void main(String[] args) {
        /*int[] a = {1, 4, 7, 10, 12};
        int[] b = {2, 3, 6, 15};*/
        int[] a ={};
        int[] b = {2,3};
        System.out.println("The median of two sorted arrays is : " + findMedianSortedArrays_Optimal(a, b));
    }
}
