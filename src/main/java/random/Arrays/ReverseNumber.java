package random.Arrays;

public class ReverseNumber {
    public static int reverseN(int num)
    {
        int reverseNum = 0;
        while(num!=0)
        {
            int reminder = num%10;
            reverseNum =  reminder + reverseNum*10 ;
            num = num/10;
        }
        return reverseNum;
    }
    public static void main(String[] args)
    {
        int num= 12344;
        System.out.println(reverseN(num));
    }
}
