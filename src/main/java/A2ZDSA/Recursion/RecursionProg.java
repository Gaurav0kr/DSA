package A2ZDSA.Recursion;

public class RecursionProg {

    int  count=0;
    public  void print()
    {
        if(count==3)
            return;
        System.out.println(count);
        count++;
        print();
    }
    public static void main(String[] args)
    {
        RecursionProg rp = new RecursionProg();
        rp.print();
    }
}
