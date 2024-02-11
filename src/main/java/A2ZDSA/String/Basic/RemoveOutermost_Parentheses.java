package A2ZDSA.String.Basic;

public class RemoveOutermost_Parentheses {

    public String removeOuterParentheses(String s) {

        StringBuilder sb = new StringBuilder();
        int counter =0;

        for(char c : s.toCharArray())
        {
            if(c=='(')
            {
                if(counter!=0) sb.append(c);
                counter++;
            }
            else{
                counter--;
                if(counter != 0) sb.append(c);
            }
        }
        return sb.toString();
    }
}
