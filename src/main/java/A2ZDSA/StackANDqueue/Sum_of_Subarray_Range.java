package A2ZDSA.StackANDqueue;


import java.util.Stack;

class Pair3{
    int x;
    int y;
    Pair3(int x, int y){
        this.x = x;
        this.y = y;
    }
}
public class Sum_of_Subarray_Range {

    public static int sumSubarrayMin(int[] arr) {


        long M = (long)1e9 + 7;
        long res=0;
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];

        Stack<Pair3> sLeft = new Stack<>();
        Stack<Pair3> sRight = new Stack<>();

        for(int i=0;i<n;i++){
            int count=1;
            while(!sLeft.isEmpty() && sLeft.peek().x >arr[i]){
                count += sLeft.peek().y;
                sLeft.pop();
            }
            sLeft.push(new Pair3(arr[i],count));
            left[i] = count;
        }
        for(int i=n-1;i>=0;i--){
            int count=1;
            while(!sRight.isEmpty() && sRight.peek().x >=arr[i]){
                count += sRight.peek().y;
                sRight.pop();
            }
            sRight.push(new Pair3(arr[i],count));
            right[i] = count;
        }
        for (int i = 0; i < n; i++) {
            res = ((res + ((long) arr[i] * ((long) left[i] * right[i]) % M) % M) % M);
        }
        return (int)res;
    }
    public static int sumSubarrayMax(int[] arr) {


        long M = (long)1e9 + 7;
        long res=0;
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];

        Stack<Pair3> sLeft = new Stack<>();
        Stack<Pair3> sRight = new Stack<>();

        for(int i=0;i<n;i++){
            int count=1;
            while(!sLeft.isEmpty() && sLeft.peek().x <arr[i]){
                count += sLeft.peek().y;
                sLeft.pop();
            }
            sLeft.push(new Pair3(arr[i],count));
            left[i] = count;
        }
        for(int i=n-1;i>=0;i--){
            int count=1;
            while(!sRight.isEmpty() && sRight.peek().x <=arr[i]){
                count += sRight.peek().y;
                sRight.pop();
            }
            sRight.push(new Pair3(arr[i],count));
            right[i] = count;
        }
        for (int i = 0; i < n; i++) {
            res = ((res + ((long) arr[i] * ((long) left[i] * right[i]) % M) % M) % M);
        }
        return (int)res;
    }
    public static int rangeSum(int[] arr){
        int res = sumSubarrayMax(arr) - sumSubarrayMin(arr);
        return res;
    }
    public static void main(String args[]) {
        int arr[] = {1,2,3};
        System.out.println("Total sum " + rangeSum(arr));
    }
}
