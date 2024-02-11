package A2ZDSA.Recursion;

public class PalindromeString {

    public boolean palindrome(int left,String str)
    {
        int n= str.length();
        if(left>=n/2)
            return true;
        if(str.charAt(left)!=str.charAt(n-left-1))
            return false;
        return palindrome(left+1,str);
    }
    public static void main(String[] args)
    {
        PalindromeString ps = new PalindromeString();
        String str = "madam";
        System.out.print(ps.palindrome(0,str));
    }
}
