package A2ZDSA.LinkList.MediumProblemOn_DLL;


import java.util.ArrayList;
import java.util.List;

public class Find_pairs_with_given_sum_in_DLL {

    public static List<List<Integer>> findPair(Node head, int sum){

        Node temp1 = head;
        List<List<Integer>> ans = new ArrayList<>();

        while(temp1 !=null){
            List<Integer> list = new ArrayList<>();
            Node temp2 = temp1.next;
            while(temp2 != null && (temp1.data +temp1.data <=sum)){
                if(temp1.data + temp2.data == sum){
                    list.add(temp1.data);
                    list.add(temp2.data);
                }
                temp2 = temp2.next;
            }
            ans.add(list);
            temp1 = temp1.next;
        }
        return ans;
    }
    // Optimal solution using two pointer
    public static List<List<Integer>> findPair_Optimal(Node head, int sum){
        Node left = head;
        Node right = findTail(head);
        List<List<Integer>> ans = new ArrayList<>();
        while(left.data < right.data){
            List<Integer> list = new ArrayList<>();
            if(left.data + right.data == sum){
                list.add(left.data );
                list.add(right.data );
                left = left.next;
                right = right.prev;
            }
            else if(left.data + right.data < sum){
                left = left.next;
            }else right = right.prev;
            ans.add(list);
        }

        return ans;
    }
    public static Node findTail(Node head){
        Node tail = head;
        while(tail.next !=null)
            tail=tail.next;
        return tail;
    }
}
