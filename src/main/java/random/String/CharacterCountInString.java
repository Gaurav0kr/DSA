package random.String;

import java.util.HashMap;
import java.util.Map;

public class CharacterCountInString {
    public static void charCount(String s)
    {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch:s.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet())
        {
            System.out.println(entry.getKey()+" and Value is:"+entry.getValue());
        }
    }
    public static void main(String args[])
    {
        String str ="Gaurav";
        charCount(str);
    }
}
