package A2ZDSA.patterns;

public class Print_Star {

    public static void printStar4_4()
    {
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void printStarleftPyramid1(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void printNumberleftPyramid2(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void printNumberleftPyramid3(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void printStarReversePyramid1(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=(n-i+1);j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void printStarReversePyramid2(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=(n-i+1);j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void printStarPyramid(int n)
    {
        for(int i=0;i<n;i++)
        {
            //Space
            for(int j=0;j<(n-i-1);j++)
                System.out.print(" ");

            //star
            for(int j=0;j<(2*i+1);j++)
                System.out.print("*");

            //Space
            for(int j=0;j<(n-i-1);j++)
                System.out.print(" ");

            System.out.println();
        }}
    public static void printReverseStarPyramid(int n) {
        for (int i = 0; i < n; i++)
        {
            //space
            for(int j=0;j<i;j++)
                System.out.print(" ");
            //Star
            for(int j=0;j<(2*n-(2*i+1));j++)
                System.out.print("*");
            //space
            for(int j=0;j<i;j++)
                System.out.print(" ");
            System.out.println();
        }
    }
    public static void printStarTopPlusReversePyramid(int n)
    {
        for(int i=1;i<=2*n-1;i++)
        {
            int star =i;
            if(i>n) star = 2*n-i;
            for(int j=1;j<=star;j++)
                System.out.print("*");
            System.out.println();
        }
    }
    public static void printNumberflipPyramid1(int n)
    {
        int start =1;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
                start =0;
            else
                start =1;
            for(int j=0;j<i;j++)
            {
                System.out.print(start);
                start = 1-start;
            }
            System.out.println();
        }
    }
    public static void printNumberflipPyramid2(int n)
    {
        for(int i=1;i<=n;i++) {
            //Number
            for(int j=1;j<=i;j++)
                System.out.print(j+"");
            //Space
            for(int j=1;j<=2*(n-i);j++)
                System.out.print(" ");
            //Number
            for(int j=i;j>=1;j--)
                System.out.print(j+"");
            System.out.println();
        }
    }
    public static void printNumberflipPyramid3(int n)
    {
        int num=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num = num+1;
            }
            System.out.println();
        }
    }
    public static void printletterPyramid1(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(char ch='A';ch<='A'+i;ch++)
            System.out.print(ch);

            System.out.println();
        }

    }
    public static void printletterPyramidFlip2(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(char ch='A';ch<'A'+(n-i+1);ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    public static void printletterPyramidFlip3(int n)
    {
        for(int i=0;i<n;i++) {
            char ch = (char) ('A'+i);
            for (int j =0;j<=i;j++)
                System.out.print( ch+"");
            System.out.println();
        }
    }
    public static void printletterPyramidFlip4(int n)
    {
        for(int i=0;i<n;i++) {
            char ch = 'A';
            //Space
            for (int j =0;j<n-i-1;j++)
                System.out.print(" ");
            //Char
            for (int j =1;j<=2*i+1;j++) {
                if (j <= i)
                    System.out.print(ch++);
                else
                    System.out.print(ch--);
            }
            //Space
            for (int j =0;j<n-i-1;j++)
                System.out.print(" ");
            System.out.println();
        }
    }
    public static void printletterPyramidFlip5(int n) {
        for (int i = 0; i < n; i++)
        {
            //char
            for(char ch =(char)('E'-i);ch<='E';ch++)
                System.out.print(ch);
            System.out.println();
        }
    }
    public static void printStarBox(int n) {
        int initialSpace=0;
        for (int i = 0; i < n; i++)
        {
            //star
            for(int j =1;j<=n-i;j++)
                System.out.print("*");
            //Space
            for(int j =0;j<initialSpace;j++)
                System.out.print(" ");
            //Star
            for(int j =1;j<=n-i;j++)
                System.out.print("*");
            initialSpace +=2;
            System.out.println();
        }
        initialSpace=8;
        for (int i = 0; i < n; i++)
        {
            //star
            for(int j =0;j<=i;j++)
                System.out.print("*");
            //Space
            for(int j =0;j<initialSpace;j++)
                System.out.print(" ");
            //Star
            for(int j =0;j<=i;j++)
                System.out.print("*");
            initialSpace -=2;
            System.out.println();
        }
    }
    public static void printStarBox2(int n) {
        int initialSpace = 2*n-2;
        for (int i = 1; i <= 2 * n-1; i++) {
            int star = i;
            if(i>n)
                star = 2*n-i;
            //star
            for (int j = 1; j <= star; j++)
                System.out.print("*");
            //Space
            for (int j = 0; j < initialSpace; j++)
                System.out.print(" ");
            //Star
            for (int j = 1; j <= star; j++)
                System.out.print("*");
            if(i<n)
                initialSpace -=2;
            else
                initialSpace +=2;

            System.out.println();
        }
    }
    public static void printStarSquareBox(int n) {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 || j==0 || i== n-1 || j== n-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void printNumberSquareBox(int n) {
        for(int i=0;i<2*n-1;i++)
        {
            for(int j=0;j<2*n-1;j++)
            {
                int top = i;
                int left =j;
                int bottom = 2*n-2-i;
                int right = 2*n-2-j;
                System.out.print(n- Math.min(Math.min(top,bottom),Math.min(left,right)));
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {

       // printStar4_4();
     //   printStarleftPyramid1(5);
     //  printNumberleftPyramid2(5);
      //  printNumberleftPyramid3(5);
    //    printStarReversePyramid1(5);
       // printStarReversePyramid2(5);
        //printStarPyramid(5);
        //printReverseStarPyramid(5);
       // printStarTopPlusReversePyramid(5);
    //    printNumberflipPyramid1(5);
     //   printNumberflipPyramid2(5);
     //   printNumberflipPyramid3(5);
     //   printletterPyramid1( 5);
    //    printletterPyramidFlip2(5);
     //   printletterPyramidFlip3(5);
     //   printletterPyramidFlip4(5);
     //     printletterPyramidFlip5(5);
     //   printStarBox(5);
        //printStarBox2(5);
    //    printStarSquareBox(4);
        printNumberSquareBox(4);

    }
}
