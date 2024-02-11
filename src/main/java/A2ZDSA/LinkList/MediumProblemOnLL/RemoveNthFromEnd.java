package A2ZDSA.LinkList.MediumProblemOnLL;

public class RemoveNthFromEnd {
    public Node removeNthFromEnd(Node head, int n) {

        Node start = new Node();
        start.next = head;
        Node slow = start;
        Node fast = start;

        for(int i =1;i<=n;i++)
            fast = fast.next;

        while(fast.next !=null){

            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;

        return start.next;
    }
}
