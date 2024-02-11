package A2ZDSA.LinkList.Two_D_LinkList;

class Node{
    int data;
    Node next;
    Node back;

    Node(int data1,Node next1, Node back1)
    {
        this.data = data1;
        this.next =  next1;
        this.back = back1;
    }
    Node(int data1) {
        this.data = data1;
        this.next = null;
        this.back = null;
    }
}
public class DoublyLinkedList_1 {
    private static Node convertArrToDL(int[] arr) {
        Node head = new Node(arr[0]);
        Node prev = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    static void print(Node head) {
        while (head != null) {
            System.out.println(" prining head : " + head.data);
            head = head.next;
        }

    }

    private static Node deleteHead(Node head) {
        if (head == null || head.next == null)
            return null;

        Node prev = head;
        head = head.next;
        head.back = null;
        prev.next = null;

        return head;
    }

    private static Node deleteTail(Node head) {
        if (head == null || head.next == null)
            return null;

        Node tail = head;
        while (tail.next != null)
            tail = tail.next;

        Node newTail = tail.back;
        newTail.next = null;
        tail.back = null;

        return head;
    }

    private static Node deleteKthNode(Node head, int k) {
        if (head == null)
            return null;
        int count = 0;
        Node kNode = head;

        while (kNode != null) {
            count++;
            if (count == k) break;
            kNode = kNode.next;
        }

        Node prev = kNode.back;
        Node front = kNode.next;

        if (prev == null && front == null)
            return null;
        else if (prev == null)
            return deleteHead(head);
        else if (front == null)
            return deleteTail(head);

        prev.next = front;
        front.back = prev;

        kNode.next = null;
        kNode.back = null;
        return head;

    }

    private static void deleteNode(Node temp) {
        Node prev = temp.back;
        Node front = temp.next;

        if (front == null) {
            prev.next = null;
            temp.back = null;
        }
        prev.next = front;
        front.back = prev;

        temp.next = null;
        temp.back = null;
    }

    private static Node insertBeforeHead(Node head, int num) {
        Node newNode = new Node(num, head, null);
        head.back = newNode;

        return newNode;
    }

    private static Node insertBeforeTail(Node head, int num) {
        if (head.next == null) {
            return insertBeforeHead(head, num);
        }
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        Node prev = tail.back;
        Node newNode = new Node(num, tail, prev);
        prev.next = newNode;
        tail.back = newNode;

        return head;
    }

    private static Node insertBeforeKthNode(Node head, int num,int k) {

        Node temp = head;
        int count =0;
        while(temp !=null) {
            count++;
            if (count == k)
                break;
            temp = temp.next;
        }
       Node prev = temp.back;

        Node newNode = new Node(num,temp,prev);
        if(k==1)
            return insertBeforeHead(temp,num);
        prev.next = newNode;
        temp.back=newNode;
     return head;
}
    public static void main(String[] args) {
        int[] arr = {2,5,4,1};
        Node head = convertArrToDL(arr);
   //     head = deleteHead(head);
   //     Node tail = deleteTail(head);
   //     Node kNode = deleteKthNode(head,3);
   //     deleteNode(head.next.next);
   //    head = insertBeforeHead(head,2);
   //   head = insertBeforeTail(head,14);
      head = insertBeforeKthNode(head,15,1);
        print(head);
    }
}
