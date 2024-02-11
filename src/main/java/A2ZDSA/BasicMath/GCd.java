package A2ZDSA.BasicMath;

public class GCd {

    public static int gcdOfNum(int a,int b)
    {
        while(a>0 & b>0)
        {
            if(a>b) a=a%b;
            else b = b%a;
        }
        if(a==0) return b;
        return a;
    }
    public static void main(String[] args)
    {
        System.out.print(gcdOfNum(11,21));
    }
}
