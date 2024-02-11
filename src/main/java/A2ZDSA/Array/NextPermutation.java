package A2ZDSA.Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NextPermutation {

    public static List<Integer> findNextPermu_Optimal(List<Integer> A)
    {
        int index=-1;
        int n = A.size();
        for(int i= n-2;i>=0;i--)
        {
            if(A.get(i) <A.get(i+1))
            {
                index =i;
                break;
            }
        }
        //If break point doesNot exist
        if(index==-1)
        {
            Collections.reverse(A);
            return A;
        }
        //Find next greater element and swap with index element
        for(int i=n-1;i>index;i--)
        {
            if(A.get(i)>A.get(index))
            {
                int temp = A.get(i);
                A.set(i,A.get(index));
                A.set(index,temp);
                break;
            }
        }
        // Reverse the right half
        List<Integer> subList = A.subList(index+1,n);
        Collections.reverse(subList);

        return A;
    }
    public static void main(String args[]) {
        List<Integer> A = Arrays.asList(new Integer[] {2, 1, 5, 4, 3, 0, 0});
        List<Integer> ans = findNextPermu_Optimal(A);

        System.out.print("The next permutation is: [");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println("]");

    }
}
