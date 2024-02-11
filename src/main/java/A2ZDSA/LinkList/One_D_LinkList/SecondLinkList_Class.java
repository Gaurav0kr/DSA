package A2ZDSA.LinkList.One_D_LinkList;

public class SecondLinkList_Class {

    private static Node convertArrToLL(int[] arr)
    {
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
    public static void main(String[] args)
    {
        int[] arr = {2,5,3,8};
        Node head = convertArrToLL(arr);
/*        System.out.println(" prining head : "+head);
        System.out.println(" prining head data : "+head.data);
        System.out.println(head.next);*/
/*
        Node temp = head;
        while(temp !=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }*/
        System.out.println(lengthOfLL(head));
        System.out.println(checkIf_K_is_present(head,3));


    }
    public static int lengthOfLL(Node head)
    {
        int cnt =0;
        Node temp = head;
        while(temp !=null)
        {
            temp = temp.next;
            cnt++;
        }
        return cnt;
    }
    public static boolean checkIf_K_is_present(Node head, int k)
    {
        Node temp = head;
        while(temp !=null)
        {
            if(temp.data==k)
                return true;
            temp = temp.next;

        }
        return false;
    }
}
