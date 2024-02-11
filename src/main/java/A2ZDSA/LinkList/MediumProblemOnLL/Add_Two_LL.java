package A2ZDSA.LinkList.MediumProblemOnLL;

public class Add_Two_LL {

    public static Node addTwo(Node l1, Node l2){

        int carry =0;
        Node t1 =l1, t2= l2;
        Node dummyNode = new Node(-1);
        Node current = dummyNode;
        while( t1 !=null || t2 !=null){

            int sum = carry;
            if(t1 != null) sum += t1.data;
            if(t2 != null) sum += t2.data;
            Node newNode = new Node(sum %10);
            carry = sum/10;

            current.next = newNode;
            current = current.next;
            if(t1 != null) t1= t1.next;
            if(t2 != null) t2 = t2.next;
        }
        if(carry !=0){
            Node newNode = new Node(carry);
            current.next = newNode;
        }
        return dummyNode.next;
    }
}
