package A2ZDSA.LinkList.MediumProblemOn_DLL;

class Node{
    int data;
    Node next;
    Node prev;

    Node(int data1, Node next1, Node back1)
    {
        this.data = data1;
        this.next =  next1;
        this.prev = back1;
    }
    Node(int data1) {
        this.data = data1;
        this.next = null;
        this.prev = null;
    }
}

public class Delete_all_occurrences_of_a_key_in_DLL {

    public static Node deleteNode(Node head, int key)
    {
        Node temp = head;
        while(temp !=null) {

            if (temp.data == key){
                if(temp==head)
                    head = head.next;
                Node nextNode = temp.next;
                Node prevNode = temp.prev;
                if(nextNode !=null) nextNode.prev = prevNode;
                if(prevNode !=null) prevNode.next = nextNode;
                temp = nextNode;
            }
            else
                temp = temp.next;
        }
        return head;
    }
}
