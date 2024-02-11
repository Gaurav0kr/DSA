package random.Arrays;

public class PailindromeNumber {

    public static boolean isPalindrome(int num)
    {
        if(num<0 || (num!=0  && num%10==0))
            return false;

        int reversed =0;
        int original =num;
        while(num !=0)
        {
            reversed = reversed*10 + num%10;
            num = num/10;
        }
        return original == reversed;
    }
    public static void main(String[] args)
    {
        int number1 = 121;
        int number2 = 123123;
        System.out.println(isPalindrome(number2));
    }
}
