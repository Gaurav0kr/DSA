package A2ZDSA.RecursionPatterwise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubSetSUm {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print(subsetSum(arr));
    }
    public static ArrayList<Integer> subsetSum(int num[]) {
        // Write your code here..
        ArrayList<Integer> list = new ArrayList<>();
        findSubSetSum(num,list,0,0);
        Collections.sort(list);
        return list;
    }
    public static void findSubSetSum(int num[],ArrayList<Integer> ans,int sum, int index){

        if(index==num.length){
            ans.add(sum);
            return;
        }

        findSubSetSum(num,ans,sum+num[index],index+1);

        findSubSetSum(num,ans,sum,index+1);
    }
}
