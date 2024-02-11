package A2ZDSA.BasicMath;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrintAllDivisor {

    public static void printDivisor(int n)
    {
        List<Integer> list = new ArrayList<>();
       // for(int i=1;i<=Math.sqrt(n);i++)
            for(int i=1;i*i<=n;i++)
        {
            if(n%i==0)
            {
                list.add(i);
                if(n/i !=i)
                    list.add(n/i);
            }
        }
        Collections.sort(list);
        for(int i=0;i< list.size();i++)
            System.out.print(list.get(i)+",");
    }
    public static void main(String[] args)
    {
        printDivisor(36);
    }
}
