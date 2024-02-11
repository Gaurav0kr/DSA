package A2ZDSA.String.Basic;

import java.util.Arrays;

public class Longest_Common_Prefix {
    public String longestCommonPrefix(String[] strs) {

       if(strs.length==0 || strs ==null)  return "";
        // Take the first string as a reference
        String prefix = strs[0];
        for(int i=0;i<strs.length;i++)
        {
           int j =0;
           while(j<prefix.length() && j<strs[i].length() && prefix.charAt(j)== strs[i].charAt(j))
               j++;
           // Update Prefix string
            prefix = prefix.substring(0,j);
            // If the prefix becomes empty, no common prefix exists
            if (prefix.isEmpty())
                break;
        }
            return prefix;
    }
    // write optimal soilution
    // first sort the array
    // compare letter of 1st word with letter of last word
    // and update the ans
    public String longestCommonPrefix_Optimal(String[] strs) {

        Arrays.sort(strs);
        String start = strs[0];
        String last = strs[strs.length-1];
        int index = 0;
        while(index < start.length())
        {
            if(start.charAt(index) ==last.charAt(index))
                index ++;
            else
                break;
        }
        return index==0?"":start.substring(0,index);
    }

}
