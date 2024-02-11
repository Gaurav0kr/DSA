package A2ZDSA.String.Basic;

public class ReverseWord {

    public static String reverseWords(String s) {

        String result ="";
        int i=0, n =s.length();
        while(i<n)
        {
            while(i<n && s.charAt(i)==' ') i++;
            if(i>=n) break;
            int j = i+1;
            while(j< n && s.charAt(j) !=' ') j++;
            String sub = s.substring(i,j);
            if(result.length()==0)
                result = sub;
            else
                result = sub +" "+result;
            i= j+1;
        }
        return result;
    }

    // another way
    public static String reverseWord_2(String s)
    {
        // without using StringBuilder
        int n = s.length(), i =0;
        String ans ="";
        while(i<n)
        {
            String temp="";
            while(i<n && s.charAt(i) ==' ') i++;
            while(i<n && s.charAt(i) !=' '){
                temp +=s.charAt(i);
                i++;
            }
            if(temp.length()>0)
            {
                if(ans.length()==0)
                    ans = temp;
                else
                    ans = temp +" "+ans;
            }
        }
        return ans;
    }
    public static String reverseWords_Using_Split(String s)
    {
        // using split method
     String[] words = s.split(" +");
     StringBuilder sb = new StringBuilder();
     for(int i = words.length-1;i>=0;i--)
     {
         sb.append(words[i]);
         sb.append(" ");
     }
     return sb.toString().trim();
    }

}
