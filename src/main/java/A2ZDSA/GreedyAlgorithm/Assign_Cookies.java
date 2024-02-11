package A2ZDSA.GreedyAlgorithm;

import java.util.Arrays;

//Input: g = [1,2,3], s = [1,1]
//Output: 1
public class Assign_Cookies {

    public static int findContentChildren(int[] g, int[] s){
        Arrays.sort(g);
        Arrays.sort(s);
        int j =0, ans =0;
        for(int i: g){
            while(j<s.length && s[j]<i)
                j++;
            if(j==s.length)
                return ans;
            else {
                j++;
                ans++;
            }
        }
        return ans;
    }
    // In one pass
    public static int findContentChildren_2(int[] g, int[] s){
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0, j=0;
        while(i<g.length && j<s.length){
            if(s[j]>=g[i]){
                i++;
            }
            j++;
        }
        return i;
    }
    public static void main(String[] args){
        int[] g ={1,2};
        int[] s= {1,2,3};
        System.out.println("Number of kids who get cookies "+findContentChildren_2(g,s));
    }
}
