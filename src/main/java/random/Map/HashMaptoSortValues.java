package random.Map;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.*;

public class HashMaptoSortValues {

    public static HashMap<String, Integer> sortByValues(HashMap<String,Integer> hm)
    {
        List<Map.Entry<String,Integer>> list = new LinkedList<>(hm.entrySet());
    // Sort the list
        Collections.sort(list, (o1, o2) -> o1.getValue().compareTo(o2.getValue()));

       /* // Sort the list
        Collections.sort(list, new Comparator<>() {
                    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                        return o1.getValue().compareTo(o2.getValue());
                    }*/
// put data from sorted list to hashMap
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for(Map.Entry<String,Integer> map: list)
        {
            temp.put(map.getKey(), map.getValue());
        }
return temp;
    }
    // Driver Code
    public static void main(String[] args) {

        HashMap<String, Integer> hm = new HashMap<String, Integer>();

        // enter data into hashmap
        hm.put("Math", 98);
        hm.put("Data Structure", 85);
        hm.put("Database", 91);
        hm.put("Java", 95);
        hm.put("Operating System", 79);
        hm.put("Networking", 80);

        Map<String, Integer> hm1 = sortByValues(hm);
        // print the sorted hashmap
        for (Map.Entry<String, Integer> en : hm1.entrySet()) {
            System.out.println("Key = " + en.getKey() +
                    ", Value = " + en.getValue());
        }
    }
}
