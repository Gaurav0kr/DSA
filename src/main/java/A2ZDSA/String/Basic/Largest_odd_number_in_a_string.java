package A2ZDSA.String.Basic;

public class Largest_odd_number_in_a_string {
    public String largestOddNumber(String num) {

        int n = num.length();
        if(n==0)
            return "";
        int i = n-1;
        while(i>=0)
        {
            if(num.charAt(i) %2==1)
                return num.substring(0,i+1);
            i--;
        }
        return "";
    }
}
