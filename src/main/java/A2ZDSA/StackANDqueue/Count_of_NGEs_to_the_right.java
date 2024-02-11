package A2ZDSA.StackANDqueue;

import java.util.Stack;

public class Count_of_NGEs_to_the_right {

    public static int[] countNGE1(int[] arr, int[] queries){

        int n = arr.length;
        int q = queries.length;
        int[] ans = new int[q];
        for(int i=0;i<q;i++){
            int index = queries[i];
            for(int j= index+1;j<n;j++){
                if(arr[j]>arr[index])
                    ans[index]++;
            }
        }
        return ans;
    }
    public static int[] countNGE(int[] nums1, int[] nums2){
        int n = nums1.length;
        int ql = nums2.length;
        int[] ans = new int[n];

        Stack<Integer> st = new Stack<>();
        for(int i = n-1;i>=0;i--){

            while(st.isEmpty()==false && st.peek()<=nums1[i])
                st.pop();
            if(i<n){
                if(st.isEmpty()==false)
                    ans[i]= st.size();
                else
                    ans[i]= -1;
            }
            st.push(nums1[i]);
        }
        return ans;
    }
    public static void main(String args[]) {
        int[] arr={5, 2, 10, 4,3,6};
        int[] query={0, 1};
        int arr2[] = countNGE1(arr,query);
        System.out.println("The next greater elements are ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

    }
}
