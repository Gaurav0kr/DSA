package A2ZDSA.GreedyAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeInterval {

    public static List<List<Integer>> mergeOverLapping(int[][] intervals){

        int n = intervals.length;

        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return a[0]-b[0];
            }
        });
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            int start = intervals[i][0];
            int end = intervals[i][1];

            //Skip all the merged Interval
            if( !ans.isEmpty() && end <= ans.get(ans.size() -1).get(1))
                continue;
            for(int j = i+1;j<n;j++){
                if(intervals[j][0] <=end)
                    end = Math.max(end, intervals[j][1]);
                else
                    break;
            }
            ans.add(Arrays.asList(start,end));
        }
        return ans;
    }

    // Optimal Approach
    public static List<List<Integer>> mergeOverLapping_2(int[][] intervals){

        int n = intervals.length;

        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return a[0]-b[0];
            }
        });
        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0;i<n;i++){
            // If it is empty or not overlapping
            if(ans.isEmpty() || intervals[i][0] > ans.get(ans.size()-1).get(1))
                ans.add(Arrays.asList(intervals[i][0],intervals[i][1]));
            //if It is overlapping
            else
                ans.get(ans.size()-1).set(1, Math.max(ans.get(ans.size()-1).get(1), intervals[i][1]));
        }
        return ans;
    }
}
