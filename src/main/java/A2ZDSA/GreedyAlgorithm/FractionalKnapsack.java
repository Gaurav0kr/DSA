package A2ZDSA.GreedyAlgorithm;


import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {

    public static double fractionalKnapsack(int w, Item[] arr, int n){
        Arrays.sort(arr, new ItemComparator());

        int currWeigh =0;
        double finalValue =0.0;
        for(int i=0;i<n;i++){
            if(currWeigh + arr[i].weigh <= w){
                currWeigh += arr[i].weigh;
                finalValue += arr[i].value;
            }
            else{
                int remain = w- currWeigh;
                finalValue += ((double) arr[i].value / (double) arr[i].weigh)* (double) remain;
                break;
            }
        }
        return finalValue;
    }
    public static void main(String args[])
    {
        int n = 3, weight = 50;
        Item arr[] = {new Item (100,20),new Item(60,10),new Item(120,30)};
        double ans = fractionalKnapsack(weight, arr, n);
        System.out.println("The maximum value is "+ans);
    }

}
class Item{
    int value, weigh;
    Item( int x, int y)
    {
        this.value =x;
        this.weigh=y;
    }
}
class ItemComparator implements Comparator<Item>{

    public int compare(Item a, Item b){
        double r1 = (double) a.value / (double) a.weigh;
        double r2 = (double) b.value / (double) b.weigh;
        if(r1<r2) return 1;
        else if(r1>r2) return -1;
        else return 0;
    }
}