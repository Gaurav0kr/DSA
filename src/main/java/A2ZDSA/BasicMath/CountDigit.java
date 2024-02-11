package A2ZDSA.BasicMath;

import static java.lang.Math.log10;

public class CountDigit {
    public static int countDigi(int n)
    {
        int count = (int)log10(n)+1;
        return count;
    }
    // Approach2
    public static int countNum(int n)
    {
        int count=0;
        while(n>0)
        {
            int lastDigit = n%10;
            n = n/10;
            count++;
        }
        return count;
    }
    public static void main(String args[])
    {
       System.out.println( countDigi(7789));
      //  System.out.println( countNum(7789));
    }
}
