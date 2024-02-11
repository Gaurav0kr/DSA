package leetcode.arrays;

public class J27_RemoveElement {

    public int removeElement(int[] nums, int val)
    {
        if(nums.length==0)
            return 0;
        int k, i=0;
        for(k =0;k<nums.length;k++)
        {
            if(nums[k] !=val)
            {
                nums[i] = nums[k];
                i++;
            }
        }
        return i;
    }
}
