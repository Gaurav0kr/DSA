package A2ZDSA.RecursionPatterwise;

public class Pow_x_n {

    public static double mypow(double x, int n){
        double ans =1.0;
        long nn = n;
        if(nn<0)
            nn= -1*nn;
        while(nn>0){
            if(nn%2==1){
                ans = ans *x;
                nn = nn-1;
            }else{
                x = x*x;
                nn = nn/2;
            }
        }
        if(n<0)
            ans = 1.0/ans;
        return ans;
    }
    public static void main(String[] args) {

    //    double result = mypow_usingRecursion(2,-2147483648);
        double result = mypow_dummy(2,-2147483648);

        System.out.println("answer is " + result);
    }
    // using recursion
    public static double mypow_usingRecursion(double x, int n){

        if(n==0) return 1.0;
        if (n==1) return x;

        if(n>0) {
            double halfPow = mypow_usingRecursion(x, n / 2);
            if (n % 2 == 0)  return halfPow * halfPow;
            else return x * halfPow * halfPow;
        }
        else{
            int t = n/2;
            double halfPow = mypow_usingRecursion(x,-1*t);
            if (n % 2 == 0) return halfPow * halfPow;
            else return x * halfPow * halfPow;
        }
    }
    public static double mypow_dummy(double x, int n){
        double ans = 1.0;
        long nn = n;
        if(n<0) nn = -1*nn;
        while(nn>0){
            if(nn%2==1) {
                ans = ans *x;
                nn = nn-1;
            }else{
                x = x *x;
                nn = nn/2;
            }
        }
        if(n<0)
            ans = (double)(1.0)/(double) (x);
        return ans;
    }
}
