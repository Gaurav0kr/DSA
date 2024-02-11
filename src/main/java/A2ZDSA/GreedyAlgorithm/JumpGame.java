package A2ZDSA.GreedyAlgorithm;

public class JumpGame {

    public static boolean canJump(int[] nums) {
        int target=0;
        for(int i=0;i<nums.length;i++){
            if(i>target)
                return false;
            target = Math.max(target,i+ nums[i]);
        }
        return true;
    }
    public static void main(String[] args){
        int[] arr = {2,3,1,1,4};
        System.out.println("Answer is : "+canJump(arr));
    }
}
