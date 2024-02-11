package A2ZDSA.String.Medium;

import java.util.HashMap;

public class Roman_to_Integer {

    public static int romanToInt_Using_switch(String s) {

        int num =0, ans =0;
        int n = s.length();
        for(int i=n-1;i>=0;i++)
        {
            switch (s.charAt(i)){
                case 'I': num=1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }
            if(4*num < ans)
                ans -= num;
            else
                ans += num;
        }
        return ans;
    }
    // using hashMap
    public static int romanToInt_Using_Map(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int n = s.length();
        int result = map.get(s.charAt(n-1));
        for(int i = n-2;i>=0;i-- )
        {
            if(map.get(s.charAt(i)) < map.get(s.charAt(i+1)))
                result -= map.get(s.charAt(i));
            else
                result += map.get(s.charAt(i));
        }
        return result;
    }

}
