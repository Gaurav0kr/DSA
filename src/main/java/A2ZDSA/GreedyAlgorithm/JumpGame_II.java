package A2ZDSA.GreedyAlgorithm;

public class JumpGame_II {

    public static int jump(int[] nums){
        int max = nums[0], end = nums[0], count =1;
        for(int i=1;i<nums.length-1;i++){
            max = Math.max(max,nums[i]+i);
            if(i==end){
                end = max;
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] arr = {2,3,1,1,4};
        System.out.println("Answer is : "+jump(arr));
    }
}
