package A2ZDSA.LinkList.MediumProblemOn_DLL;

public class DeleteDuplicate_in_DLL {

    public static Node deleteDuplicate(Node head){
        Node temp = head;
        while(temp !=null && temp.next != null){
            Node nextNode = temp.next;
            while( nextNode !=null && nextNode.data == temp.data){
                nextNode = nextNode.next;
            }
            temp.next = nextNode;
            if(nextNode !=null) {
                nextNode.prev = temp;
                temp = temp.next;
            }
        }
        return head;
    }
}
