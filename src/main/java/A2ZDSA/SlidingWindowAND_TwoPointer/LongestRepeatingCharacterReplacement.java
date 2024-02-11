package A2ZDSA.SlidingWindowAND_TwoPointer;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharacterReplacement {

    public static int findLargestSubArray(String s, int k){

        int n = s.length(); int maxLen =0;
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        int left=0,right; int maxCount=0;

        for(right=0;right<n;right++){
            char currentChar = s.charAt(right);

            map.put(currentChar,map.getOrDefault(currentChar,0)+1);
            maxCount = Math.max(maxCount, map.get(currentChar));

            if(right-left+1 - maxCount >k){
                int charCount= map.get(s.charAt(left));
                if(charCount==1)
                    map.remove(s.charAt(left));
                else
                map.put(s.charAt(left),charCount-1);
                left++;
            }
            maxLen = Math.max(maxLen, right-left+1);
        }
        return maxLen;
    }
    public static void main(String[] args){
        String s= "AABABBA";
        int k = 1;

        System.out.println("Longest SubString = "+findLargestSubArray(s,k));
    }
}
