package A2ZDSA.LinkList.MediumProblemOnLL;

import java.util.Stack;

public class Reverse_Linked_List {

    public static Node convertArrtoLL(int arr[]){

        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1;i<arr.length;i++)
        {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    public static Node reverseLL(Node head){

        Node temp = head;
        Stack<Integer> st = new Stack<>();
        while(temp != null)
        {
            st.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while(temp != null)
        {
            temp.data = st.pop();
            temp = temp.next;
        }
        return head;
    }
    public static void print(Node head)
    {   Node temp = head;
        while(temp !=null)
        {
            System.out.print(temp.data);
            temp = temp.next;
        }
        System.out.println();
    }
    public static Node reverseLL_Optimal1(Node head){
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
    //using recursion
    public static Node reverseLL_Recursive(Node head){
        if(head == null || head.next ==null)
            return head;
        Node newHead = reverseLL_Recursive(head.next);
        Node front = head.next;
        front.next = head;
        head.next= null;

        return newHead;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 8, 1};
        Node head = convertArrtoLL(arr);
        print(head);
//        head = reverseLL(head);
//        head = reverseLL_Optimal1(head);
        head = reverseLL_Recursive(head);
         print(head);

    }
}
