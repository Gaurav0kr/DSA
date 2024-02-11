
package A2ZDSA.StackANDqueue;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NGE_I_Leetcode496 {

    public static int[] nge(int[] nums1, int[] nums2){
        int n1= nums1.length, n2= nums2.length;
        int[] ans = new int[n1];

        for(int i=0;i<n1;i++){
            int j = n2-1, nge = -1;
            while(j>=0 && nums2[j] !=nums1[i]){
                if(nums2[j] >nums1[i]) {
                    nge = nums2[j];
                }
                j--;
            }
            ans[i]=nge;
        }
        return ans;
    }
    //Optimal
    public static int[] nge_optimal(int[] nums1, int[] nums2){
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();

        for(int num2:nums2){
            while(!st.isEmpty() && st.peek() <=num2)
                map.put(st.pop(),num2);
            st.push(num2);
        }
        for(int i=0;i<nums1.length;i++){
            nums1[i] = map.getOrDefault(nums1[i],-1);
        }
        return nums1;
    }
    public static void main(String args[]) {
        int[] arr1={4,1,2};
        int[] arr2={1,3,4,2};
        int[] ans = nge_optimal(arr1,arr2);
        System.out.println("The next greater elements are ");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }

    }
}
