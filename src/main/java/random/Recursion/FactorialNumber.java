package random.Recursion;

public class FactorialNumber {

    public static int factorial(int num)
    {
        if(num==0)
            return 1;
        return num*factorial((num-1));
    }
    //iterative approach

    public static int fact(int num)
    {
        int result =1;
        while(num !=0)
        {
            result = result *num;
            num--;
        }
        return result;
    }
}
