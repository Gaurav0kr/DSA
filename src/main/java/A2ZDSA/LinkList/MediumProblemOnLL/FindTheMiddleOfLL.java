package A2ZDSA.LinkList.MediumProblemOnLL;
class Node{
    int data;
    Node next;
    Node()
    {

    }
    Node(int data1, Node next1)
    {
        this.data = data1;
        this.next = next1;
    }
    Node(int data1){
        this.data = data1;
        this.next= null;
    }

}
public class FindTheMiddleOfLL {

    private static Node convertArr2DLL(int[] arr) {
        // create head node with the first element of Array
        Node head = new Node(arr[0]);
        Node mover = head;

        for(int i=1;i<arr.length;i++)
        {
            Node temp = new Node(arr[i]);
            mover.next= temp;
            mover = temp;
        }
        return head;
    }
    private static void print(Node head) {
        while(head != null)
        {
            // print data into current Node
            System.out.print(head);
            // move to the next node
            head = head.next;
        }
    }
    public static Node findMiddleNode(Node head){

        int length = 0;
        Node temp = head;
        while(temp!=null)
        {
            length++;
            temp = temp.next;
        }
        temp = head;
        for(int i =0;i<length/2;i++)
            temp = temp.next;
        return temp;
    }
    // Optimal solution using slow and fast pointer
    public static Node findMiddleNode_optimal(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next !=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 8,1};
        Node head = convertArr2DLL(arr);
    //    head = findMiddleNode(head);
        head = findMiddleNode_optimal(head);
        System.out.print(head.data);
    }
}
