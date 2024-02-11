package A2ZDSA.SlidingWindowAND_TwoPointer;

public class NumberOfSubstringsContainingAllThreeCharacters {

    public static int numberOfSubstrings(String s) {

        int n = s.length(); int left =0;
        int[] count= new int[3]; int res=0;
        for(int right=0;right<n;right++) {

            count[s.charAt(right) - 'a']++;
            while (count[0] > 0 && count[1] > 0 && count[2] > 0){
                count[s.charAt(left) - 'a']--;
                left++;
        }
            res = res + left;
        }
        return res;
    }

    // without using Sliding window
    public static int countSubStr(String s){
        int n = s.length();
        int l1=-1,l2=-1,l3=-1;
        int count=0;
        for(int i=0;i<n;i++) {
            if (s.charAt(i) == 'a') l1 = i;
            else if (s.charAt(i) == 'b') l2 = i;
            else l3 = i;

            if(l1==-1 || l2==-1 || l3==-1)
                continue;
            int min = Math.min(l1, Math.min(l2, l3));
            count += min + 1;
        }
        return count;
    }
    public static void main(String[] args){
        String s = "abcabc";
        System.out.println(" Answer is "+countSubStr(s));
    }
}
