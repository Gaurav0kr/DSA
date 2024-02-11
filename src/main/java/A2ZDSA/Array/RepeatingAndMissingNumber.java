package A2ZDSA.Array;

public class RepeatingAndMissingNumber {

    public static int[] findNumbers_Brute(int[] arr)
    {
        int missing =-1;
        int repeating = -1;
        int n = arr.length;
        for(int i=1;i<=n;i++)
        {
            int count=0;
            for(int j=0;j<n;j++) {
                if (arr[j] == i)
                    count++;
            }
            if(count ==2)
                repeating=i;
            else if (count==0)
                missing =i;
            if (repeating != -1 && missing != -1)
                break;
        }
        int[] ans = {repeating, missing};
        return ans;

    }

    public static int[] findNumbers_Better(int[] arr)
    {
        int missing = -1;
        int repeating = -1;
        int n = arr.length;
        int[] hash = new int[n+1];
        for(int i =0;i<n;i++)
            hash[arr[i]]++;
        for(int i =1;i<=n;i++) {
            if (hash[i] == 2)
                repeating = i;
            else if(hash[i]==0)
                missing=i;

            if (repeating != -1 && missing != -1)
                break;
        }
        int[] ans = {repeating, missing};
        return ans;
    }
    public static int[] findNumbers_Optimal_math(int[] arr) {
        long n = arr.length;
        //s-sn = x-y
        //s2 -s2n =

        long sn  = (n*(n+1))/2;
        long s2n = (n*(n+1)*(2*n +1)/6);
        // calculate s and s2
        long s=0, s2=0;
        for(int i=0;i<n;i++)
        {
            s += arr[i];
            s2 += arr[i]*arr[i];
        }
        long val1 = s-sn;
        long val2 = s2-s2n;
        val2 = val2/val1;
        long  x = (val1 + val2)/2;
        long y = x-val1;

        int[] ans = {(int)x, (int)y};
        return ans;
    }
    public static void main(String[] args) {
        int[] a = {3, 1, 2, 5, 4, 6, 7, 5};
//        int[] ans = findNumbers_Brute(a);  // TC - O(N2), SC - O(1)
//        int[] ans = findNumbers_Better(a);  // TC - O(N), SC - O(N)
        int[] ans = findNumbers_Optimal_math(a);
        System.out.println("The repeating and missing numbers are: {"
                + ans[0] + ", " + ans[1] + "}");
    }
}
