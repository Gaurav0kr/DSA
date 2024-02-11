package A2ZDSA.LinkList.MediumProblemOnLL;

import java.util.HashSet;

public class StartingPointofCyclein_LL {
    public Node StartingPoint(Node head) {
        HashSet<Node> hashTable = new HashSet<>();

        while(head !=null)
        {
            if( hashTable.contains(head))
                return head;
            hashTable.add(head);
            head = head.next;
        }
        return null;
    }
    public Node StartingPoint_Optimal(Node head) {

        if(head==null || head.next==null)
            return null;
        Node slow = head;
        Node fast = head;
        Node entry = head;

        while(fast !=null && fast.next.next !=null)
        {
            slow = slow.next;
            fast = fast.next.next;

            if(slow==fast)
            {
                while(entry !=slow)
                {
                    entry = entry.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null;
    }
}
