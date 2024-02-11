package A2ZDSA.BinarySearch;

public class Dummy1 {
    public static void nStarDiamond(int n) {
        // Write your code here
        top_print(n);
        down_print(n);
    }
    // top print
    public static void top_print(int n){
        for(int i=0;i<n;i++)
        // space
        {
            for(int j = 0;j <n-i-1;j++ )
            {
                System.out.print(" ");
            }
// star
            for(int j = 0;j <2*i+1;j++ )
            {
                System.out.print("*");
            }
//Space
            for(int j = 0;j <n-i-1;j++ )
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    // down print
    public static void down_print(int n){
        for(int i=0;i<n;i++)
        // space
        {
            for(int j = 0;j <i;j++ )
            {
                System.out.print(" ");
            }
// star
            for(int j = 0;j <2*n-(2*i+1);j++ )
            {
                System.out.print("*");
            }
//Space
            for(int j = 0;j <i;j++ )
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void nBinaryTriangle(int n) {
        // Write your code here.
        int start =1;
        for(int i =0;i<n;i++)
        {
            if(i%2==0)
                start = 1;
            else
                start =0;
            for(int j =0;j<=i;j++)
            {
                System.out.print(start);
                start = 1-start;
            }
            System.out.println();
        }
    }
    public static void numberCrown(int n) {
        // Write your code here.
        int space = 2*(n-1);
        for(int i=1;i<=n;i++)
        {
            //Number
            for(int j =1;j<=i;j++)
                System.out.print(j);

            //space
            for(int j =1;j<=space;j++)
                System.out.print(" ");

            //Number
            for(int j =i;j>=1;j--)
                System.out.print(j);

            System.out.println();
            space -= 2;
        }
    }
    public static void nLetterTriangle(int n) {
        // Write your code here
        for(int i=0;i<n;i++)
        {
            for(char ch ='A';ch<='A'+(n-i);ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    public static void alphaHill(int n) {
        // Write your code here

        for(int i=0;i<n;i++)
        {
            //space
            for(int j=0;j<n-i-1;j++)
                System.out.print(" ");

            //letter
            char ch ='A';
            int breakpoint = (2*i+1)/2;
            for(int j=1;j<=(2*i)+1;j++) {
                System.out.print(ch);
                if (j<=breakpoint)
                    ch++;
                else
                    ch--;
            }
            //Space
            for(int j=0;j<n-i-1;j++)
                System.out.print(" ");

            System.out.println();
        }
    }

    public static void alphaTriangle(int n) {
        // Write your code here

        for(int i=0;i<n;i++)
        {

            for(char ch = (char)('A'+n-i-1);ch<='A'+n-1;ch++)
            {
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }

    public static void symmetric_void(int n) {

// First Half
        int inis =0;
        for(int i=0; i< n; i++)
        {
            //star
            for(int j =1;j<=n-i;j++)
                System.out.print("*");
            //Space
            for(int j =0;j<inis;j++)
                System.out.print(" ");
            //Star
            for(int j =1;j<=n-i;j++)
                System.out.print("*");
            inis +=2;
            System.out.println();
        }

// Second Half
        inis =2*(n-1);
        for(int i=1; i<= n; i++)
        {
            //star
            for(int j =1;j<=i;j++)
                System.out.print("*");
            //Space
            for(int j =0;j<inis;j++)
                System.out.print(" ");
            //Star
            for(int j =1;j<=i;j++)
                System.out.print("*");
            inis -=2;
            System.out.println();
        }
    }
    public static void pattern22(int n) {

        for (int i = 0; i < 2 * n - 1; i++)
        {
            for(int j=0;j<2*n-1;j++) {
                int top = i;
                int left = j;
                int bottom = 2*(n-1) -i;
                int right = 2*(n-1) -j;
                System.out.print(
                n-Math.min(Math.min(top,bottom), Math.min(left, right))
                +" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        int n = 4;
//        nStarDiamond(n);
//        top_print(n);
//        down_print(n);
//        nBinaryTriangle(n);
//          numberCrown(n);
//        nLetterTriangle(n);
//        alphaHill(n);
//        alphaTriangle(n);
//        symmetric_void(n);
        pattern22(n);
    }
}
