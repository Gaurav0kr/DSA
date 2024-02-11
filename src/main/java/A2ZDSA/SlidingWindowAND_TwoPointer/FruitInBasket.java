package A2ZDSA.SlidingWindowAND_TwoPointer;

import java.util.HashMap;
import java.util.Map;

public class FruitInBasket {

    public static int countFruit(int[] fruits){
        int n = fruits.length;
        int left =0,right =0, maxLen=0;
        Map<Integer,Integer> map = new HashMap<>();
        for(right =0;right<n;right++){
            int currentCount = map.getOrDefault(fruits[right],0);
            map.put(fruits[right],currentCount+1);

           while(map.size()>2){
               int fruitsCount = map.get(fruits[left]);
               if(fruitsCount==1)
                   map.remove(fruits[left]);
               else
                   map.put(fruits[left],fruitsCount-1);
               left++;
           }
           maxLen= Math.max(maxLen, right-left +1);
        }
        return maxLen;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,2,2};
        System.out.println("Answer is  :  "+countFruit(arr));
    }
}
