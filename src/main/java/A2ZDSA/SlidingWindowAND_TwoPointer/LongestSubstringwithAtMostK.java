package A2ZDSA.SlidingWindowAND_TwoPointer;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringwithAtMostK {

    public static int findcount(String s, int k){
        return findmax(s,k)-findmax(s,k-1);
    }
    public static int findmax(String s, int k){

        Map<Character,Integer> map = new HashMap<>();
        int count=0; int left =0; int n = s.length();
        for(int right =0;right<n;right++){

            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);
            while(map.size()>k){
                if(map.get(s.charAt(left))==1)
                    map.remove(s.charAt(left));
                else
                    map.put(s.charAt(left),map.get(s.charAt(left))-1);
                    left++;
            }
            count = Math.max(count, right-left+1);
        }
        return count;
    }
    public static void main(String[] args){
        String s= "ababc"; //1,2,1,2,3  |  k=2
        int k = 2;
        System.out.println("Longest subStr length = "+findcount(s,k));
    }
}

// a,b,c ,d
// a b c d ab bc  abc bcd abcd