package A2ZDSA.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeOverlappingInterval {

    public static List<List<Integer>> mergeInterval_Brute(int[][] nums)
    {
        int n = nums.length;
        Arrays.sort(nums, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return a[0]-b[0];
            }
        });

        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int start = nums[i][0];
            int end = nums[i][1];
            //Skip all the merged intervals
            if(!ans.isEmpty() && end<= ans.get(ans.size()-1).get(1))
                continue;

            // Check the rest of the interval
            for(int j = i+1; j<n; j++)
            {
                if(nums[j][0]<= end)
                    end = Math.max(end, nums[j][1]);
                else
                    break;
            }
            ans.add(Arrays.asList(start, end));
        }
        return ans;
    }
    public static List<List<Integer>> mergeInterval_Optimal(int[][] nums)
    {
        int n = nums.length;
        Arrays.sort(nums, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return a[0]-b[0];
            }
        });
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            // if the current interval does not
            // lie in the last interval:
            if (ans.isEmpty() || nums[i][0] > ans.get(ans.size() - 1).get(1)) {
                ans.add(Arrays.asList(nums[i][0], nums[i][1]));
            }
            // if the current interval
            // lies in the last interval:
            else {
                ans.get(ans.size() - 1).set(1,
                        Math.max(ans.get(ans.size() - 1).get(1), nums[i][1]));
            }
        }
        return ans;
    }
}
