package random.Arrays;

public class PrimeNumberCheck {

    public static boolean checkPrime(int num)
    {
        if(num==0 || num==1 || num%10==0)
            return false;
        for(int i=2;i<=num/2;i++)
        {

                return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        int num1 = 9;
        int num2 = 11;
        System.out.println(checkPrime(num2));
    }
}
