package A2ZDSA.String.Basic;

import java.util.HashMap;

public class Isomorphic {
    public boolean isIsomorphic(String s, String t) {

        if(s.length()!=t.length())
            return false;
        HashMap<Character, Character> map = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if(map.containsKey(ch1))
            {
                if(map.get(ch1)!=ch2)
                    return false;
            }
            else
            {
                if(map.containsValue(ch2))
                    return false;
                else
                    map.put(ch1,ch2);
            }
        }
        return true;
    }
}
