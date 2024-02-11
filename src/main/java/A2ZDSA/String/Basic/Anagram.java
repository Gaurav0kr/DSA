package A2ZDSA.String.Basic;

import java.util.HashMap;

public class Anagram {
    public boolean isAnagram(String s, String t) {

        if(s.length() !=t.length())
            return false;
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch:s.toCharArray())
        {
            if(!map.containsKey(ch))
            {
                map.put(ch,1);
            }
            else
            {
                map.put(ch,map.get(ch)+1);
            }
        }
        for(char th :t.toCharArray())
        {
            if(!map.containsKey(th))
                return false;
            else
            {
                if(map.get(th)==1)
                    map.remove(th);
                else
                    map.put(th,map.get(th)-1);
            }
        }
        return true;

    }
}
