package A2ZDSA.RecursionPatterwise;

import java.util.ArrayList;
import java.util.List;

public class Word_Break {

    // This code is failing , I need to update this.
    public static boolean wordBreak(String s, List<String> wordDict) {

        if(wordDict.contains(s))
            return true;

        for(int i=1;i<s.length();i++){
            String left = s.substring(0,i);
            if(wordDict.contains(left) && wordBreak(s.substring(i),wordDict));
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        List<String > wordDict = new ArrayList<>();
        wordDict.add("cats");
        wordDict.add("dog");
        wordDict.add("sand");
        wordDict.add("and");
        wordDict.add("cat");

        String s = "catsandog";

        System.out.print(wordBreak(s,wordDict));
    }
}
