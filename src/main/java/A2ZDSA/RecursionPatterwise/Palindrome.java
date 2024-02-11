package A2ZDSA.RecursionPatterwise;

public class Palindrome {


    public static boolean checkStr(String s, int i){
        int n = s.length();
        if(i>=n/2) return true;
        if(s.charAt(i)!=s.charAt(n-i-1)) return false;
        return checkStr(s,i+1);
    }
    public static void main(String[] args){
        String str ="madam";
        String s = "gaurav";
        System.out.println(checkStr(s,0));
    }
}
