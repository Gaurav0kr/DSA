package A2ZDSA.BasicMath;

import static java.lang.Math.log10;

public class ReverseNumber {
    public static int reverseNum(int n) {
        int reverse = 0;
        int lastDigit;
        while (n > 0) {
            lastDigit = n % 10;
            n = n / 10;
            reverse = reverse*10 +lastDigit;
        }
        return reverse;
    }
    public static void main(String args[])
    {

        System.out.println( reverseNum(7789));
    }
}
