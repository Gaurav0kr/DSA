package A2ZDSA.Array;

import java.util.ArrayList;
import java.util.List;

public class MajorityOfElement2 {

    public static List<Integer> majority_Optimal(int[] arr)
    {
       int n = arr.length;
       int count1 =0, count2 =0;
       int el1 = Integer.MIN_VALUE, el2 = Integer.MIN_VALUE;
       List<Integer> ansList = new ArrayList<>();

       for(int i=0;i<n;i++)
       {
           if(count1 ==0 && el2 !=arr[i])
           {
               count1 =1; el1 = arr[i];
           }
           else if(count2==0 && el1 !=arr[i])
           {
               count2 =1; el2 = arr[i];
           } else if (arr[i]==el1) {
               count1++;
           }
           else if (arr[i]==el2) {
               count2++;
           }
           else{
               count1--;
               count2--;
           }
       }
       count1=0; count2=0;
               for(int i=0;i<n;i++)
               {
                  if(arr[i]==el1)
                      count1++;
                  else if (arr[i]==el2) {
                      count2++;
                  }
               }
               int min = (int)(n/3) +1;
               if(count1>=min)
                   ansList.add(el1);
               if(count2>=min)
                   ansList.add(el2);
    return ansList;
    }
    public static void main(String args[]) {
        int[] arr = {11, 33, 33, 11, 33, 11};
        List<Integer> ans = majority_Optimal(arr);
        System.out.print("The majority elements are: ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }
}
