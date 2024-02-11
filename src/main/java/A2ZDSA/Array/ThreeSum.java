package A2ZDSA.Array;

import java.util.*;

public class ThreeSum {

    public static List<List<Integer>> trplet_Brute(int[] nums)
    {
        int n = nums.length;
        Set<List<Integer>> st = new HashSet<>();

        for(int i =0;i<n;i++) {
            for(int j =i+1;j<n;j++) {

                for(int k = j + 1; k < n; k++) {

                    if (nums[i] + nums[j] + nums[k]==0) {
                        List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k]);
                        temp.sort(null);
                        st.add(temp);
                    }
                }
            }
        }
        List<List<Integer> > ans = new ArrayList<>(st);
        return ans;
    }
    public static List<List<Integer>> trplet_Better(int[] nums)
    {
        int n = nums.length;
        Set<List<Integer>> st = new HashSet<>();
        for(int i=0;i<n;i++)
        {
            Set<Integer> hashset = new HashSet<>();
            for(int j=i+1;j<n;j++)
            {
                int third = -(nums[i] +nums[j]);
                // Find the element into HashSet
                if(hashset.contains(third))
                {
                    List<Integer> temp = Arrays.asList(nums[i],nums[j], third);
                    temp.sort(null);
                    st.add(temp);
                }
                hashset.add(nums[j]);
            }
        }
        // store the set elements in the answer:
        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
    }
    public static List<List<Integer>> trplet_Optimal(int[] nums)
    {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0;i<n;i++)
        {
            if(i !=0 && nums[i] ==nums[i-1])
                continue;
            //Moving two pointers
            int j = i+1;
            int k = n-1;
            while(j<k)
            {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum <0)
                    j++;
                else if(sum>0)
                    k--;
                else {
                    List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    //skip the duplicates:
                    while(j < k && nums[j] == nums[j - 1]) j++;
                    while(j < k && nums[k] == nums[k + 1]) k--;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, -1, -4};
        int n = arr.length;
        List<List<Integer>> ans = trplet_Optimal(arr);
        for (List<Integer> it : ans) {
            System.out.print("[");
            for (Integer i : it) {
                System.out.print(i + " ");
            }
            System.out.print("] ");
        }
        System.out.println();
    }
}
