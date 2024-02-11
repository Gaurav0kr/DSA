package random.Arrays;

public class ArmstrongNumber {

    public static boolean isArmString(int num)
    {
        int result =0;
        int original = num;
        while(num!=0)
        {
            int reminder = num%10;
            result = result + reminder*reminder*reminder;
            num = num/10;
        }
        return result == original;
    }
    public static void main(String[] args)
    {
        int num = 153;
        System.out.println(isArmString(num));
    }
}
