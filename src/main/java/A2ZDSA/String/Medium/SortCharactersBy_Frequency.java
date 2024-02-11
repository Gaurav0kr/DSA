package A2ZDSA.String.Medium;

import java.util.*;

public class SortCharactersBy_Frequency {
    public String frequencySort(String s) {

        // create a hashmap and store its frequency
        // using priority queue sort this map entry based of frequency of character
        //build the answer result where we will mark priorityQueue should be non empty
        int n = s.length();
        if(s==null || s.isEmpty())
            return "";
        HashMap<Character, Integer> charMapFrequency = new HashMap<>();
        for(char c: s.toCharArray())
            charMapFrequency.put(c, charMapFrequency.getOrDefault(c,0)+1);

        PriorityQueue<Map.Entry<Character,Integer>> maxHeap =
                new PriorityQueue<>((a,b)-> b.getValue()-a.getValue());
        maxHeap.addAll(charMapFrequency.entrySet());
        // Building the answer
        StringBuilder sb = new StringBuilder();
        while(!maxHeap.isEmpty())
        {
            Map.Entry<Character, Integer> entry = maxHeap.poll();
            char character = entry.getKey();
            int frequency = entry.getValue();
            for(int i=0;i<frequency;i++)
                sb.append(character);
        }
        return sb.toString(); // TC (NlogN), SC (NlogN)
    }
    // another way   https://www.youtube.com/watch?v=eXVAO4dqiSo

    // create a HashMap and store all character in this
    // create an array of type list which will store all chacter based upon
    // build answer

    public static String frequencySort_Optimal(String s) {

        StringBuilder sb = new StringBuilder();
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c:s.toCharArray())
            map.put(c,map.getOrDefault(c,0)+1);

        List<Character>[] arr = new ArrayList[s.length() +1];
        map.keySet().forEach( c->
        {
            if(arr[map.get(c)]==null)
                arr[map.get(c)] = new ArrayList();
            arr[map.get(c)].add(c);
        });

        for(int i=arr.length-1;i>0;i--)
        {
            if(arr[i] !=null)
                for(Character c: arr[i])
                {
                    for(int j=0;j<i;j++)
                        sb.append(c);
                }
        }
        return sb.toString();
    }
}
