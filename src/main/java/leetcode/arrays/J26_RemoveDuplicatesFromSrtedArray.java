package leetcode.arrays;

public class J26_RemoveDuplicatesFromSrtedArray {

    public int removeDuplicates(int[] nums)
    {
        if(nums.length==0)
            return 0;
        int k, i=1;
        for(k=1;k<nums.length;k++)
        {
            if(nums[k] != nums[k-1])
            {
                nums[i] =nums[k];
                i++;
            }
        }
        return i;
    }
}
