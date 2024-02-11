package A2ZDSA.SlidingWindowAND_TwoPointer;

public class MaximumPointsYouCanObtainfromCards {

    public static int maxScore(int[] nums, int k){

        int n = nums.length;
        int currsum=0, totalsum=0, minsubarray=0;
        for(int i=0;i<n;i++){

            totalsum += nums[i];
            currsum += nums[i];

            if(i<n-k)
                minsubarray += nums[i];
            else {
                currsum -= nums[i-(n-k)];
                minsubarray = Math.min(minsubarray,currsum);
            }
        }
        return totalsum - minsubarray;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,1};
        int k =3;
        System.out.println("Max of K elementsSum = "+maxScore(arr,k));
    }
}
