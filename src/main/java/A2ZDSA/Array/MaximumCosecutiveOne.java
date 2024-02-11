package A2ZDSA.Array;

class MaximumConsecutiveOne {
    public static int maxConsecutiveOne(int[] arr)
    {
        int count=0;
        int max =0;
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==1)
            {
                count=count+1;
                max = Math.max(max,count);
            }
            else
            {
                count=0;
            }
        }
        return max;
    }
    public static void main(String args[]) {

        int arr[] = {1,1,1,1,1,1,1,1, 0,1, 0, 1, 1, 1,3,3,3,3,3,1,4,1,1,1,1,1,1,1};

        System.out.println("maximumConsecutiveOne is "+maxConsecutiveOne(arr));

    }
}
