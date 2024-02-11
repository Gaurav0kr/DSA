package A2ZDSA.LinkList.MediumProblemOnLL;

import java.util.ArrayList;

public class OddEvenLinkedList {

    // Optimal solution
    public Node oddEvenList(Node head) {
        // without using extra space
        if(head ==null || head.next ==null)
            return head;
        Node odd = head, even = head.next, evenHead = head.next;
        while(even !=null && even.next != null)
        {
            odd.next = odd.next.next;
            even.next = even.next.next;

            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;

        return head;
    }
    // Brute Force

    public Node oddEvenList_Brute(Node head) {

        if(head ==null || head.next ==null)
            return head;

        ArrayList<Integer> arr = new ArrayList<>();
        Node temp = head;

        while(temp !=null && temp.next !=null)
        {
            arr.add(temp.data);
            temp = temp.next.next;
        }
        if(temp!=null)
            arr.add(temp.data);

        // now add even node data
        temp = head.next;
        while(temp !=null && temp.next !=null)
        {
            arr.add(temp.data);
            temp= temp.next.next;
        }
        if(temp!=null)
            arr.add(temp.data);

        int i=0; temp = head;
        while(temp !=null){
            temp.data = arr.get(i);
            i++;
            temp = temp.next;
        }
        return head;
    }
}
