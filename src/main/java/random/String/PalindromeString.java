package random.String;

public class PalindromeString {

    public static boolean checkPalindrome(String s)
    {
       int start =0;
       int end = s.length()-1;
       while(start<=end)
       {
           char currFirst = s.charAt(start);
           char currLast = s.charAt(end);
           if(currFirst !=currLast)
               return false;
           start++;
           end--;
       }
       return true;
    }
    public static void main(String[] args)
    {
        String s1 = "abcd";
        String s2 = "abccba";
        String s3 = "abcdcba";

        System.out.println(checkPalindrome(s1));
        System.out.println(checkPalindrome(s2));
        System.out.println(checkPalindrome(s3));
    }
}
