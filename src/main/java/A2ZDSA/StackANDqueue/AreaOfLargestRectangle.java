package A2ZDSA.StackANDqueue;

import java.util.Stack;

public class AreaOfLargestRectangle {

    public static int largestarea(int arr[]){
        int maxArea=0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            int minHeight=Integer.MAX_VALUE;
            for(int j=i;j<n;j++){
                minHeight = Math.min(minHeight,arr[j]);
                maxArea = Math.max(maxArea,(minHeight *(j-i+1)));
            }
        }
        return maxArea;
    }
    // Optimal Approach
    public static int largestarea_1(int heights[]){

        int n=heights.length;
        Stack<Integer> st = new Stack<>();
        int[] leftArr = new int[n];
        int[] rightArr = new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.isEmpty()) leftArr[i]=0;
            else leftArr[i] = st.peek()+1;
            st.push(i);
        }
        //clear stack
        while(!st.isEmpty())
            st.pop();

        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.isEmpty()) rightArr[i]=n-1;
            else rightArr[i] = st.peek()-1;
            st.push(i);
        }
        int maxA=0;
        for(int i=0;i<n;i++)
            maxA=Math.max(maxA, (heights[i] *(rightArr[i]- leftArr[i] +1)));

            return maxA;

    }
    //Most efficient in One Pass
    public static int largestArea_3(int[] heights){
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        int maxA = 0;
        for(int i=0;i<=n;i++){
            while(!st.isEmpty() && (i==n || heights[st.peek()]>= heights[i])) {
                int high = heights[st.peek()];
                st.pop();
                int width;
                if(st.isEmpty()) width=i;
                else width= i-st.peek() -1;
                maxA = Math.max(maxA, width*high);
            }
            st.push(i);
        }
       return maxA;
    }

    public static void main(String args[]) {
        int arr[] = {2, 1, 5, 6, 2, 3, 1};
        System.out.println("The largest area in the histogram is " + largestArea_3(arr)); // Printing the largest rectangle area

    }
}
