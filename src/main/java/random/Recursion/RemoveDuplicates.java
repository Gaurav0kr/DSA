package random.Recursion;

import java.util.Arrays;

public class RemoveDuplicates {

    public static int[] removeDup(int[] num)
    {
        Arrays.sort(num);
        int[] result = new int[num.length];
        int prev = num[0];
        result[0] = prev;
        for(int i=1;i<num.length;i++)
        {
            int ch = num[i];
            if(prev != ch)
                result[i]=ch;
            prev = ch;
        }
        return result;
    }
}
