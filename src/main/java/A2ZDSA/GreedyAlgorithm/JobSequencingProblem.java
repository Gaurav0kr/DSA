package A2ZDSA.GreedyAlgorithm;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

class job{
    int jobId;
    int deadline;
    int profit;
    job(int jobId,int deadline,int profit){
        this.jobId = jobId;
        this.deadline=deadline;
        this.profit=profit;
    }
}

public class JobSequencingProblem {
    public static int[] jobScheduling(job[] arr, int n){

        Arrays.sort(arr, (a, b) -> (b.profit - a.profit));
        int maxi=0;
        for(int i=0;i<n;i++){
            if(arr[i].deadline > maxi)
                maxi= arr[i].deadline;
        }
        int result[] = new int[maxi+1];
        for(int i=1;i <=maxi;i++){
            result[i] =-1;
        }
        int countJob =0, jobProfit=0;
        for(int i=0;i<n;i++) {
            for (int j = arr[i].deadline;j>0;j--){
                if(result[j]==-1){
                    result[j]=i;
                    countJob++;
                    jobProfit += arr[i].profit;
                    break;
                }
            }
        }
        int[] ans = new int[2];
        ans[0] =countJob;
        ans[1] = jobProfit;
        return ans;
    }
    public static void main(String[] args) throws IOException {

        //size of array
        job[] arr = new job[4];
        arr[0] = new job(1, 4, 20);
        arr[1] = new job(2, 1, 10);
        arr[2] = new job(3, 2, 40);
        arr[3] = new job(4, 2, 30);

        //function call
        int[] res = jobScheduling(arr, 4);
        System.out.println(res[0] + " " + res[1]);

    }
}
