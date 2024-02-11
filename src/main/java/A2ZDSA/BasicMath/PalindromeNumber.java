package A2ZDSA.BasicMath;

public class PalindromeNumber {

    public static boolean palindrome(int n)
    {
        int originalNum =n;
        int reverse=0;
        int ld;
        while(n>0)
        {
            ld = n%10;
            n=n/10;
            reverse = reverse*10 + ld;
        }
        System.out.println(reverse);
        return originalNum==reverse;
    }
    public static void main(String args[])
    {

        System.out.println( palindrome(12156));
    }
}
