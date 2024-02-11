package A2ZDSA.RecursionPatterwise;

import java.util.ArrayList;
import java.util.List;

public class Palindrome_Partitioning {

    public static List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> path = new ArrayList<>();
        func(res,path,s,0);
        return res;
    }
    public static void func(List<List<String>> res,List<String> path, String s, int index){
        if(index== s.length()){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i=index;i<s.length();i++){
            if(isPalindrome(s,index,i))
            {
                path.add(s.substring(index,i+1));
                func(res,path,s,i+1);
                path.remove(path.size()-1);
            }
        }
    }
    public static boolean isPalindrome(String s, int start,int end){
        while(start<=end){
            if(s.charAt(start++) !=s.charAt(end--)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {
        String s = "aabb";
        List < List < String >> ans = partition(s);
        int n = ans.size();
        System.out.println("The Palindromic partitions are :-");
        System.out.print(" [ ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("[ ");
            for (int j = 0; j < ans.get(i).size(); j++) {
                System.out.print(ans.get(i).get(j) + " ");
            }
            System.out.print("] ");
        }
        System.out.print("]");
    }
}
