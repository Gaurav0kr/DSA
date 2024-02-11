package leetcode.arrays;

public class J88_MergeSortedArray {

    public void merge(int[] num1, int m, int[] num2, int n)
    {
        int p1 =m-1, p2 = n-1;
        int i= m+n -1;
        while(p2>=0)
        {
            if(p1>=0 & num1[p1]>num2[p2])
                num1[i--] = num1[p1--];
            else
                num1[i--] = num2[p2--];
        }
    }
}
