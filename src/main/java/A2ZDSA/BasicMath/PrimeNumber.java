package A2ZDSA.BasicMath;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrimeNumber {

    public static void primeNum(int n)
    {
        int count=0;
            for(int i=1;i*i<=n;i++)
        {
            if(n%i==0) {
                count++;
                if (n / i != i)
                    count++;
            }
        }
            if(count==2)
            System.out.print("It is a PrimeNumber");
            else
                System.out.print("It is NOT a PrimeNumber");
    }
    public static void main(String[] args)
    {
        primeNum(31);
    }
}
