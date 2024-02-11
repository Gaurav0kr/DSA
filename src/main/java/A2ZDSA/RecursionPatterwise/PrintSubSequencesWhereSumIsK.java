package A2ZDSA.RecursionPatterwise;

import java.util.ArrayList;

public class PrintSubSequencesWhereSumIsK {

    public static void printSub(ArrayList<Integer> al, int[] arr, int sum,int i,int k){

        if(i==arr.length){
            if(sum==k)
                System.out.println(al.toString());
            return;
        }
        al.add(arr[i]);
        sum += arr[i];
        printSub(al,arr,sum,i+1,k);
        al.remove(al.size()-1);
        sum -=arr[i];
        printSub(al,arr,sum,i+1,k);
    }
    // To print anyone of the SubSequences whose SUM = k
    public static boolean printSub_any(ArrayList<Integer> al, int[] arr, int sum,int i,int k){

        if(i == arr.length){
            if(sum==k) {
                System.out.println(al.toString());
                return true;
            }
            else return false;
        }
        al.add(arr[i]);
        sum += arr[i];
        if(printSub_any(al,arr,sum,i+1,k)==true)
            return true;
        sum -= arr[i];
        al.remove(al.size()-1);
        if(printSub_any(al,arr,sum,i+1,k)==true)
            return true;
        return false;
    }

 // Print only Count
 public static int printSub_count(int[] arr, int sum,int i,int k){

     if(i == arr.length){
         if(sum==k) {
             return 1;
         }
         else return 0;
     }

     sum += arr[i];
     int left = printSub_count(arr,sum,i+1,k);

     sum -= arr[i];
     int right = printSub_count(arr,sum,i+1,k);

     return left+right ;
 }
    public static void main(String[] args){
        int arr[] ={1,2,1};
        ArrayList<Integer> list = new ArrayList<>();
 //       printSub_any(list,arr,0,0,2);
        System.out.print(printSub_count(arr,0,0,2));
    }
    }
