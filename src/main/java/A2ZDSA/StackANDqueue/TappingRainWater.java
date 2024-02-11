package A2ZDSA.StackANDqueue;

public class TappingRainWater {

    public static int rainTrap(int[] arr){
        int n = arr.length;
        int totalWater= 0;
        for(int i=0;i<n;i++){
            int leftmax=0, rightMax=0;
            int j=i;
            while(j>=0){
                leftmax = Math.max(leftmax,arr[j]);
                j--;
            }
            j=i;
            while(j<n){
                rightMax = Math.max(rightMax,arr[j]);
                j++;
            }
            totalWater += Math.min(leftmax,rightMax) -arr[i];
        }
        return totalWater;
    }
    //Better approach using prefix
    public static int rainTrap_2(int[] arr){

        int n = arr.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        prefix[0] = arr[0];
        suffix[n-1] = arr[n-1];
        int waterTrapped = 0;

        for(int i=1;i<n;i++)
            prefix[i] = Math.max(prefix[i-1],arr[i]);

        for(int i=n-2;i>=0;i--)
            suffix[i] = Math.max(suffix[i+1],arr[i]);

        for(int i=0;i<n;i++){
            waterTrapped += Math.min(prefix[i],suffix[i])-arr[i];
        }
        return waterTrapped;
    }

    // Using two pointer

    public static int rainTrap_3(int[] arr) {
        int n = arr.length;
        int left = 0, right = n - 1;
        int leftMax = 0, rightMax = 0;
        int res = 0;

        while (left <= right) {
            if (arr[left] <= arr[right]) {
                if (arr[left] >= leftMax)
                    leftMax = arr[left];
                else
                    res += leftMax - arr[left];
                left++;
            } else {
                if (arr[right] >= rightMax)
                    rightMax = arr[right];
                else
                    res += rightMax - arr[right];
                right--;
            }
        }
        return res;
    }

    public static void main(String args[]) {
        int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("Total water it can contain " + rainTrap_3(arr));
    }
}
