package A2ZDSA.StackANDqueue;

import java.util.Stack;

public class RemoveKdigits {

    public static String removeKdigits(String num, int k){

        StringBuilder sb = new StringBuilder(num);
        while(k>0){

            int i=0;
            //remove peak
            while(i<sb.length() -1 && sb.charAt(i)<sb.charAt(i+1))
                i++;
            //delete the peak;
            sb.deleteCharAt(i);
            k--;
        }
        //remove the leading zero
        while(sb.toString().startsWith("0"))
            sb.deleteCharAt(0);
        return sb.length()==0?"0":sb.toString();
    }
    // Better approach
    public static String removeKdigits_2(String num, int k){

        if(k==num.length())
            return "0";
        Stack<Character> st = new Stack<>();
        int i=0;
        while(i<num.length()){
            while(k>0 && !st.isEmpty() && st.peek()>num.charAt(i)) {
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
            i++;
        }
        // handles the scenario where digits are equal, (1111, k=3)
        while (k > 0 && !st.isEmpty()) {
            st.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty())
            sb.append(st.pop());
        // as STACK is LIFO
        sb.reverse();

        // remove leading white space
        while(sb.toString().startsWith("0"))
            sb.deleteCharAt(0);
        return sb.length()==0?"0":sb.toString();
    }
    public static void main(String[] args){
        String s= "112";
        int k=1;
    //    System.out.println("new String is : "+removeKdigits(s,k));
        System.out.println("new String is : "+removeKdigits_2(s,k));
        //removeKdigits_2
    }
}
