package A2ZDSA.Random;

public class NiceSubArray {
    public static void main(String[] args) {
        int[] nums = {2, 2, 2, 1, 2, 2, 1, 2, 2, 2};
        int k = 2;

        int result = numberOfSubarrays(nums, k);

        System.out.println("Output: " + result);
    }

    public static int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length;
        int[] prefixCount = new int[n + 1];
        prefixCount[0] = 1;
        int sum = 0;
        int count = 0;

        for (int num : nums) {
            sum += num % 2;
            if (sum >= k) {
                count += prefixCount[sum - k];
            }
            prefixCount[sum]++;
        }

        return count;
    }
}
