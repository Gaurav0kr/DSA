package A2ZDSA.RecursionPatterwise;

import java.util.ArrayList;

public class PrintingSubsequences {

    public static void printSub(ArrayList<Integer> list,int arr[],int i){

        if(i==arr.length){
            System.out.println(list.toString());
            return;
        }
        list.add(arr[i]);
        printSub(list,arr,i+1);
        list.remove(list.size()-1);
        printSub(list,arr,i+1);
    }


    public static void main(String[] args){
        int arr[] ={1,2,3};
        ArrayList<Integer> list = new ArrayList<>();
        printSub(list,arr,0);
    }
}
