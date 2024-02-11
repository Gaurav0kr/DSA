package A2ZDSA.GreedyAlgorithm;

import java.util.Arrays;

public class MinimumPlatform {

    public static int minPlatCount(int[] arr, int[] dep, int n){

        Arrays.sort(arr);
        Arrays.sort(dep);
        int platNeeded =1, maxPlatNeeded =1;
        int i=1, j=0;
        while(i<n && j<n){
            if(arr[i]<=dep[j]){
                platNeeded++;
                i++;
            }
            else if(arr[i] >= dep[j]){
                platNeeded--;
                j++;
            }
            if(platNeeded > maxPlatNeeded)
                maxPlatNeeded = platNeeded;
        }
        return maxPlatNeeded;
    }
    public static void main(String[] args){
        int[] arr = {900, 940, 950, 1100, 1500, 1800};
        int[] dep = {910, 1200, 1120, 1130, 1900, 2000};
        int n =6;
        System.out.print("Answer is "+minPlatCount(arr,dep,n));
    }
}
