package A2ZDSA.Recursion;

public class SumOfN_numbers {

    //Parametrised Approach
    public  void sumNumber(int n, int sum)
    {
        if(n<1) {
            System.out.println(sum);
            return;
        }
        sumNumber(n-1,sum+n);
    }
    //FunctionalApproach
    public int sumNumber2(int n)
    {
        if(n==0)
            return 0;
        return n + sumNumber2(n-1);
    }
    public static void main(String[] args)
    {
        SumOfN_numbers rp = new SumOfN_numbers();
       // rp.sumNumber(5,0);
        System.out.print(rp.sumNumber2(7));
    }
}
