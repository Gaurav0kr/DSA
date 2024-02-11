package A2ZDSA.Array;

import java.util.ArrayList;

public class LeadersinArray {

    public static ArrayList<Integer> findLeader(int[] arr)
    {
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;

        for(int i=0;i<n;i++)
        {
            boolean leader = true;
            //Checking whether arr[i] is greater than all
            //the elements in its right side

            for(int j = i+1;j<n;j++)
            {
                if(arr[j]>arr[i])
                {
                    // If any element found is greater than current leader
                    // curr element is not the leader.

                    leader=false;
                    break;
                }

            }
            if(leader)
                list.add(arr[i]);
        }
        return  list;
    }
    public static ArrayList<Integer> findLeader_Optimal(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int max= arr[n-1];
        ans.add(arr[n-1]);
        for(int i=n-2;i>0;i--)
        {
            if(arr[i]> max)
            {
                ans.add(arr[i]);
                max = arr[i];
            }
        }
        return ans;
    }
    public static void main(String args[])
    {
        int arr[]=  {10, 22, 12, 3, 0, 6};
  //      ArrayList<Integer> ans= findLeader(arr); // O(N2) , O(N)
        ArrayList<Integer> ans = findLeader_Optimal(arr); // O(N) , O(N)
        for(int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}
