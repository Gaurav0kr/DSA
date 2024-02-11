package A2ZDSA.LinkList.MediumProblemOnLL;

import java.util.HashSet;

public class LinkListCycle {
    public boolean hasCycle(Node head) {

        HashSet<Node> hashTable = new HashSet<>();
        while(head != null)
        {
            if(hashTable.contains(head))
                return true;
            hashTable.add(head);
            head = head.next;
        }
        return false;
    }
    // Optimal
    public boolean hasCycle_Optimal(Node head) {

        Node slow= head, fast = head;
        while(fast !=null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast)
                return true;
        }
        return false;
    }
}
