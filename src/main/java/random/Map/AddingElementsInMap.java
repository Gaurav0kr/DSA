package random.Map;

import java.util.HashMap;
import java.util.Map;

public class AddingElementsInMap {

    public static void main(String[] args)
    {
        Map<String, Integer> map = new HashMap<>();
        map.put("Math",94);
        map.put("Hindi",98);
        map.put("English",99);
        map.put("Bio",92);
        map.put("physic",91);

        //print these values
        for(Map.Entry<String,Integer> entry: map.entrySet())
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        Map<String,Integer> anotherMap= new HashMap<>();
        anotherMap.put("DSA",96);
        anotherMap.putAll(map);
        anotherMap.put("Hindi",91);
System.out.println("********************");
        for(Map.Entry<String,Integer> entry: anotherMap.entrySet())
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        //Sort MAP based on values

    }
}
