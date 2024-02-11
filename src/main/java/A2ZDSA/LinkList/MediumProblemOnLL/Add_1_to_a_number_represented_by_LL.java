package A2ZDSA.LinkList.MediumProblemOnLL;

public class Add_1_to_a_number_represented_by_LL {

    public static Node reverseLL(Node head){
        Node temp = head;
        Node prev = null;

        while(temp != null)
        {
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
    public static Node addOne(Node head){
        head = reverseLL(head);
        Node temp = head;
        int carry =1;
        while(temp != null){
            temp.data = temp.data +carry;
            if(temp.data <10){
                carry =0;
                break;
            }
            else{
                temp.data =0;
                carry=1;
            }
            temp = temp.next;
        }
        if(carry==1){
            Node newNode = new Node(1);
            head = reverseLL(head);
            newNode.next = head;
            return newNode;
        }
        else
            head = reverseLL(head);
        return head;
    }
    // Optimal solution
    public static int helper(Node temp){
        if(temp == null)
            return 1;
        int carry = helper(temp.next);
        temp.data += carry;
        if(temp.data <10) return 0;
        temp.data =0;
        return 1;
    }
    public static Node addOne_Optimal(Node head){
        int carry = helper(head);
        if(carry ==1) {
            Node newHead = new Node(1);
            newHead.next = head;
            head = newHead;
        }
        return head;
    }
}

