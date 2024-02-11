package A2ZDSA.Recursion;

public class PrintNameNtimes {

    public  void print(int i,int n)
    {
        if(i>n)
            return;
        System.out.println("Gaurav");
        print(i+1,n);
    }
    // 1-> n
    public  void printNumber(int i,int n)
    {
        if(i>n)
            return;
        System.out.println(i);
        printNumber(i+1,n);
    }
    // N-> 1
    public  void printNumber2(int i,int n)
    {
        if(i<1)
            return;
        System.out.println(i);
        printNumber2(i-1,n);
    }
    // 1 -> N using Backtracking
    public  void printNumber3(int i,int n)
    {
        if(i<1)
            return;
        printNumber3(i-1,n);
        System.out.println(i);
    }
    // N -> 1 using Backtracking
    public  void printNumber4(int i,int n)
    {
        if(i>n)
            return;
        printNumber4(i+1,n);
        System.out.println(i);
    }
    public static void main(String[] args)
    {
        PrintNameNtimes pn = new PrintNameNtimes();
    //    pn.print(1,5);
     //   pn.printNumber(1,5);
     //   pn.printNumber2(5,5);
     //   pn.printNumber3(5,5);
        pn.printNumber4(1,5);
    }
}
