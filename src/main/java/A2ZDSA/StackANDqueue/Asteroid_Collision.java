package A2ZDSA.StackANDqueue;

import java.util.Stack;

public class Asteroid_Collision {

    public static int[] asteroidCollision(int[] asteroids) {

        int n = asteroids.length;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            if(asteroids[i]>0 || st.isEmpty())
                st.push(asteroids[i]);
            else {
                while (!st.isEmpty() && st.peek() > 0 && st.peek() < Math.abs(asteroids[i])) {
                    st.pop();
                }
                if (!st.isEmpty() && st.peek() == asteroids[i])
                    st.pop();
                else {
                    if (st.isEmpty() || st.peek() < 0)
                        st.push(asteroids[i]);
                }
            }
        }
        int[] res = new int[st.size()];
        for(int i= st.size()-1;i>=0;i--) {
            res[i] = st.peek();
            st.pop();
        }

        return res;
    }
    public static void main(String args[]) {
        int arr[] = {5,10,-5};
        int[] ans = asteroidCollision(arr);
        System.out.println("after collison ");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
