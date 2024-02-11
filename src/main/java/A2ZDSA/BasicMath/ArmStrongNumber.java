package A2ZDSA.BasicMath;

public class ArmStrongNumber {

    public static boolean armStrong(int n)
    {
        int originalNum =n;
        int sum=0;
        int ld;
        while(n>0)
        {
            ld = n%10;
            n=n/10;
            sum = sum + (ld*ld*ld);
        }
        System.out.println(sum);
        return originalNum==sum;
    }
    public static void main(String args[])
    {

        System.out.println( armStrong(153));
    }
}
