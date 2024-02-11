package A2ZDSA.LinkList.One_D_LinkList;

class Node
{
    int data;
    Node next;
    Node(int data1, Node next1)
    {
        this.data = data1;
        this.next = next1;
    }
    Node(int data1)
    {
        this.data = data1;
        this.next = null;
    }
}
public class FirstLinkList_Class {

    public static void main(String[] args)
    {
        int[] arr = {2,5,3,8};
        Node y = new Node(arr[2]);
        System.out.print(y.next);
    }
}
