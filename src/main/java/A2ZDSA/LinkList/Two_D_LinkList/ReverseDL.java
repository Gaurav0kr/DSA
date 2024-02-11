package A2ZDSA.LinkList.Two_D_LinkList;

import java.util.Stack;

public class ReverseDL {

    private static Node convertArr2DLL(int[] arr) {
        // Create the head node with the first element of the array
        Node head = new Node(arr[0]);
        // Initialize 'prev' to the head node
        Node prev = head;

        for(int i =1;i<arr.length;i++)
        {
            // Create a new node with data from the array and set its 'back' pointer
            // to the previous node
            Node temp = new Node(arr[i],null,prev);
            // Update the 'next' pointer of the previous node to point to the new node
            prev.next = temp;
            // Move 'prev' to the newly created node for the next iteration
            prev = temp;
        }
        return head;
    }
    private static void print(Node head) {
        while(head != null){
            // Print the data in the current node
            System.out.print(head.data + " ");
            // Move to the next node
            head = head.next;
        }
        System.out.println();
    }
    public static Node reverseDL(Node head){

        // Initialise a stack st
        Stack<Integer> st = new Stack<>();
        // Initialise the node pointer temp at head
        Node temp = head;
        // Traverse the doubly linked list via the temp pointer
        while(temp != null)
        {
            // insert the data of the current node into the stack
            st.push(temp.data);
            // traverse further
            temp = temp.next;
        }
        // Reinitialise temp to head
        temp = head;
        // Second iteration of the DLL to replace the values
        while (temp !=null)
        {
            // Replace the value pointed via temp with
            // the value from the top of the stack and pop i
            temp.data = st.pop();
            // traverse further
            temp = temp.next;
        }
        return head;
    }
    public static Node reverseDL_inOnePass(Node head){

        if(head ==null || head.next==null)
            return head;
        Node prev = null;
        Node current = head;
        while(current !=null)
        {
            prev = current.back;
            current.back = current.next;
            current.next = prev;

            current = current.back;
        }
        return prev.back;
    }
    public static void main(String[] args) {
        int[] arr = {12, 5, 6, 8, 4};
        // Convert the array to a doubly linked list
        Node head = convertArr2DLL(arr);

        // Print the doubly linked list
        System.out.println("Doubly Linked List Before Reversing :");
        print(head);

        System.out.println("Doubly Linked List After Reversing -:");

    //    head = reverseDL(head);
        head = reverseDL_inOnePass(head);
        print(head);

    }
}
