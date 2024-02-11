package A2ZDSA.StackANDqueue;

import java.util.Stack;

public class Nearest_Smaller_Element {

    public static int[] findPSE(int[] nums){

        int n = nums.length;
        int[] pse = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {

            while (st.isEmpty() == false && st.peek() >= nums[i])
                st.pop();
            if (i < n) {
                if (st.isEmpty() == false)
                    pse[i] = st.peek();
                else
                    pse[i] = -1;
            }
            st.push(nums[i]);
        }
        return pse;
    }

    public static void main(String args[]) {
     int[] arr={4, 5, 2, 10, 8};

        int arr2[] = findPSE(arr);
        System.out.println("The next greater elements are ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

    }
}
