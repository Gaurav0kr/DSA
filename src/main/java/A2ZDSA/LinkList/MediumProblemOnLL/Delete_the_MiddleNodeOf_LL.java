package A2ZDSA.LinkList.MediumProblemOnLL;

public class Delete_the_MiddleNodeOf_LL {

    public Node deleteMiddle(Node head) {

        Node temp = head;
        int n =0;
        while(temp != null)
        {
            n++;
            temp = temp.next;
        }
        int res = n/2;
        temp = head;
        while(temp !=null) {
            res--;
            if(res==0)
            {
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
        return head;
    }
    public Node deleteMiddle_Optimal(Node head) {

        Node slow = head;
        Node fast = head.next.next;

        while(fast != null & fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;

        return head;
    }
}
