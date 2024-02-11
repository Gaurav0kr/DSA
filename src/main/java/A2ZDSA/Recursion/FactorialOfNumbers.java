package A2ZDSA.Recursion;

public class FactorialOfNumbers {

    public int fact(int n)
    {
        if(n==0)
            return 1;
        return n*fact(n-1);
    }
    public static void main(String[] args)
    {
        FactorialOfNumbers fn = new FactorialOfNumbers();
        System.out.print(fn.fact(5));
    }
}
