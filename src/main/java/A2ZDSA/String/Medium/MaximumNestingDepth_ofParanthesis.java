package A2ZDSA.String.Medium;

public class MaximumNestingDepth_ofParanthesis {

    public int maxDepth(String s) {

        int currCount =0, maxi =0;

        for(int i =0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
                currCount++;
            else if(s.charAt(i)==')')
                currCount--;
            maxi = Math.max(maxi, currCount);
        }
        return maxi;
    }
}
