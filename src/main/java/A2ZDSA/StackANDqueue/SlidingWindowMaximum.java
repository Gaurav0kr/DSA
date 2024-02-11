package A2ZDSA.StackANDqueue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class SlidingWindowMaximum {
    public static int[] maxSlidingWindow(int[] arr, int k){
        int n = arr.length;
        int[] ans = new int[n-k+1];
        int left =0, right = 0;

        while(right<k-1)
            right++;

        int i=0;
        while(right<n){
            ans[i]=getMax(left,right,arr);
            i++;
            left++;
            right++;
        }
        return ans;
    }
    public static int getMax(int l, int r, int[] window){
        int max = Integer.MIN_VALUE;
        for(int i=l;i<=r;i++)
            max = Math.max(max,window[i]);
        return max;
    }

    // Optimal approach
    public static int[] maxSlidingWindow_2(int[] arr, int k){
        int n = arr.length;
        int[] result = new int[n-k+1];
        int ri=0;
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i=0;i<n;i++){

            if(!dq.isEmpty() && dq.peek() == i-k)
                dq.poll();
            while(!dq.isEmpty() && arr[dq.peekLast()] < arr[i])
                dq.pollLast();

            dq.offer(i);
            if(i>=k -1)
                result[ri++] = arr[dq.peek()];
        }
        return  result;
    }
    public static void main(String args[]) {
        int  k = 3;
        int arr[]={4,0,-1,3,5,3,6,8};

        int[] ans = maxSlidingWindow_2(arr, k);
        System.out.println("Maximum element in every " + k + " window ");
        for (int i = 0; i < ans.length; i++)
            System.out.print(ans[i] + "  ");

    }
}
