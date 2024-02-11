package A2ZDSA.SlidingWindowAND_TwoPointer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LengthOfLongestSubStringWithoutRepeatingChar {
    public static int longestSubStr(String str){
        if(str.length()==0)
            return 0;
        int n = str.length();
        int maxLen= Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            Set<Character> set = new HashSet<>();
            for(int j =i;j<n;j++){
                if(set.contains(str.charAt(j))) {
                    maxLen = Math.max(maxLen, j - i);
                    break;
                }
                set.add(str.charAt(j));
            }
        }
        return maxLen;
    }

    //Optimal 1
    public static int longestSubStr_2(String str){
        int n =str.length();
        if(n==0)
            return 0;
        int l = 0, maxLen = Integer.MIN_VALUE;
        Set<Character> set = new HashSet<>();
        for(int r=0;r<n;r++){

            if(set.contains(str.charAt(r))){
                while(l<r && set.contains(str.charAt(r))) {
                    set.remove(str.charAt(l));
                    l++;
                }
            }
            set.add(str.charAt(r));
            maxLen = Math.max(maxLen,r-l+1);

        }
        return maxLen;
    }
// BEST optimal solution
    public static int longestSubStr_3(String s){
        int n = s.length();
        int maxLen=0, right=0, left=0;
        Map<Character, Integer> map = new HashMap();
        while(right<n){
            if(map.containsKey(s.charAt(right)))
                left = Math.max(map.get(s.charAt(right)) +1,left);

            map.put(s.charAt(right),right);
            maxLen = Math.max(maxLen, right-left+1);
            right++;
        }

        return maxLen;
    }
    public static void main(String args[]) {
        String str = "takeUforward";
        System.out.println("The length of the longest substring without repeating characters is " + longestSubStr_3(str));

    }
}
