package random.String;

import java.util.Arrays;
import java.util.Stack;

public class StringReverse {

    public static String reverseStr( String s)
    {
        char[] ch = s.toCharArray();

        int n = s.length();
        for(int i=0;i<n/2;i++)
        {
            char  temp = ch[i];
            ch[i] = ch[n-1-i];
            ch[n-1-i] = temp;
        }
        String reverseS = new String(ch);
        return reverseS;
    }

    public static String reverseStringUsingStack(String s)
    {
        Stack<Character> st = new Stack<>();
        for(char c:s.toCharArray()){
            st.push(c);
        }
        String temp="";
        while(!st.isEmpty())
        {
            temp += st.pop();
        }
        return temp;
    }
    public static void main(String[] args)
    {
        String str = "Gaurav";
        System.out.println("without reverse String is "+str);
        ;
        System.out.println(reverseStringUsingStack(str));
    }
}
